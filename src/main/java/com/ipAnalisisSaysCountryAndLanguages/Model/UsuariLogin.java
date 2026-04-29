package com.ipAnalisisSaysCountryAndLanguages.Model;

public class UsuariLogin
{

	private String usuari;
	private String contrassenya;

	public UsuariLogin()
	{
		usuari = new String();
		contrassenya = new String();
	}

	public UsuariLogin(String usuari, String contrassenya)
	{
		this.usuari = usuari;
		this.contrassenya = contrassenya;
	}

	public String getUsuari()
	{
		return usuari;
	}

	public void setUsuari(String usuari)
	{
		this.usuari = usuari;
	}

	public String getContrassenya()
	{
		return contrassenya;
	}

	public void setContrassenya(String contrassenya)
	{
		this.contrassenya = contrassenya;
	}

}
