package com.ipAnalisisSaysCountryAndLanguages.Model;

public class RespostaMissatge
{

	private Resposta resposta;
	private String missatge;

	public RespostaMissatge()
	{
	this.resposta=new Resposta();	
	this.missatge=new String();
	}
	
	public RespostaMissatge(Resposta resposta, String missatge)
	{
		this.resposta=resposta;
		this.missatge=missatge;
	}
	
	public Resposta getResposta()
	{
		return resposta;
	}

	public void setResposta(Resposta resposta)
	{
		this.resposta = resposta;
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
