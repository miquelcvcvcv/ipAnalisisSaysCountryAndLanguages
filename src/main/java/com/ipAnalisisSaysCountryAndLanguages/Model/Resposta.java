package com.ipAnalisisSaysCountryAndLanguages.Model;

public class Resposta
{

	private Boolean error;
	private String missatge;
	private Short missatgeIndex;

	public Resposta()
	{
		error = false;
		missatge = new String();
		missatgeIndex =  Short.valueOf((short)0);
	}

	public Resposta(Boolean error, String missatge, Short missatgeIndex)
	{
		this.error = error;
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

	public String getMissatge()
	{
		return missatge;
	}

	public void setMissatge(String missatge)
	{
		this.missatge = missatge;
	}

	public Short getMissatgeIndex()
	{
		return missatgeIndex;
	}

	public void setMissatgeIndex(Short missatgeIndex)
	{
		this.missatgeIndex = missatgeIndex;
	}

}