package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.ArrayList;
import java.util.List;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.MissatgeIdioma;

public class RespostaMissatgesIdioma
{
	private Resposta resposta;
	private List< MissatgeIdioma> missatgesIdioma;
	
	public RespostaMissatgesIdioma()
	
	{
		resposta=new Resposta();
		missatgesIdioma=new ArrayList<MissatgeIdioma>();
	}

	public RespostaMissatgesIdioma(Resposta resposta,  List< MissatgeIdioma>  missatgesIdioma )	
	{
		this.resposta=resposta;
		this.missatgesIdioma =missatgesIdioma;
	}
	public Resposta getResposta()
	{
		return resposta;
	}

	public void setResposta(Resposta resposta)
	{
		this.resposta = resposta;
	}

	public  List< MissatgeIdioma>  getMissatgesIdioma()
	{
		return missatgesIdioma;
	}

	public void setMissatgesIdioma( List< MissatgeIdioma> missatgesIdioma)
	{
		this.missatgesIdioma = missatgesIdioma;
	}
	
	
}
