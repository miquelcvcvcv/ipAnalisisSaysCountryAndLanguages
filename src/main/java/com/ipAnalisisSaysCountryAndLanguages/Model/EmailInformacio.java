package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class EmailInformacio
{

	private String emailDestinatari;
	private String emailUsuari;
	private String emailTitol;
	private String emailMissatge;
	private List<String> llistaFitxers;

	public EmailInformacio()
	{
		emailDestinatari = new String();
		emailUsuari = new String();
		emailTitol = new String();
		emailMissatge = new String();
		llistaFitxers = new ArrayList<String>();
	}

	public EmailInformacio(String emailDestinatari, String emailUsuari, String emailTitol, String emailMissatge,
			List<String> llistaFitxers)
	{
		this.emailDestinatari = emailDestinatari;
		this.emailUsuari = emailUsuari;
		this.emailTitol = emailTitol;
		this.emailMissatge = emailMissatge;
		this.llistaFitxers = llistaFitxers;
	}

	public String getEmailDestinatari()
	{
		return emailDestinatari;
	}

	public void setEmailDestinatari(String emailDestinatari)
	{
		this.emailDestinatari = emailDestinatari;
	}

	public String getEmailUsuari()
	{
		return emailUsuari;
	}

	public void setEmailUsuari(String emailUsuari)
	{
		this.emailUsuari = emailUsuari;
	}

	public String getEmailTitol()
	{
		return emailTitol;
	}

	public void setEmailTitol(String emailTitol)
	{
		this.emailTitol = emailTitol;
	}

	public String getEmailMissatge()
	{
		return emailMissatge;
	}

	public void setEmailMissatge(String emailMissatge)
	{
		this.emailMissatge = emailMissatge;
	}

	public List<String> getLlistaFitxers()
	{
		return llistaFitxers;
	}

	public void setLlistaFitxers(List<String> llistaFitxers)
	{
		this.llistaFitxers = llistaFitxers;
	}

}
