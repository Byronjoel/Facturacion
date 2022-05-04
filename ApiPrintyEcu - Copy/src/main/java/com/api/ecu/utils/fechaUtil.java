package com.api.ecu.utils;

import java.util.Calendar;
import java.util.Date;
public class fechaUtil {

	public String fecha(Date fechas) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fechas);
		int dia = cal.get(Calendar.DAY_OF_WEEK);
		int mes=cal.get(Calendar.MONTH);
		String d = "";
		String m="";
	
		int anio=cal.get(Calendar.YEAR);
		int dia_mes=cal.get(Calendar.DAY_OF_MONTH);
		String observacion="";
		String Dia[] = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
		String Mes[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
	   
		if (dia >= 1 && dia <= 7)
			d = Dia[dia - 1];		
		if (mes >= 1 && mes <= 12)
			m = Mes[mes];	
		return observacion=d+", "+m+" "+dia_mes+","+anio;

	}


}
