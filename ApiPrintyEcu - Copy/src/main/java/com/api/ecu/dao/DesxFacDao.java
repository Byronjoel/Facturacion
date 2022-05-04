package com.api.ecu.dao;
import java.util.ArrayList;
import java.util.List;

import com.api.ecu.models.DesxFac;
public interface DesxFacDao {

	List<DesxFac> getDetalle();
	
	DesxFac detallefactura(String sri_Id);
	
	ArrayList<DesxFac> listaDetalle(String nro_ord);
	
	
}
