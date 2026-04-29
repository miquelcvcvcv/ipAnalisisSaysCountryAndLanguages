package com.ipAnalisisSaysCountryAndLanguages.Hibernate;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.ipAnalisisSaysCountryAndLanguages.Model.MissatgesIdiomesId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
//Per fer .finds .equals i hashcodes es tindria de utilitzar una clase intermitja que no he fet. No estic segur no faci falta. 
@Entity
@IdClass(MissatgesIdiomesId.class)
@Table(name = "missatgesidiomes")
public class MissatgeIdioma
{
	@Id
	@Column(name = "idioma", length = 3, nullable = false)
	private String idioma;
	
	@Id
	@Column(name = "numeromissatge",  nullable = false)
	private Short numeroMissatge;
	
	@Column(name = "missatge", length = 74,  nullable = false)
	private String missatge;
	
	
	public MissatgeIdioma()
	{
		idioma=new String();
		numeroMissatge=0;
		missatge=new String();
	}
	
	public MissatgeIdioma(String idioma, Short numeroMissatge, String missatge)
	{
		this.idioma=idioma;
		this.numeroMissatge=numeroMissatge;
		this.missatge=missatge;
	}
	
	
	public String getIdioma()
	{
		return idioma;
	}

	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}

	public Short getNumeroMissatge()
	{
		return numeroMissatge;
	}

	public void setNumeroMissatge(Short numeroMissatge)
	{
		this.numeroMissatge = numeroMissatge;
	}

	public String getMissatge()
	{
		return missatge;
	}

	public void setMissatge(String missatge)
	{
		this.missatge = missatge;
	}
	
	
	
}
