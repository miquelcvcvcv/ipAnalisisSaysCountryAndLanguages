package com.ipAnalisisSaysCountryAndLanguages.Service;

//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestParam;

import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatge;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdiomaMillorat;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaObtenirIdiomesPais;

public interface MailAttacherService
{
		
	public RespostaObtenirIdiomesPais obtenirIdiomesIP(String IP) throws Exception;
	
	
	public RespostaMissatge obtenirMissatgeIdioma(String idioma, Short numeroMissatge)throws Exception;

	public RespostaMissatgesIdiomaMillorat obtenirMissatgesIdioma(String idioma)throws Exception;
}
