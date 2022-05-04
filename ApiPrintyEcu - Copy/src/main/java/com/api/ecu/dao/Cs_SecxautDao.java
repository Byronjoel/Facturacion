package com.api.ecu.dao;

import com.api.ecu.models.Cs_Secxaut;

public interface Cs_SecxautDao {

	Cs_Secxaut secuencia(int cod_suc, String Tip_doc, int pto_emi, int sri_estab);
	
}
