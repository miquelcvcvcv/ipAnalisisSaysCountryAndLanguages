package com.ipAnalisisSaysCountryAndLanguages.Model;

public class CodiUsuariPassword
{
	private String codi;
	private String email;
	private String password;

	public CodiUsuariPassword()
	{
		email = new String();
		password = new String();
		codi = new String();
	}

	public CodiUsuariPassword(String email, String password, String codi)
	{
		this.email = email;
		this.codi = codi;
		this.password = password;
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

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}
