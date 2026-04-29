package com.ipAnalisisSaysCountryAndLanguages.Model;

public class RespostaIdioma
{
	private Resposta resposta;
	private String idioma;

	public RespostaIdioma ()
	{
		this.resposta=new Resposta();
		this.idioma=new String();
	}
	
	public RespostaIdioma (Resposta resposta, String idioma)
	{
		this.resposta=resposta;
		this.idioma=idioma;
	}
	
	public Resposta getResposta()
	{
		return resposta;
	}

	public void setResposta(Resposta resposta)
	{
		this.resposta = resposta;
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

