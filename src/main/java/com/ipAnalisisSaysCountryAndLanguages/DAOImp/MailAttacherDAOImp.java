package com.ipAnalisisSaysCountryAndLanguages.DAOImp;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipAnalisisSaysCountryAndLanguages.DAO.MailAttacherDAO;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.MissatgeIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.Usuari;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.UsuariCodiVerificacio;
import com.ipAnalisisSaysCountryAndLanguages.Hibernate.UsuariIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.CodiUsuari;
import com.ipAnalisisSaysCountryAndLanguages.Model.CodiUsuariPassword;
import com.ipAnalisisSaysCountryAndLanguages.Model.Resposta;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatge;
import com.ipAnalisisSaysCountryAndLanguages.Model.RespostaMissatgesIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Repositorires.MissatgesIdiomesRepository;
import com.ipAnalisisSaysCountryAndLanguages.Repositorires.UsuariCodiVerificacioRepository;
import com.ipAnalisisSaysCountryAndLanguages.Repositorires.UsuariIdiomaRepository;
import com.ipAnalisisSaysCountryAndLanguages.Repositorires.UsuariRepository;

@Component
public class MailAttacherDAOImp implements MailAttacherDAO
{
	@Autowired
	private UsuariRepository usuariRepository;

	@Autowired
	private UsuariCodiVerificacioRepository usuariCodiVerificacioRepository;
	
	@Autowired
	private UsuariIdiomaRepository usuariIdiomaRepository;
	
	@Autowired
	private MissatgesIdiomesRepository missatgesIdiomaRepository;

	
	

	






	
	
	
	
	
	
	
	public RespostaMissatge getMissatgeIdioma(String idioma, Short numeroMissatge )throws Exception
	{
		
		System.out.println("getMissatgeIdioma");
		//List<MissatgeIdioma> llistaMissatge=new ArrayList<MissatgeIdioma>();
		List<String> llistaMissatge=new ArrayList<String>();
		String missatge=new String();
		Resposta resposta=new Resposta();
		try
		{
		//llistaMissatge=missatgesIdiomaRepository.findByIdiomaAndNumeroMissatge(idioma, numeroMissatge);
		llistaMissatge=missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma, numeroMissatge);
		}
		catch (Exception e)
		{
			resposta.setError(true);
			Short missatgeIndex=61;
			//resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			//resposta.setMissatge("Error al leer el missatgeIdioma en la Base de Datos");
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Error al leer el missatgeIdioma en la Base de Datos");
		}
		
		if (llistaMissatge.size() > 1)
		{
			resposta.setError(true);//25 i 26
			Short missatgeIndex=62;
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Hay más de dos mensajes con el mismo número e idioma");
		} 
		else if (llistaMissatge.size()==1)
		{
			resposta.setError(false);//25 i 26
			//missatge=llistaMissatge.get(0).getMissatge();
			missatge=llistaMissatge.get(0);
			Short missatgeIndex=0;
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			System.out.println("Sin errores");
			resposta.setMissatgeIndex(missatgeIndex);
		}
		RespostaMissatge respostamissatge=new RespostaMissatge(resposta,missatge);
		
		return respostamissatge;
		
	}
	
	public String getMissatgeIdiomaSimple(String idioma, Short numeroMissatge )throws Exception
	{
		
		System.out.println("getMissatgeIdioma");
		List<String> llistaMissatge=new ArrayList<String>();
		try
		{
		llistaMissatge=missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma, numeroMissatge);
		}
		catch (Exception e)
		{
			System.out.println("Error al leer el missatgeIdioma en la Base de Datos");
		}
		
		if (llistaMissatge.size() > 1)
		{
			System.out.println("Error Hay más de dos mensajes con el mismo número e idioma");
		} 
		else if (llistaMissatge.size()==1)
		{
			
			System.out.println("Sin errores");
			
		}
	
		
		return llistaMissatge.get(0);
		
	}
	
	public RespostaMissatgesIdioma getMissatgesIdioma(String idioma )throws Exception
	{
		
		System.out.println("getMissatgeIdioma "+ idioma);
		//List<MissatgeIdioma> llistaMissatge=new ArrayList<MissatgeIdioma>();
		List <MissatgeIdioma> llistaMissatge=new ArrayList<MissatgeIdioma>();//37 elements
		List <MissatgeIdioma> missatgesIdioma=new ArrayList<MissatgeIdioma>();
		Resposta resposta=new Resposta();
		try
		{
		//llistaMissatge=missatgesIdiomaRepository.findByIdiomaAndNumeroMissatge(idioma, numeroMissatge);
		llistaMissatge=missatgesIdiomaRepository.findMissatgesIdioma(idioma);
		}
		catch (Exception e)
		{
			resposta.setError(true);
			Short missatgeIndex=61;
			//resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			resposta.setMissatge("Error al leer el missatgeIdioma en la Base de Datos");
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Error al leer el missatgeIdioma en la Base de Datos DAO Exception");
		}
		
		/*f (llistaMissatge.size() > 1)
		{
			resposta.setError(true);//25 i 26
			Short missatgeIndex=62;
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Hay más de dos mensajes con el mismo número e idioma");
		} 
		*/
		if (llistaMissatge.size() == 0)
		{
			resposta.setError(true);
			Short missatgeIndex=61;
			//resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			//resposta.setMissatge("Error al leer el missatgeIdioma en la Base de Datos");
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			resposta.setMissatgeIndex(missatgeIndex);
			System.out.println("Error al leer el missatgeIdioma en la Base de Datos DAI size 0");
		}
		else if (llistaMissatge.size()>=1  )
		{
			resposta.setError(false);//25 i 26
			//missatge=llistaMissatge.get(0).getMissatge();
			missatgesIdioma=llistaMissatge;
			Short missatgeIndex=0;
			resposta.setMissatge(missatgesIdiomaRepository.findMissatgeByIdiomaAndNumeroMissatge(idioma,missatgeIndex).get(0));
			System.out.println("Sin errores");
			resposta.setMissatgeIndex(missatgeIndex);
		}
		RespostaMissatgesIdioma respostamissatge=new RespostaMissatgesIdioma(resposta,missatgesIdioma);
		
		return respostamissatge;
		
	}
	
	
	
	
	
}
