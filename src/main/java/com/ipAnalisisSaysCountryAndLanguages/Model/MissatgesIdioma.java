package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.Hashtable;
import java.util.List;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.MissatgeIdioma;

public class MissatgesIdioma
{


	private String idioma;
	private Hashtable <String, String > missatgesIdioma;
	
	public MissatgesIdioma()
	{
		this.idioma=new String();
		this.missatgesIdioma=new Hashtable<String, String>();
	}

	public MissatgesIdioma(List< MissatgeIdioma> llistaMissatgesIdioma)
	{
	 System.out.println("LLista a Hashtable");
	 this.idioma=new String();
	 this.missatgesIdioma=new Hashtable<String, String>();
	 this.idioma=llistaMissatgesIdioma.get(0).getIdioma();
	 //System.out.println("LLista a Hashtable idioma"+this.idioma);
	 
	 for (int i=0; i<llistaMissatgesIdioma.size(); i++)
	 {
		 this.missatgesIdioma.put(String.valueOf(llistaMissatgesIdioma.get(i).getNumeroMissatge()), llistaMissatgesIdioma.get(i).getMissatge());
	 }
	
	}
	

	public String getIdioma()
	{
		return idioma;
	}

	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}

	public Hashtable<String, String> getMissatgesIdioma()
	{
		return missatgesIdioma;
	}

	public void setMissatgesIdioma(Hashtable<String, String> missatgesIdioma)
	{
		this.missatgesIdioma = missatgesIdioma;
	}
}
