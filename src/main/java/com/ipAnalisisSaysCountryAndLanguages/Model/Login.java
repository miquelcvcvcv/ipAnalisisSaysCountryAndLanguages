package com.ipAnalisisSaysCountryAndLanguages.Model;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.Usuari;

public class Login
{

	private String email;
	private String contrassenya;

	public Login()
	{
		email = new String();
		contrassenya = new String();
	}

	public Login(String email, String contrassenya)
	{
		this.email = email;
		this.contrassenya = contrassenya;

	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getContrassenya()
	{
		return contrassenya;
	}

	public void setContrassenya(String contrassenya)
	{
		this.contrassenya = contrassenya;
	}

	public Usuari toUsuari()
	{
		Usuari usuari = new Usuari();
		usuari.setEmail(this.getEmail());
		usuari.setContrassenya(this.getContrassenya());
		return usuari;
	}

}
