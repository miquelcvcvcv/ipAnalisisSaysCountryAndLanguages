package com.ipAnalisisSaysCountryAndLanguages.Model;


import java.util.LinkedList;

public class RespostaObtenirIdiomesPais
{

	private Boolean error;
	private PaisIdioma paisIdiomes;
	private LinkedList<IdiomaSimple> llistaAltresIdiomes;
	private String missatge;
	private Short missatgeIndex;

	public RespostaObtenirIdiomesPais()
	{
		error = false;
		paisIdiomes = new PaisIdioma();
		llistaAltresIdiomes=new LinkedList<IdiomaSimple>();
		missatge=new String();
		missatgeIndex = 100;
	}

	public RespostaObtenirIdiomesPais(Boolean error, PaisIdioma paisIdiomes,LinkedList<IdiomaSimple> llistaAltresIdiomes,String missatge, Short missatgeIndex)
	{
		this.error = error;
		this.paisIdiomes=paisIdiomes;
		this.llistaAltresIdiomes=llistaAltresIdiomes;
		this.missatge = missatge;
		this.missatgeIndex = missatgeIndex;
	}
	
	

	public Boolean getError()
	{
		return error;
	}

	public void setError(Boolean error)
	{
		this.error = error;
	}


	public Short getMissatgeIndex()
	{
		return missatgeIndex;
	}

	public void setMissatgeIndex(Short missatgeIndex)
	{
		this.missatgeIndex = missatgeIndex;
	}
	
	public PaisIdioma getPaisIdiomes()
	{
		return paisIdiomes;
	}

	public void setPaisIdiomes(PaisIdioma paisIdiomes)
	{
		this.paisIdiomes = paisIdiomes;
	}
	
	public String getMissatge()
	{
		return missatge;
	}

	public void setMissatge(String missatge)
	{
		this.missatge = missatge;
	}

	public LinkedList<IdiomaSimple> getLlistaAltresIdiomes()
	{
		return llistaAltresIdiomes;
	}

	public void setLlistaAltresIdiomes( LinkedList<IdiomaSimple>  llistaAltresIdiomes)
	{
		this.llistaAltresIdiomes = llistaAltresIdiomes;
	}

	
}