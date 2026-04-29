package com.ipAnalisisSaysCountryAndLanguages.DAO;


import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatge;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdioma;

public interface MailAttacherDAO
{
	public RespostaMissatge getMissatgeIdioma(String idioma ,Short numeroMissatge)throws Exception;
	
	public RespostaMissatgesIdioma getMissatgesIdioma(String idioma)throws Exception;

	public String getMissatgeIdiomaSimple(String idioma, Short numeroMissatge )throws Exception;
	
}
