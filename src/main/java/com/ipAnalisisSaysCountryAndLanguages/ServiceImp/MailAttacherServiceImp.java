package com.ipAnalisisSaysCountryAndLanguages.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ipAnalisisSaysCountryAndLanguages.Controller.MailAttacherController;
import com.ipAnalisisSaysCountryAndLanguages.DAO.MailAttacherDAO;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.Usuari;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.UsuariIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.CodiUsuari;
import com.ipAnalisisSaysCountryAndLanguages.Model.CodiUsuariPassword;
import com.ipAnalisisSaysCountryAndLanguages.Model.EmailInformacio;
import com.ipAnalisisSaysCountryAndLanguages.Model.IPUsuari;
import com.ipAnalisisSaysCountryAndLanguages.Model.Idioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.IdiomaPrincipalTraduit;
import com.ipAnalisisSaysCountryAndLanguages.Model.IdiomaSimple;
import com.ipAnalisisSaysCountryAndLanguages.Model.IdiomesPrincipalsTraduits;
import com.ipAnalisisSaysCountryAndLanguages.Model.Login;
import com.ipAnalisisSaysCountryAndLanguages.Model.MissatgesIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.PaisIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.PaisosIdiomes;
import com.ipAnalisisSaysCountryAndLanguages.Model.Registre;
import com.ipAnalisisSaysCountryAndLanguages.Model.Resposta;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatge;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdiomaMillorat;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaObtenirIdiomesPais;
import com.ipAnalisisSaysCountryAndLanguages.Service.MailAttacherService;

import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
//import java.util.LinkedList;
/*
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
*/
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/*
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
*/


//import javax.servlet.ServletContext;
/*
import org.simplejavamail.utils.mail.dkim.Canonicalization;
import org.simplejavamail.utils.mail.dkim.DkimMessage;
import org.simplejavamail.utils.mail.dkim.DkimSigner;
import org.simplejavamail.utils.mail.dkim.SigningAlgorithm;
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import de.agitos.dkim.*;
//import javax.mail.internet.*; 


@Service
public class MailAttacherServiceImp implements MailAttacherService
{
	
	
	@Autowired
	private MailAttacherDAO mailAttacherDao;

	private static Logger logger = LoggerFactory.getLogger(MailAttacherController.class);
	
	private  PaisosIdiomes paisosIdioma;
	private  IdiomesPrincipalsTraduits idiomesPrincipals;
	//this.inicializarPaisosIdioma();

	
	

	private Resposta buscarErrorIdioma(String idioma)
	{
		Resposta resposta = new Resposta();
		
		try
		{
		Short testIdioma=0;
		resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,testIdioma));
		}
		catch(Exception e)
		{
			Short missatgeIndex=73;
			resposta.setError(true);
			resposta.setMissatge("El idioma no existe");
			resposta.setMissatgeIndex(missatgeIndex);
			
		}
		return resposta;
	}

	

	
	
	
	


			
			
	
	public RespostaObtenirIdiomesPais obtenirIdiomesIP(String IP) throws Exception
	{
		RespostaObtenirIdiomesPais resposta = new RespostaObtenirIdiomesPais();
		
		
		//IPusuari.setIP("213.96.18.183");//ip españa
	  
		//IPusuari.setIP("102.217.237.0");//ip chilena
		
		//"101.31.255.255";//ip china
		
		//igual s'ha de descomentar
		if (IP.equals("127.0.0.1"))
				{
				IP="213.96.18.183";//ip china
				}
		
		
		System.out.println("Obtenir Idiomes Service Implementation");
		
		//RespostaIdioma respostaIdioma=this.mailAttacherDao.getIdiomaUsuari("a@a.com", idioma);
		/*
		if(respostaIdioma.getResposta().getError()==false)
		{
			System.out.println("Idioma: "+respostaIdioma.getIdioma().toString());
		}
		*/
		
		if (this.paisosIdioma==null)
		{
			
			paisosIdioma=PaisosIdiomes.getInstance();
		}
		
		if (this.idiomesPrincipals==null)
		{
			idiomesPrincipals=IdiomesPrincipalsTraduits.getInstance();
		}
		//location lookup 81.3.27.38
		String comando, comando2, comando3 =new String();
		
		comando="/usr/bin/location";
		//comando2="-c";
		//comando2="--version";
		//comando3="echo Country:German";
		
		System.out.println("IPPP"+IP);
		comando2="lookup";
		comando3=IP;
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(comando,comando2, comando3);
		Process process=processBuilder.start();
		BufferedReader reader= new BufferedReader (new InputStreamReader(process.getInputStream()));
		
		String linea=new String();
		String[] lineaPais=new String[2];
		String pais=new String();
		boolean salir=false;

		while((linea = reader.readLine())!=null && salir==false)
		{
			System.out.println(linea);
			if (linea.contains("Country"))
			{
				
				lineaPais=linea.split(":");
				pais=lineaPais[1];
				salir=true;
			}
		}
		pais=pais.substring(1,pais.length());
		System.out.println("Pais! "+pais);
		//pais="European Union";
		//pais="Asia/Pacific";para testea con mas idiomas descomentar la linea
		PaisIdioma paisIdioma=this.paisosIdioma.getIdiomesPais(pais);
		Hashtable<String,IdiomaPrincipalTraduit> altresIdiomes=getAltresIdiomes(paisIdioma);
		LinkedList<IdiomaSimple> altresIdiomesListIdiomaAmbIdioma=new LinkedList<IdiomaSimple>();
		altresIdiomes.forEach((abreviaturaIdioma,idiomaPrincipalTraduit) ->
		{
			
			IdiomaSimple idiomaSimple=new IdiomaSimple(abreviaturaIdioma,idiomaPrincipalTraduit.getIdiomaAmbIdioma());
			altresIdiomesListIdiomaAmbIdioma.add(idiomaSimple);
		});
		
		Collections.sort(altresIdiomesListIdiomaAmbIdioma);
		
		if (paisIdioma!=null)
		{
			
		String idioma=paisIdioma.getLlistaIdiomes().get(0).getAbreviaturaIdioma();	
		System.out.println(paisIdioma.getAbreviaturaPais());
		resposta.setError(false);
		resposta.setPaisIdiomes(paisIdioma);
		resposta.setLlistaAltresIdiomes(altresIdiomesListIdiomaAmbIdioma);
		//resposta.setMissatge("Sin errores");
		resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,(short)0));
		
		
		resposta.setMissatgeIndex((short)0);
		}
		else
		{
			resposta.setError(true);
			resposta.setMissatge("Error en la IP. País no encontrado");
			//resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,(short)23));
			resposta.setMissatgeIndex((short)23);
		}
		
		return resposta;
	}
	public Hashtable<String,IdiomaPrincipalTraduit> getAltresIdiomes(PaisIdioma usuariPaisIdiomes)
	{
		LinkedList<Idioma> llistaUsuariPaisIdiomes=new LinkedList<Idioma>();
		llistaUsuariPaisIdiomes=usuariPaisIdiomes.getLlistaIdiomes();

		Hashtable<String,IdiomaPrincipalTraduit> paisosIdiomaTraduits=idiomesPrincipals.getPaisosIdioma();
		String abreviatura=new String();

		int i=0;

		while (i<llistaUsuariPaisIdiomes.size())
		{
			abreviatura=llistaUsuariPaisIdiomes.get(i).getAbreviaturaIdioma();
			paisosIdiomaTraduits.remove(abreviatura);
			i++;
		}
	
		return paisosIdiomaTraduits;
	}
	
	
	public RespostaMissatge obtenirMissatgeIdioma(String idioma, Short numeroMissatge)throws Exception
	{
		RespostaMissatge respostaMissatge=new RespostaMissatge();
		Resposta resposta=new Resposta();
		if (idioma==null)
		{
			resposta.setError(true);
			//resposta.setMissatge("El campo idioma esta vacio, no se puede obtener el mensaje");
			Short missatgeIndex=64;
			resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,missatgeIndex));
			resposta.setMissatgeIndex(missatgeIndex);
			respostaMissatge.setResposta(resposta);
		}
		else if (numeroMissatge==null)
		{
			resposta.setError(true);
			//resposta.setMissatge("El campo número esta vacio, no se puede obtener el mensaje");
			Short missatgeIndex=65;
			resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,missatgeIndex));
			resposta.setMissatgeIndex(missatgeIndex);
			respostaMissatge.setResposta(resposta);
		}else
		{
			resposta=buscarErrorIdioma(idioma);
			
			if (resposta.getError()==false)
			{
			respostaMissatge=this.mailAttacherDao.getMissatgeIdioma(idioma, numeroMissatge);
			}
			else//error de idioma
			{
				respostaMissatge.setResposta(resposta);	
			}
		}
		
		return respostaMissatge;
	
	}
	
	public RespostaMissatgesIdiomaMillorat obtenirMissatgesIdioma(String idioma )throws Exception
	{
		RespostaMissatgesIdioma respostaMissatgesIdioma=new RespostaMissatgesIdioma();
		RespostaMissatgesIdiomaMillorat respostaMissatgesIdiomaMillorat=new RespostaMissatgesIdiomaMillorat();
		//RespostaMissatge respostaMissatge=new RespostaMissatge();
		Resposta resposta=new Resposta();
		MissatgesIdioma missatgesIdioma=new MissatgesIdioma();
		
		if (idioma==null)
		{
			resposta.setError(true);
			//resposta.setMissatge("El campo idioma esta vacio, no se puede obtener el mensaje");
			Short missatgeIndex=64;
			resposta.setMissatge(this.mailAttacherDao.getMissatgeIdiomaSimple(idioma,missatgeIndex));
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Serv error idioma null");
			respostaMissatgesIdiomaMillorat.setResposta(resposta);
		}
		else
		{
			resposta=buscarErrorIdioma(idioma);
			
			if (resposta.getError()==false)
			{
				System.out.println("Serv sense error buscar idioma 1 ");
				respostaMissatgesIdioma=this.mailAttacherDao.getMissatgesIdioma(idioma);
				missatgesIdioma=new MissatgesIdioma(respostaMissatgesIdioma.getMissatgesIdioma());
				System.out.println("Serv sense error buscar idioma 2 ");
				respostaMissatgesIdiomaMillorat=new  RespostaMissatgesIdiomaMillorat(respostaMissatgesIdioma.getResposta(), missatgesIdioma); 
			}
			else//error de idioma
			{
				System.out.println("Serv error buscar idioma ");
				respostaMissatgesIdiomaMillorat.setResposta(resposta);
				System.out.println("Serv buscar error idioma");
			}
		}
		return respostaMissatgesIdiomaMillorat;
	
	}

	
	
}
