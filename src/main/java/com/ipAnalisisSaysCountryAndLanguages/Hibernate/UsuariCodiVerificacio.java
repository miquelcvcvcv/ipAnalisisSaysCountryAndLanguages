package com.ipAnalisisSaysCountryAndLanguages.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "usuaricodiverificacio")
public class UsuariCodiVerificacio
{
	@Id
	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "codi_verificacio", length = 5, nullable = false)
	private int codi_verificacio;

	public UsuariCodiVerificacio(String email, int codi_verificacio)
	{

		this.email = email;
		this.codi_verificacio = codi_verificacio;
	}

	public UsuariCodiVerificacio()
	{

		this.email = new String();
		this.codi_verificacio = 0;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getCodi_verificacio()
	{
		return codi_verificacio;
	}

	public void setCodi_verificacio(int codi_verificacio)
	{
		this.codi_verificacio = codi_verificacio;
	}

}
