package com.ipAnalisisSaysCountryAndLanguages.Hibernate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuari")
public class Usuari
{
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	@GenericGenerator(name = "seq", strategy = "increment")

	// @GeneratedValue (strategy=GenerationType.SEQUENCE)
	@Column(name = "id", length = 11, unique = true, nullable = false)
	private int id;

	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "contrassenya", length = 50, nullable = false)
	private String contrassenya;
	/*
	 * @Column(name="codi_verificacio", length=5, nullable=false) private int
	 * codi_verificacio;
	 */
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "usuari_email") 
	//private UsuariIdioma usuariIdioma;
	
	
	public Usuari()
	{
		id = 0;
		email = new String();
		contrassenya = new String();
		// codi_verificacio=0;
	}

	public Usuari(int idUsuari, String email, String contrassenya, int codi_verificacio)
	{
		this.id = idUsuari;
		this.email = email;
		this.contrassenya = contrassenya;
		// this.codi_verificacio=codi_verificacio;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setIdUsuari(int idUsuari)
	{
		this.id = idUsuari;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String usuari)
	{
		this.email = usuari;
	}

	public String getContrassenya()
	{
		return contrassenya;
	}

	public void setContrassenya(String contrassenya)
	{
		this.contrassenya = contrassenya;
	}
	/*
	 * public int getCodi_verificacio() { return codi_verificacio; }
	 * 
	 * public void setCodi_verificacio(int codi_verificacio) { this.codi_verificacio
	 * = codi_verificacio; }
	 */
	/*public UsuariIdioma getUsuariIdioma()
	{
		return usuariIdioma;
	}

	public void setUsuariIdioma(UsuariIdioma usuariIdioma)
	{
		this.usuariIdioma = usuariIdioma;
	}
	*/

}
