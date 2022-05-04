package com.api.ecu.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.api.ecu.models.Ava_LisFac;
import com.api.ecu.models.DesxFac;
import com.api.ecu.models.LisCaj;
import com.api.ecu.models.LisFac;
import com.api.ecu.models.LisOrd;
import com.api.ecu.models.LisPag;
import com.api.ecu.models.LisSeg;
import com.api.ecu.service.Ava_ListFacService;
import com.api.ecu.service.DesxFacService;
import com.api.ecu.service.LisAnaService;
import com.api.ecu.service.LisCajService;
import com.api.ecu.service.LisFacService;
import com.api.ecu.service.LisOrdService;
import com.api.ecu.service.LisPagService;
import com.api.ecu.service.LisSegService;
import com.api.ecu.utils.BadRequestException;
import com.api.ecu.utils.NotFoundException;
import com.api.ecu.utils.fechaUtil;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AvaLisFacController {



	
	public final LisOrdService lisordService;
	public final LisFacService lisfacService;
	public final LisAnaService lisanaService;
	public final DesxFacService desxfacService;
	public final Ava_ListFacService ava_lisfacService;
	public final LisSegService lissegService;
	private LisCajService liscajService;
    private LisPagService lispagService;
    




	public AvaLisFacController(LisOrdService lisordService, LisFacService lisfacService, LisAnaService lisanaService,
			DesxFacService desxfacService, Ava_ListFacService ava_lisfacService, LisSegService lissegService,
			LisCajService liscajService, LisPagService lispagService) {
		super();
		this.lisordService = lisordService;
		this.lisfacService = lisfacService;
		this.lisanaService = lisanaService;
		this.desxfacService = desxfacService;
		this.ava_lisfacService = ava_lisfacService;
		this.lissegService = lissegService;
		this.liscajService = liscajService;
		this.lispagService = lispagService;
	}


	@RequestMapping(path = "/factura", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> getPaciente(@RequestBody LisOrd orden) // Objeto donde recibo los valores del json
	{
		fechaUtil objFecha = new fechaUtil();
		String Observacion = "";
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();
		JSONObject jsonObject3 = new JSONObject();
		JSONObject jsonObject4 = new JSONObject();
		ArrayList<LisFac> lisfac;
        Double sum=0.00;
		if (orden.getNroOrd() != null) {
			LisOrd Orden = lisordService.Orden(orden.getNroOrd());

			if (Orden!=null && Orden.getSts_ord().equals("IM")) {
				String fecha = objFecha.fecha(Orden.getFec_ent());
				Ava_LisFac facturas = ava_lisfacService.factura(Orden.getCodPac());                               // Busco datos de fac ant o datos paciente
               int cantidaddeFacturas=ava_lisfacService.verificarFacturado(Orden.getNroOrd());
				LisSeg seguro=lissegService.finByCodSeg(Orden.getCod_seg());                                    //Busco el Tipo de seguro
                 LisCaj caja=liscajService.findByCodigoPago(Orden.getNroOrd());                                 //Busco el tipo de Pago
                 
                 if(caja!=null)
                 {
                	 LisPag detallePago=lispagService.findByDescripcionPago(caja.getCod_pag());
				if (facturas != null) {
					lisfac = lisfacService.listafact(orden.getNroOrd());  // busco detalles por # orden  cambio

					if (!lisfac.isEmpty()) {

						if (Orden.getUrgente().equals("S")) {
							Observacion = "(1)ORDEN DE ANALISIS CLINICOS N°" + Orden.getNroOrd()
									+ "\nRealizados de manera URGENTE el " + fecha + "\nA" + " "
									+ facturas.getSri_comprador();
						} else {

							Observacion = "(1)ORDEN DE ANALISIS CLINICOS N°" + Orden.getNroOrd() + "\nRealizados el "
									+ fecha + "\nA" + " " + facturas.getSri_comprador();

						}

						if (!lisfac.isEmpty()) {
							for (int x = 0; x < lisfac.size(); x++) {
								String nombre = "";
								JSONObject jsonObject = new JSONObject();
								nombre =  lisanaService.getAnalisis(lisfac.get(x).getCodigo());   // lisanaDao.getAnalisis(lisfac.get(x).getCodigo());
								jsonObject.put("Codigo", lisfac.get(x).getCodigoFac());								
								jsonObject.put("orden", lisfac.get(x).getNroOrd());
								jsonObject.put("Descripcion", nombre);
								jsonObject.put("precio unitario", lisfac.get(x).getPrecio());
								jsonObject.put("Importe", lisfac.get(x).getImpPac());
								jsonObject.put("Estado Tecnico", lisfac.get(x).getStsFac());
								jsonObject.put("Tipo", lisfac.get(x).getTipo());  //Quemado
								sum=sum+lisfac.get(x).getPrecio();
								
								jsonArray.put(jsonObject);
							}

						}
						// LLega los datos de la empresa, pto emision, sri_estable
						
						BigDecimal total = new BigDecimal(sum);
						total = total.setScale(2, RoundingMode.HALF_UP);
						jsonObject1.put("id_fac",cantidaddeFacturas );	
						jsonObject1.put("lock_fxo",2 );	 				
						jsonObject1.put("Print_ok",1 );	 
						jsonObject1.put("facturados",cantidaddeFacturas );				
						jsonObject1.put("Pago", detallePago.getDes_pag());							
						jsonObject1.put("Seguro", seguro.getNombre());	
						jsonObject1.put("Total", total);			
						jsonObject1.put("Código", Orden.getCodPac());	
						jsonObject1.put("nro_ord", Orden.getNroOrd());
						jsonObject1.put("Fecha", Orden.getFec_ent());
						jsonObject1.put("Direccion", facturas.getDir_fac());
						jsonObject1.put("Observacion", Observacion);
						jsonObject1.put("Documento", facturas.getSriDoccompra());
						jsonObject1.put("Nombre", facturas.getSri_comprador());
						jsonObject1.put("Email", facturas.getMail_fac());
						jsonObject1.put("Telefono ", facturas.getTel_fac());
						jsonObject1.put("Tipo Identificacion ", facturas.getSri_tipo());	
						jsonObject1.put("Codigo Cliente ", facturas.getCodCli());	
						jsonObject1.put("Tipo Documento", facturas.getTip_doc()); //llega base
						jsonObject1.put("analisis", jsonArray);
						jsonObject2.put("orden", jsonObject1);
						jsonObject3.put("descripcion", jsonObject2);								
						jsonObject3.put("code", 1);
						jsonObject4.put("response", jsonObject3);
						System.out.println("Observacionesss" + Observacion);
						
						return new ResponseEntity<>(jsonObject4.toString(), HttpStatus.OK);
					}
					
					 throw new NotFoundException("No existe detalles");
				}
				 throw new NotFoundException("No existe datos de la Persona");
                 }
                 throw new NotFoundException("No existe Pago");
			}
			 throw new NotFoundException("Verifique el estado de la Orden");
		}

		 throw new NotFoundException("Ingrese el número de Orden");

	}

	
	@RequestMapping(path = "/detallefactura", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?>  Prueba(@RequestBody DesxFac detalle) {
		JSONArray jsonArray = new JSONArray();		
		ArrayList<DesxFac> detalleBuscado;
		if(detalle.getNroOrd()!=null)
		{
			detalleBuscado = desxfacService.listaDetalle(detalle.getNroOrd());
			if (!detalleBuscado.isEmpty()) {
				for (int x = 0; x < detalleBuscado.size(); x++) {
					JSONObject jsonObject = new JSONObject();
					
			jsonObject.put("sri_id", detalleBuscado.get(x).getSriId());
			jsonObject.put("cod_ana", detalleBuscado.get(x).getCodAna());
			jsonObject.put("fec_ini", detalleBuscado.get(x).getFecIni());
			jsonObject.put("precio", detalleBuscado.get(x).getImpPac());
			jsonObject.put("nro_ord", detalleBuscado.get(x).getNroOrd());
			jsonArray.put(jsonObject);
				
		}
				return new ResponseEntity<>(jsonArray.toString(), HttpStatus.OK);
			}
				
			 throw new NotFoundException("No existe detalles de la factura");
		}
		
		 throw new BadRequestException("Ingrese el dato");
	}
}
