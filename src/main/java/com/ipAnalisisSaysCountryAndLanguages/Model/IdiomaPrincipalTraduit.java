package com.ipAnalisisSaysCountryAndLanguages.Model;

public class IdiomaPrincipalTraduit
{
	private String idiomaAmbCastella;
	private String idiomaAmbIdioma;
	private Boolean traduit;
	
	public IdiomaPrincipalTraduit()
	{
		idiomaAmbCastella=new String();
		idiomaAmbIdioma=new String();
		traduit=false;
	}
	
	
	public IdiomaPrincipalTraduit(String idiomaAmbCastella, String idiomaAmbIdioma, Boolean traduit)
	{
		this.idiomaAmbCastella=idiomaAmbCastella;
		this.idiomaAmbIdioma=idiomaAmbIdioma;
		this.traduit=traduit;
	}
	
	public String getIdiomaAmbCastella()
	{
		return idiomaAmbCastella;
	}
	
	public void setIdiomaAmbCastella(String idioma)
	{
		this.idiomaAmbCastella = idioma;
	}
	
	public String getIdiomaAmbIdioma()
	{
		return idiomaAmbIdioma;
	}
	
	public void setIdiomaAmbIdioma(String idiomaAmbIdioma)
	{
		this.idiomaAmbIdioma = idiomaAmbIdioma;
	}
	
	public Boolean getTraduit()
	{
		return traduit;
	}
	
	public void setTraduit(Boolean traduit)
	{
		this.traduit = traduit;
	}
	
	
	
}
