package com.ipAnalisisSaysCountryAndLanguages.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.ipAnalisisSaysCountryAndLanguages.Model.IPUsuari;

import com.ipAnalisisSaysCountryAndLanguages.Model.Resposta;

import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatge;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdiomaMillorat;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaObtenirIdiomesPais;
import com.ipAnalisisSaysCountryAndLanguages.Service.MailAttacherService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class MailAttacherController
{
	@Autowired
	MailAttacherService mailAttacherService;
	


	private static Logger logger = LoggerFactory.getLogger(MailAttacherController.class);



	
	
	
	 @PostMapping("/client-ip")/*Creo no hace falta el idioma*/
	    public ResponseEntity<Resposta>  getClientIp(HttpServletRequest request) throws Exception{
		 
		 	
	        String clientIP = null;
	        Resposta resposta=new Resposta();
	        
	        clientIP=request.getHeader("X-Forwarded-For");
	        
	        if (clientIP==null ||clientIP.isEmpty())
	        {
	        clientIP=request.getRemoteAddr();
	        }
	        
	        if (clientIP==null ||clientIP.isEmpty())
	        {
	            resposta.setError(true);
		        resposta.setMissatge("IP no encontrada");
		        Short indexMissatge=71;
		        resposta.setMissatgeIndex(indexMissatge);
	        }
	        else
	        {
	        IPUsuari IPusuari=new IPUsuari(clientIP, "usuari" );
	        //resposta = mailAttacherService.obtenirIdiomes(IPusuari);
	        resposta.setError(false);
	        resposta.setMissatge(clientIP);
	        Short indexMissatge=0;
	        resposta.setMissatgeIndex(indexMissatge);	        
	        }
	        
	        System.out.println("CLIENTIP final");
	        System.out.println("CLIENTIP "+clientIP);
	       // System.out.println("Ususari"+usuari);

	        
	        return ResponseEntity.ok(resposta);
	    }
	 
	

	 
	 //Crec aqui no va el idioma
	 @GetMapping(value = "/obtenirIdiomesPaisIP")//No tiene idioma xk es la primera funcio que dona el idioma
			public ResponseEntity<RespostaObtenirIdiomesPais> obtenirIdiomesPais(@RequestParam(value = "ip") String ip)
					throws Exception
			{

				System.out.println("obtenirIdiomes");
				
			      RespostaObtenirIdiomesPais resposta = mailAttacherService.obtenirIdiomesIP(ip);
				//emailAttacherService.obtenirIdiomes();

				return ResponseEntity.ok(resposta);
			}
	 
	 
	 
	 
	 @GetMapping(value = "/obtenirMissatgeIdioma" )
		public ResponseEntity<RespostaMissatge> obtenirMissatgeIdioma(@RequestParam(value = "idioma") String idioma,  @RequestParam(value = "numeroMissatge") Short numeroMissatge)
				throws Exception
		{

			System.out.println("obtenirMissatgeIdiomes");
			
		
			RespostaMissatge resposta = mailAttacherService.obtenirMissatgeIdioma(idioma, numeroMissatge);
			
			System.out.println(" fi obtenirMissatgeIdiomes");

			return ResponseEntity.ok(resposta);
		}
	 
	 
	 @GetMapping(value = "/obtenirMissatgesIdioma" )
		public ResponseEntity<RespostaMissatgesIdiomaMillorat> obtenirMissatgesIdioma(@RequestParam(value = "idioma") String idioma)
				throws Exception
		{

			System.out.println("obtenirMissatgesIdiomes");
			
			RespostaMissatgesIdiomaMillorat resposta = mailAttacherService.obtenirMissatgesIdioma(idioma);
			
			System.out.println("fi obtenirMissatgesIdiomes");

			return ResponseEntity.ok(resposta);
		}
	 
}

