package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.LinkedList;

public class PaisIdioma
{
private String abreviaturaPais;
private LinkedList<Idioma> llistaIdiomes;



public PaisIdioma()
{
	this.abreviaturaPais=new String();
	this.llistaIdiomes=new LinkedList<Idioma>();
}

public PaisIdioma (String abreviatura, LinkedList<Idioma> llistaIdiomes)
{
	this.abreviaturaPais=abreviatura;
	this.llistaIdiomes=llistaIdiomes;
}

public String getAbreviaturaPais()
{
	return this.abreviaturaPais;
}

public void setAbreviaturaPais(String abreviatura)
{
	this.abreviaturaPais = abreviatura;
}

public LinkedList<Idioma> getLlistaIdiomes()
{
	return llistaIdiomes;
}

public void setLlistaIdiomes(LinkedList<Idioma> llistaIdiomes)
{
	this.llistaIdiomes = llistaIdiomes;
}

}
