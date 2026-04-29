package com.ipAnalisisSaysCountryAndLanguages.Model;

public class Idioma
{
String abreviaturaIdioma;	
String idiomaAmbCastella;
String idiomaAmbIdioma;
Boolean oficial;

public Idioma()
{
	this.abreviaturaIdioma=new String();
	this.idiomaAmbCastella=new String();
	this.idiomaAmbIdioma=new String();
	this.oficial=false;
}

public Idioma(String abreviaturaIdioma,String idiomaAmbAngles,String idiomaAmbIdioma,Boolean oficial)
{

	this.abreviaturaIdioma=abreviaturaIdioma;
	this.idiomaAmbCastella=idiomaAmbAngles;
	this.idiomaAmbIdioma=idiomaAmbIdioma;
	this.oficial=oficial;
	
}

public String getIdiomaAmbCastella()
{
	return idiomaAmbCastella;
}

public void setIdiomaAmbCastella(String idiomaAmbCastella)
{
	this.idiomaAmbCastella = idiomaAmbCastella;
}

public String getIdiomaAmbIdioma()
{
	return idiomaAmbIdioma;
}

public void setIdiomaAmbIdioma(String idiomaAmbIdioma)
{
	this.idiomaAmbIdioma = idiomaAmbIdioma;
}

public String getAbreviaturaIdioma()
{
	return abreviaturaIdioma;
}

public void setAbreviaturaIdioma(String abreviaturaIdioma)
{
	this.abreviaturaIdioma = abreviaturaIdioma;
}

public Boolean getOficial()
{
return this.oficial;
}

public void setOficial(Boolean oficial)
{
this.oficial=oficial;	
}

}
