package com.ipAnalisisSaysCountryAndLanguages.Hibernate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuariidioma")
public class UsuariIdioma
{
	@Id
	@Column(name = "usuari_email", length = 50, nullable = false)
	private String usuariEmail;
	
	@Column(name = "idioma", length = 3, nullable = false)
	private String idioma;
	/*
	@OneToOne(mappedBy = "usuariIdioma")
	private Usuari usuari;
	*/
	public UsuariIdioma()
	{
		this.usuariEmail=new String();
		this.idioma=new String();
	}
	
	public UsuariIdioma(String email, String idioma)
	{
	this.usuariEmail=email;
	this.idioma=idioma;
	}
		
	public String getUsuariEmail()
	{
		return usuariEmail;
	}

	public void setUsuariEmail(String usuariEmail)
	{
		this.usuariEmail = usuariEmail;
	}

	public String getIdioma()
	{
		return idioma;
	}

	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}
}
