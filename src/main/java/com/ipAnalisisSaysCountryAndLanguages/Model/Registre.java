package com.ipAnalisisSaysCountryAndLanguages.Model;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.Usuari;

public class Registre
{
	private String email;
	private String contrassenya1;
	private String contrassenya2;

	public Registre()
	{
		email = new String();
		contrassenya1 = new String();
		contrassenya2 = new String();
	}

	public Registre(String email, String contrassenya1, String contrassenya2)
	{
		this.email = email;
		this.contrassenya1 = contrassenya1;
		this.contrassenya2 = contrassenya2;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getContrassenya1()
	{
		return contrassenya1;
	}

	public void setContrassenya1(String contrassenya1)
	{
		this.contrassenya1 = contrassenya1;
	}

	public String getContrassenya2()
	{
		return contrassenya2;
	}

	public void setContrassenya2(String contrassenya2)
	{
		this.contrassenya2 = contrassenya2;
	}

	public Usuari toUsuari()
	{
		Usuari usuari = new Usuari();
		usuari.setEmail(this.getEmail());
		usuari.setContrassenya(this.getContrassenya1());
		return usuari;
	}
}
