package com.ipAnalisisSaysCountryAndLanguages.Model;

public class IPUsuari
{

	private String IP;
	private String Usuari;
	 
	public IPUsuari()
	{
	 IP=new String();
	 Usuari=new String();		 
	}
 
	public IPUsuari(String IP, String Usuari)
 	{
		 this.IP=IP;
		 this.Usuari=Usuari;
	 }

	public String getIP()
	{
		return IP;
	}

	public void setIP(String IP)
	{
		this.IP = IP;
	}

	public String getUsuari()
	{
		return Usuari;
	}

	public void setUsuari(String usuari)
	{
		Usuari = usuari;
	}

 
}
