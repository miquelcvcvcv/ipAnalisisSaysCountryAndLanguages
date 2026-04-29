package com.ipAnalisisSaysCountryAndLanguages.Model;




public class RespostaMissatgesIdiomaMillorat
{
	private Resposta resposta;
	private MissatgesIdioma missatgesIdioma;
	
	public  RespostaMissatgesIdiomaMillorat()
	{
	  resposta=new Resposta();
	  missatgesIdioma= new MissatgesIdioma();
	}
	
	public RespostaMissatgesIdiomaMillorat (Resposta resposta, MissatgesIdioma missatgesIdioma)
	{
		this.resposta=resposta;
		this.missatgesIdioma=missatgesIdioma;
	}
	
	public Resposta getResposta()
	{
		return resposta;
	}

	public void setResposta(Resposta resposta)
	{
		this.resposta = resposta;
	}

	public MissatgesIdioma getMissatgesIdioma()
	{
		return missatgesIdioma;
	}

	public void setMissatgesIdioma(MissatgesIdioma missatgesIdioma)
	{
		this.missatgesIdioma = missatgesIdioma;
	}
	
}

