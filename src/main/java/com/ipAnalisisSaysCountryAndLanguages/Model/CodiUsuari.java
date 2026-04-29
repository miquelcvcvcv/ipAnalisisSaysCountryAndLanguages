package com.ipAnalisisSaysCountryAndLanguages.Model;

public class CodiUsuari
{

	private String email;
	private String codi;

	public CodiUsuari()
	{
		email = new String();
		codi = new String();

	}

	public CodiUsuari(String email, String codi)
	{
		this.email = email;
		this.codi = codi;

	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getCodi()
	{
		return codi;
	}

	public void setCodi(String codi)
	{
		this.codi = codi;
	}

}
