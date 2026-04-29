package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.Hashtable;
import java.util.LinkedList;

public class PaisosIdiomes
{
	private  Hashtable<String,PaisIdioma> paisosIdioma;
	
	private static  PaisosIdiomes paisosIdiomes;
	public static PaisosIdiomes  getInstance()
	{
		if (paisosIdiomes==null)
		{
			paisosIdiomes= new PaisosIdiomes();
		}
		return paisosIdiomes;
	}
	private PaisosIdiomes()
	{
		paisosIdioma= new Hashtable<String,PaisIdioma>();
		this.inicialitzar();
	}
	
	public void inicialitzar()
	{
this.paisosIdioma= new Hashtable<String,PaisIdioma>();
		
		
	    LinkedList<Idioma> llistaIdiomesAndorra=new LinkedList<Idioma> ();
	    Idioma iAD=new Idioma("ca","Català", "Català", true );
	    llistaIdiomesAndorra.add(iAD);
		this.paisosIdioma.put("Andorra", new PaisIdioma("AD",  llistaIdiomesAndorra));		
		
		
		LinkedList<Idioma> llistaIdiomesAE = new LinkedList<Idioma>();
		Idioma iArabe=new Idioma("Ar","Arabe", "العربية", true );
		Idioma iMaratíNoOficial=new Idioma("mr", "Maratí","मराठी", false);
		Idioma iTéluguNoOficial=new Idioma("te", "Télugu","తెలుగు", false);
		Idioma iKannadaNoOficial=new Idioma("kn", "Kannada","ಕನ್ನಡ", false);		
		llistaIdiomesAE.add(iArabe);
		llistaIdiomesAE.add(iMaratíNoOficial);
		llistaIdiomesAE.add(iTéluguNoOficial);
		llistaIdiomesAE.add(iKannadaNoOficial);
		this.paisosIdioma.put("United Arab Emirates", new PaisIdioma("AE", llistaIdiomesAE));
		
		LinkedList<Idioma> llistaIdiomesAF = new LinkedList<Idioma>();
		Idioma iAnglesNoOficial=new Idioma("en", "Inglés", "English", false);
		Idioma iAlbanes=new Idioma("sq", "Albanés", "Shqip", true);
		Idioma iPersa=new Idioma("fa", "Persa", "فارسی", true);
		Idioma iPersaNoOficial=new Idioma("fa", "Persa", "فارسی", false);
		llistaIdiomesAF.add(iPersa);
		llistaIdiomesAF.add(iAnglesNoOficial);
		llistaIdiomesAF.add(iAlbanes);	
		this.paisosIdioma.put("Afghanistan", new PaisIdioma("AF", llistaIdiomesAF));
		
		LinkedList<Idioma> llistaIdiomesAG = new LinkedList<Idioma>();
		Idioma iAnglesOficial=new Idioma("en", "Inglés", "English", true);
		llistaIdiomesAG.add(iAnglesOficial);
		this.paisosIdioma.put("Antigua and Barbuda", new PaisIdioma("AG", llistaIdiomesAG));
		
		LinkedList<Idioma> llistaIdiomesAI = new LinkedList<Idioma>();
		llistaIdiomesAI.add(iAnglesOficial);
		this.paisosIdioma.put("Anguilla", new PaisIdioma("AI", llistaIdiomesAI));
		
		LinkedList<Idioma> llistaIdiomesAL = new LinkedList<Idioma>();
		Idioma iAlbaniaOficial=new Idioma("sq", "Albanés", "Shqip", true);
		Idioma iGriegoNoOficial=new Idioma("el", "Griego", "Ελληνικά", false);
		llistaIdiomesAL.add(iAlbaniaOficial);
		llistaIdiomesAL.add(iGriegoNoOficial);
		this.paisosIdioma.put("Albania", new PaisIdioma("AL", llistaIdiomesAL));
		
		
		LinkedList<Idioma> llistaIdiomesAM = new LinkedList<Idioma>();
		Idioma iArmenio=new Idioma("hy", "Armenio", "Հայերեն", true);//primer idioma
		Idioma iRusoNoOficial=new Idioma("ru", "Ruso", "Русский", false);
		llistaIdiomesAM.add(iArmenio);
		llistaIdiomesAM.add(iRusoNoOficial);
		llistaIdiomesAM.add(iGriegoNoOficial);		
		this.paisosIdioma.put("Armenia", new PaisIdioma("AM", llistaIdiomesAM));
		
		LinkedList<Idioma> llistaIdiomesNAN = new LinkedList<Idioma>();		
		Idioma iNeerlandes=new Idioma("nl", "Neerlandés", "Nederlands", true);//primer idioma
		Idioma iEspanyol=new Idioma("es", "Español", "Español", true);
		Idioma iFrances=new Idioma("fr", "Francés", "Français", true);
		llistaIdiomesNAN.add(iNeerlandes);
		llistaIdiomesNAN.add(iEspanyol);
		llistaIdiomesNAN.add(iFrances);
		this.paisosIdioma.put("Netherlands Antilles", new PaisIdioma("AN", llistaIdiomesNAN));
		
		
		LinkedList<Idioma> llistaIdiomesAN = new LinkedList<Idioma>();		
		Idioma iPortugues=new Idioma("pt", "Portugués", "Portugués", true);
		llistaIdiomesAN.add(iPortugues);
		this.paisosIdioma.put("Angola", new PaisIdioma("AO",llistaIdiomesAN));
		
		LinkedList<Idioma> llistaIdiomesAP = new LinkedList<Idioma>();
		Idioma iChino=new Idioma("zh", "Chino Mandarin", "中文", true);
		Idioma iCantonesNoOficial=new Idioma("yue", "Cantonés","廣東話 / 广东话", false);
		Idioma iShanghainésNoOficial=new Idioma("wuu", "Shanghainés","上海话", false);
		Idioma iJapones=new Idioma("ja", "Japonés","日本語", true);
		Idioma iCoreano=new Idioma("ko", "Coreano","한국어 / 조선말", true);
		Idioma iHindi=new Idioma("hi", "Hindi","हिन्दी", true);
		Idioma iMaratí=new Idioma("mr", "Maratí","मराठी", true);
		Idioma iTamil=new Idioma("ta", "Tamil","தமிழ்", true);
		Idioma iVietnamita=new Idioma("vi", "Vietnamita","Tiếng Việt", true);
		
		llistaIdiomesAP.add(iAnglesOficial);
		llistaIdiomesAP.add(iChino);
		llistaIdiomesAP.add(iCantonesNoOficial);
		llistaIdiomesAP.add(iShanghainésNoOficial);
		llistaIdiomesAP.add(iJapones);
		llistaIdiomesAP.add(iCoreano);
		llistaIdiomesAP.add(iHindi);
		llistaIdiomesAP.add(iMaratí);
		llistaIdiomesAP.add(iTamil);
		llistaIdiomesAP.add(iVietnamita);
		llistaIdiomesAP.add(iPortugues);
		this.paisosIdioma.put("Asia/Pacific", new PaisIdioma("AP", llistaIdiomesAP));
		

		LinkedList<Idioma> llistaIdiomesANT = new LinkedList<Idioma>();	
		Idioma iNoruegoNoOficial=new Idioma("no", "Noruego", "Norsk", true);//primer idioma
		Idioma iEspanyolNoOficial=new Idioma("es", "Español", "Español", false);
		Idioma iFrancesNoOficial=new Idioma("fr", "Francés", "Français", false);
		Idioma iItalianoNoOficial=new Idioma("it", "Italiano", "Italiano", false);
		Idioma iAlemanNoOficial=new Idioma("de", "Alemán", "Deutsch", false);
		Idioma iChinoNoOficial=new Idioma("zh", "Chino Mandrain", "中文", false);
		llistaIdiomesANT.add(iAnglesNoOficial);
		llistaIdiomesANT.add(iNoruegoNoOficial);
		llistaIdiomesANT.add(iEspanyolNoOficial);
		llistaIdiomesANT.add(iFrancesNoOficial);
		llistaIdiomesANT.add(iItalianoNoOficial);
		llistaIdiomesANT.add(iAlemanNoOficial);
		llistaIdiomesANT.add(iRusoNoOficial);
		llistaIdiomesANT.add(iChinoNoOficial);		
		this.paisosIdioma.put("Antarctica", new PaisIdioma("AQ", llistaIdiomesANT));
		
		LinkedList<Idioma> llistaIdiomesAR = new LinkedList<Idioma>();		
		llistaIdiomesAR.add(iEspanyol);
		this.paisosIdioma.put("Argentina", new PaisIdioma("AR",llistaIdiomesAR));
		
		LinkedList<Idioma> llistaIdiomesAS= new LinkedList<Idioma>();	
		llistaIdiomesAS.add(iAnglesOficial);
		this.paisosIdioma.put("American Samoa", new PaisIdioma("AS",llistaIdiomesAS));
		
		LinkedList<Idioma> llistaIdiomesAT = new LinkedList<Idioma>();	
		Idioma iAleman=new Idioma("de", "Alemán", "Deutsch", true);
		Idioma iTurcoNoOficial=new Idioma("tr", "Turco", "Türkçe", false);
		llistaIdiomesAT.add(iAleman);
		llistaIdiomesAT.add(iTurcoNoOficial);
		this.paisosIdioma.put("Austria", new PaisIdioma("AT",llistaIdiomesAT));
		
		LinkedList<Idioma> llistaIdiomesAU = new LinkedList<Idioma>();		
		llistaIdiomesAU.add(iAnglesOficial);
		this.paisosIdioma.put("Australia", new PaisIdioma("AU",llistaIdiomesAU));
		
		LinkedList<Idioma> llistaIdiomesAW = new LinkedList<Idioma>();		
		llistaIdiomesAW.add(iNeerlandes);
		llistaIdiomesAW.add(iEspanyolNoOficial);
		llistaIdiomesAW.add(iAnglesNoOficial);
		this.paisosIdioma.put("Aruba", new PaisIdioma("AW",llistaIdiomesAW));
		
		LinkedList<Idioma> llistaIdiomesAX = new LinkedList<Idioma>();	
		Idioma iSuecoOficial=new Idioma("sv", "Sueco","Svenska", true);
		llistaIdiomesAX.add(iSuecoOficial);
		llistaIdiomesAX.add(iAnglesNoOficial);		
		//sueco		
		this.paisosIdioma.put("Åland Islands", new PaisIdioma("AX",llistaIdiomesAX));
		
		LinkedList<Idioma> llistaIdiomesAZ = new LinkedList<Idioma>();		
		Idioma iAzerbaidjanès=new Idioma("az", "","Azərbaycanca", true);	
		llistaIdiomesAZ.add(iAzerbaidjanès);
		llistaIdiomesAZ.add(iRusoNoOficial);
		this.paisosIdioma.put("Azerbaijan", new PaisIdioma("AZ",llistaIdiomesAZ));
		
		LinkedList<Idioma> llistaIdiomesBA = new LinkedList<Idioma>();	
		Idioma iBosnià=new Idioma("bs", "Bosniàno","Bosanski", true);
		Idioma iCroat=new Idioma("hr", "Croata","Hrvatski", true);
		Idioma iSerbi=new Idioma("sr", "Serbio","Српски", true);
		Idioma iSerbiNoOficial=new Idioma("sr", "Serbio","Српски", false);
		Idioma iCroatNoOficial=new Idioma("hr", "Croata","Hrvatski", false);
		Idioma iBosniàNoOficial=new Idioma("bs", "Bosniàno","Bosanski", true);
		Idioma iMontenegrí=new Idioma("cnr", "Montenegrí","Crnogorski", true);
		
		llistaIdiomesBA.add(iBosnià);
		llistaIdiomesBA.add(iCroat);
		llistaIdiomesBA.add(iSerbi);
		llistaIdiomesBA.add(iAnglesNoOficial);
		llistaIdiomesBA.add(iAlemanNoOficial);
		llistaIdiomesBA.add(iTurcoNoOficial);
		this.paisosIdioma.put("Bosnia and Herzegovina", new PaisIdioma("BA",llistaIdiomesBA));
		
		LinkedList<Idioma> llistaIdiomesBB = new LinkedList<Idioma>();		
		llistaIdiomesBB.add(iAnglesOficial);
		this.paisosIdioma.put("Barbados", new PaisIdioma("BB",llistaIdiomesBB));
		
		LinkedList<Idioma> llistaIdiomesBD = new LinkedList<Idioma>();		
		Idioma iBengali=new Idioma("bn", "Bengalí", "বাংলা", true);
		Idioma iAssamesNoOficial=new Idioma("as", "Assamès","অসমীয়া", false);
		llistaIdiomesBD.add(iBengali);
		llistaIdiomesBD.add(iAnglesOficial);
		llistaIdiomesBD.add(iAssamesNoOficial);
		this.paisosIdioma.put("Bangladesh", new PaisIdioma("BD",llistaIdiomesBD));
		
		LinkedList<Idioma> llistaIdiomesBE = new LinkedList<Idioma>();
		llistaIdiomesBE.add(iNeerlandes);
		llistaIdiomesBE.add(iFrances);
		llistaIdiomesBE.add(iAleman);
		this.paisosIdioma.put("Belgium", new PaisIdioma("BE",llistaIdiomesBE));
		
		LinkedList<Idioma> llistaIdiomesBF = new LinkedList<Idioma>();	
		Idioma iHausaNoOficial=new Idioma("ha", "Hausa","Hausa", false);
		Idioma iFula=new Idioma("ff", "Fula","Fulfulde", true);
		Idioma iFulaNoOficial=new Idioma("ff", "Fula","Fulfulde", false);
		llistaIdiomesBF.add(iFrances);
		llistaIdiomesBF.add(iHausaNoOficial);
		llistaIdiomesBF.add(iFulaNoOficial);
		this.paisosIdioma.put("Burkina Faso", new PaisIdioma("BF",llistaIdiomesBF));
		
		LinkedList<Idioma> llistaIdiomesBG = new LinkedList<Idioma>();	
		Idioma iBulgaro=new Idioma("bg", "Búlgar","български език", true);
		llistaIdiomesBG.add(iBulgaro);
		llistaIdiomesBG.add(iRusoNoOficial);
		llistaIdiomesBG.add(iTurcoNoOficial);
		llistaIdiomesBG.add(iAnglesNoOficial);
		llistaIdiomesBG.add(iGriegoNoOficial);
		this.paisosIdioma.put("Bulgaria", new PaisIdioma("BG",llistaIdiomesBG));
		
		LinkedList<Idioma> llistaIdiomesBH = new LinkedList<Idioma>();	
		Idioma iHindiNoOficial=new Idioma("hi", "Hindi","हिन्दी", false);
		llistaIdiomesBH.add(iArabe);
		llistaIdiomesBH.add(iAnglesNoOficial);
		llistaIdiomesBH.add(iPersaNoOficial);
		llistaIdiomesBH.add(iHindiNoOficial);		
		this.paisosIdioma.put("Bahrain", new PaisIdioma("BH",llistaIdiomesBH));
		
		
		LinkedList<Idioma> llistaIdiomesBI = new LinkedList<Idioma>();	
		//kirundi
		Idioma iArabeNoOficial=new Idioma("Ar","Arabe", "العربية", true );
		llistaIdiomesBI.add(iFrances);
		llistaIdiomesBI.add(iAnglesOficial);
		llistaIdiomesBI.add(iArabeNoOficial);
		this.paisosIdioma.put("Burundi", new PaisIdioma("BI",llistaIdiomesBI));
		
		
		LinkedList<Idioma> llistaIdiomesBJ= new LinkedList<Idioma>();	
		Idioma iYorubaNoOficial=new Idioma("yo", "Yoruba","Yorùbá", true);
		llistaIdiomesBJ.add(iFrances);
		llistaIdiomesBJ.add(iHausaNoOficial);
		llistaIdiomesBJ.add(iYorubaNoOficial);
		llistaIdiomesBJ.add(iFulaNoOficial);

		this.paisosIdioma.put("Benin", new PaisIdioma("BJ",llistaIdiomesBJ));
		
		LinkedList<Idioma> llistaIdiomesBL = new LinkedList<Idioma>();		
		llistaIdiomesBL.add(iFrances);
		llistaIdiomesBL.add(iAnglesNoOficial);
		this.paisosIdioma.put("Saint Barthélemy", new PaisIdioma("BL",llistaIdiomesBL));
		
		LinkedList<Idioma> llistaIdiomesBM = new LinkedList<Idioma>();		
		Idioma iPortuguesNoOficial=new Idioma("pt", "Portugués", "Portugués", false);
		llistaIdiomesBM.add(iAnglesOficial);
		llistaIdiomesBM.add(iPortuguesNoOficial);
		llistaIdiomesBM.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Bermuda", new PaisIdioma("BM",llistaIdiomesBM));
		
		LinkedList<Idioma> llistaIdiomesBN = new LinkedList<Idioma>();
	
		Idioma iMalayo=new Idioma("ms", "Malai","Bahasa Melayu", true);
		llistaIdiomesBN.add(iMalayo);
		llistaIdiomesBN.add(iAnglesNoOficial);
		llistaIdiomesBN.add(iChinoNoOficial);
		this.paisosIdioma.put("Brunei Darussalam", new PaisIdioma("BN",llistaIdiomesBN));
		
		LinkedList<Idioma> llistaIdiomesBOP=new LinkedList<Idioma>();
		llistaIdiomesBOP.add(iEspanyol);
		this.paisosIdioma.put("Bolivia, Plurinational State of", new PaisIdioma("BO",llistaIdiomesBOP));
		
		LinkedList<Idioma> llistaIdiomesBOS=new LinkedList<Idioma>();
		llistaIdiomesBOS.add(iNeerlandes);
		llistaIdiomesBOS.add(iEspanyolNoOficial);
		llistaIdiomesBOS.add(iAnglesNoOficial);
		
		this.paisosIdioma.put("Bonaire, Sint Eustatius and Saba", new PaisIdioma("BQ",llistaIdiomesBOS));
		
		
		LinkedList<Idioma> llistaIdiomesBR= new LinkedList<Idioma>();		
		this.paisosIdioma.put("Brazil", new PaisIdioma("BR",llistaIdiomesBR));
		llistaIdiomesBR.add(iPortugues);
		LinkedList<Idioma> llistaIdiomesBS= new LinkedList<Idioma>();
		this.paisosIdioma.put("Bahamas", new PaisIdioma("BS", llistaIdiomesBS));
		
		LinkedList<Idioma> llistaIdiomesBT= new LinkedList<Idioma>();
		//Dzongkha
		llistaIdiomesBT.add(iAnglesNoOficial);
		llistaIdiomesBT.add(iHindiNoOficial);
		llistaIdiomesBT.add(iAssamesNoOficial);
		this.paisosIdioma.put("Bhutan", new PaisIdioma("BT",llistaIdiomesBT));
		
		LinkedList<Idioma> llistaIdiomesBV= new LinkedList<Idioma>();
		Idioma iNoruegoOficial=new Idioma("no", "Noruego","Norsk", false);
		llistaIdiomesBV.add(iNoruegoOficial);
		llistaIdiomesBV.add(iAnglesNoOficial);
		this.paisosIdioma.put("Bouvet Island", new PaisIdioma("BV",llistaIdiomesBV));
		
		LinkedList<Idioma> llistaIdiomesBW= new LinkedList<Idioma>();
		llistaIdiomesBW.add(iAnglesOficial);
		this.paisosIdioma.put("Botswana", new PaisIdioma("BW",llistaIdiomesBW));
		
		LinkedList<Idioma> llistaIdiomesBY= new LinkedList<Idioma>();
		Idioma iRuso=new Idioma("ru", "Ruso", "Русский", true);
		Idioma iBielorús=new Idioma("be", "Bielorús", "Беларуская", true);
		llistaIdiomesBY.add(iRuso);
		llistaIdiomesBY.add(iBielorús);
		this.paisosIdioma.put("Belarus", new PaisIdioma("BY",llistaIdiomesBY));
		
		
		LinkedList<Idioma> llistaIdiomesBZ= new LinkedList<Idioma>();
		llistaIdiomesBZ.add(iAnglesOficial);
		llistaIdiomesBZ.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Belize", new PaisIdioma("BZ", llistaIdiomesBZ));
	
		LinkedList<Idioma> llistaIdiomesCA= new LinkedList<Idioma>();
		llistaIdiomesCA.add(iAnglesOficial);
		llistaIdiomesCA.add(iFrances);
		this.paisosIdioma.put("Canada", new PaisIdioma("CA",llistaIdiomesCA));
		
		LinkedList<Idioma> llistaIdiomesCC= new LinkedList<Idioma>();
		llistaIdiomesCC.add(iAnglesOficial);
		this.paisosIdioma.put("Cocos (Keeling) Islands", new PaisIdioma("CC",llistaIdiomesCC));

		LinkedList<Idioma> llistaIdiomesCD= new LinkedList<Idioma>();
		llistaIdiomesCD.add(iFrances);
		this.paisosIdioma.put("Congo, Democratic Republic of the", new PaisIdioma("CD",llistaIdiomesCD));

		LinkedList<Idioma> llistaIdiomesCF= new LinkedList<Idioma>();
		llistaIdiomesCF.add(iFrances);
		//Sango 
		this.paisosIdioma.put("Central African Republic", new PaisIdioma("CF",llistaIdiomesCF));
		
		
		LinkedList<Idioma> llistaIdiomesCG= new LinkedList<Idioma>();
		llistaIdiomesCG.add(iFrances);
		Idioma iLingala=new Idioma("ln", "Lingala", "Lingála", true);
		Idioma iKituba=new Idioma("ktu", "Kituba", "Kikongo ya Leta", true);
		llistaIdiomesCG.add(iLingala);
		llistaIdiomesCG.add(iKituba);
		this.paisosIdioma.put("Congo", new PaisIdioma("CG",llistaIdiomesCG));

		LinkedList<Idioma> llistaIdiomesCH= new LinkedList<Idioma>();
		Idioma iItaliano=new Idioma("it", "Italiano", "Italiano", true);
		Idioma iRomanche=new Idioma("rm", "Romanx", "Rumantsch", true);
		llistaIdiomesCH.add(iAleman);
		llistaIdiomesCH.add(iFrances);
		llistaIdiomesCH.add(iItaliano);
		llistaIdiomesCH.add(iRomanche);
		this.paisosIdioma.put("Switzerland", new PaisIdioma("CH",llistaIdiomesCH));

		LinkedList<Idioma> llistaIdiomesCI= new LinkedList<Idioma>();
		llistaIdiomesCI.add(iFrances);
		this.paisosIdioma.put("Côte d'Ivoire", new PaisIdioma("CI",llistaIdiomesCI));

		LinkedList<Idioma> llistaIdiomesCK= new LinkedList<Idioma>();
		llistaIdiomesCK.add(iAnglesOficial);
		//maori de las islas cook
		this.paisosIdioma.put("Cook Islands", new PaisIdioma("CK",llistaIdiomesCK));
	
		
		LinkedList<Idioma> llistaIdiomesCL= new LinkedList<Idioma>();
		llistaIdiomesCL.add(iEspanyol);
		this.paisosIdioma.put("Chile", new PaisIdioma("CL",llistaIdiomesCL));

		LinkedList<Idioma> llistaIdiomesCM= new LinkedList<Idioma>();
		Idioma iIgboNoOficial=new Idioma("ig", "Igbo","Ìgbò", false);
		llistaIdiomesCM.add(iFrances);
		llistaIdiomesCM.add(iAnglesOficial);
		llistaIdiomesCM.add(iHausaNoOficial);
		llistaIdiomesCM.add(iIgboNoOficial);
		llistaIdiomesCM.add(iFulaNoOficial);
		this.paisosIdioma.put("Cameroon", new PaisIdioma("CM",llistaIdiomesCM));

		LinkedList<Idioma> llistaIdiomesCN= new LinkedList<Idioma>();
		Idioma iVietnamitaNoOficial=new Idioma("vi", "Vietnamita","Tiếng Việt", false);
		Idioma iZhuangNoOficial=new Idioma("za", "Zhuang","Cuengh", false);		
		llistaIdiomesCN.add(iChino);
		llistaIdiomesCN.add(iShanghainésNoOficial);
		llistaIdiomesCN.add(iCantonesNoOficial);
		llistaIdiomesCN.add(iZhuangNoOficial);
		llistaIdiomesCN.add(iVietnamitaNoOficial);
		this.paisosIdioma.put("China", new PaisIdioma("CN",llistaIdiomesCN));

		LinkedList<Idioma> llistaIdiomesCO= new LinkedList<Idioma>();
		llistaIdiomesCO.add(iEspanyol);
		this.paisosIdioma.put("Colombia", new PaisIdioma("CO",llistaIdiomesCO));

		LinkedList<Idioma> llistaIdiomesCR= new LinkedList<Idioma>();
		llistaIdiomesCR.add(iEspanyol);
		this.paisosIdioma.put("Costa Rica", new PaisIdioma("CR",llistaIdiomesCR));
	
		LinkedList<Idioma> llistaIdiomesCS= new LinkedList<Idioma>();
		llistaIdiomesCS.add(iSerbi);
		llistaIdiomesCS.add(iMontenegrí);
		llistaIdiomesCS.add(iBosnià);
		llistaIdiomesCS.add(iCroat);
		llistaIdiomesCS.add(iAlbanes);
		llistaIdiomesCS.add(iAnglesNoOficial);
		this.paisosIdioma.put("Serbia and Montenegro", new PaisIdioma("CS",llistaIdiomesCS));

		LinkedList<Idioma> llistaIdiomesCU= new LinkedList<Idioma>();
		llistaIdiomesCU.add(iEspanyol);
		this.paisosIdioma.put("Cuba", new PaisIdioma("CU",llistaIdiomesCU));

		LinkedList<Idioma> llistaIdiomesCV= new LinkedList<Idioma>();
		llistaIdiomesCV.add(iPortugues);
		llistaIdiomesCV.add(iFrancesNoOficial);
		llistaIdiomesCV.add(iEspanyolNoOficial);
		llistaIdiomesCV.add(iAnglesNoOficial);		
		this.paisosIdioma.put("Cabo Verde", new PaisIdioma("CV",llistaIdiomesCV));

		LinkedList<Idioma> llistaIdiomesCW= new LinkedList<Idioma>();
		//papiamento
		llistaIdiomesCW.add(iNeerlandes);
		llistaIdiomesCW.add(iAnglesOficial);
		llistaIdiomesCW.add(iEspanyolNoOficial);
		llistaIdiomesCW.add(iPortuguesNoOficial);		
		this.paisosIdioma.put("Curaçao", new PaisIdioma("CW",llistaIdiomesCW));

		LinkedList<Idioma> llistaIdiomesCX= new LinkedList<Idioma>();
		llistaIdiomesCW.add(iAnglesOficial);
		this.paisosIdioma.put("Christmas Island", new PaisIdioma("CX",llistaIdiomesCX));
	
		LinkedList<Idioma> llistaIdiomesCY= new LinkedList<Idioma>();
		Idioma iGriego=new Idioma("el", "Griego", "Ελληνικά", true);
		Idioma iTurco=new Idioma("tr", "Turco", "Türkçe", true);
		llistaIdiomesCY.add(iGriego);
		llistaIdiomesCY.add(iTurco);		
		this.paisosIdioma.put("Cyprus", new PaisIdioma("CY",llistaIdiomesCY));

		LinkedList<Idioma> llistaIdiomesCZ= new LinkedList<Idioma>();
		Idioma iCheco=new Idioma("cs", "Checo","Čeština", true);
		llistaIdiomesCZ.add(iCheco);
		llistaIdiomesCZ.add(iAnglesOficial);
		llistaIdiomesCZ.add(iVietnamitaNoOficial);
		this.paisosIdioma.put("Czechia", new PaisIdioma("CZ",llistaIdiomesCZ));

		LinkedList<Idioma> llistaIdiomesDE= new LinkedList<Idioma>();
		llistaIdiomesDE.add(iAleman);
		this.paisosIdioma.put("Germany", new PaisIdioma("DE",llistaIdiomesDE));

		LinkedList<Idioma> llistaIdiomesDJ= new LinkedList<Idioma>();

		Idioma iSomalí=new Idioma("so", "Somalí", "Soomaaliga", true);
		Idioma iAfar=new Idioma("aa", "Afar", "Qafár af", true);
		llistaIdiomesDJ.add(iSomalí);
		llistaIdiomesDJ.add(iAfar);
		llistaIdiomesDJ.add(iArabe);
		llistaIdiomesDJ.add(iFrances);
		this.paisosIdioma.put("Djibouti", new PaisIdioma("DJ",llistaIdiomesDJ));

		LinkedList<Idioma> llistaIdiomesDK= new LinkedList<Idioma>();
		Idioma iDanès=new Idioma("da", "Danès","Dansk", true);
		llistaIdiomesDK.add(iDanès);
		llistaIdiomesDK.add(iAnglesNoOficial);
		llistaIdiomesDK.add(iAlemanNoOficial);
		this.paisosIdioma.put("Denmark", new PaisIdioma("DK",llistaIdiomesDK));

		LinkedList<Idioma> llistaIdiomesDM= new LinkedList<Idioma>();
		llistaIdiomesDM.add(iAnglesOficial);
		llistaIdiomesDM.add(iFrancesNoOficial);
		llistaIdiomesDM.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Dominica", new PaisIdioma("DM",llistaIdiomesDM));

		LinkedList<Idioma> llistaIdiomesDO= new LinkedList<Idioma>();
		llistaIdiomesDO.add(iEspanyol);
		llistaIdiomesDO.add(iAnglesNoOficial);
		this.paisosIdioma.put("Dominican Republic", new PaisIdioma("DO",llistaIdiomesDO));
		
		LinkedList<Idioma> llistaIdiomesDZ= new LinkedList<Idioma>();
		llistaIdiomesDZ.add(iArabe);
		//Bererber oficial no es una llengua crec
		llistaIdiomesDZ.add(iFrancesNoOficial);
		this.paisosIdioma.put("Algeria", new PaisIdioma("DZ",llistaIdiomesDZ));
		
		LinkedList<Idioma> llistaIdiomesEC= new LinkedList<Idioma>();
		llistaIdiomesEC.add(iEspanyol);
		this.paisosIdioma.put("Ecuador", new PaisIdioma("EC",llistaIdiomesEC));
		
		LinkedList<Idioma> llistaIdiomesEE= new LinkedList<Idioma>();
		Idioma iEstonio=new Idioma("et", "Estonià","Eesti keel", true);
		llistaIdiomesEE.add(iEstonio);
		llistaIdiomesEE.add(iRusoNoOficial);
		llistaIdiomesEE.add(iAnglesNoOficial);
		this.paisosIdioma.put("Estonia", new PaisIdioma("EE",llistaIdiomesEE));
		
		LinkedList<Idioma> llistaIdiomesEG= new LinkedList<Idioma>();
		Idioma iEgipcio=new Idioma("arz", "Egipcio", "المصري", true);
		llistaIdiomesEG.add(iEgipcio);
		llistaIdiomesEG.add(iArabe);
		this.paisosIdioma.put("Egypt", new PaisIdioma("EG",llistaIdiomesEG));
		
		LinkedList<Idioma> llistaIdiomesEH= new LinkedList<Idioma>();
		llistaIdiomesEH.add(iArabe);
		llistaIdiomesEH.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Western Sahara", new PaisIdioma("EH",llistaIdiomesEH));
		
		LinkedList<Idioma> llistaIdiomesER= new LinkedList<Idioma>();
		Idioma iAfarNoOficial=new Idioma("aa", "Afar", "Qafár af", false);
		llistaIdiomesER.add(iArabe);
		llistaIdiomesER.add(iAfarNoOficial);
		llistaIdiomesER.add(iAnglesOficial);
		this.paisosIdioma.put("Eritrea", new PaisIdioma("ER",llistaIdiomesER));
		
		LinkedList<Idioma> llistaIdiomesES= new LinkedList<Idioma>();
		Idioma iCatala=new Idioma("ca", "Catalan","Català", true);
		Idioma iVasco=new Idioma("eu", "Vasco","Euskarra", true);
		Idioma iGallego=new Idioma("gl", "Gallego","Galego", true);
		
		llistaIdiomesES.add(iEspanyol);
		llistaIdiomesES.add(iCatala);
		llistaIdiomesES.add(iVasco);
		llistaIdiomesES.add(iGallego);
		this.paisosIdioma.put("Spain", new PaisIdioma("ES",llistaIdiomesES));
		
		LinkedList<Idioma> llistaIdiomesET= new LinkedList<Idioma>();
		Idioma iAmharic=new Idioma("am","Amárico","አማርኛ", true);
		Idioma iOromo=new Idioma("om","Oromo","Oromiffa", true);
		llistaIdiomesET.add(iAmharic);
		llistaIdiomesET.add(iOromo);
		llistaIdiomesET.add(iAfarNoOficial);
		llistaIdiomesET.add(iAnglesNoOficial);
		this.paisosIdioma.put("Ethiopia", new PaisIdioma("ET",llistaIdiomesET));
		
		LinkedList<Idioma> llistaIdiomesEU= new LinkedList<Idioma>();
		llistaIdiomesEU.add(iAnglesOficial);
		llistaIdiomesEU.add(iAleman);
		llistaIdiomesEU.add(iNoruegoOficial);
		llistaIdiomesEU.add(iGriego);
		llistaIdiomesEU.add(iCatala);
		llistaIdiomesEU.add(iPortugues);
		llistaIdiomesEU.add(iFrances);
		llistaIdiomesEU.add(iEspanyol);
		llistaIdiomesEU.add(iNeerlandes);
		llistaIdiomesEU.add(iItaliano);
		llistaIdiomesEU.add(iVasco);
		paisosIdioma.put("European Union", new PaisIdioma("EU",llistaIdiomesEU));
		
		LinkedList<Idioma> llistaIdiomesFI= new LinkedList<Idioma>();
		Idioma iFinesOficial=new Idioma("fi", "Finés","Suomi", true);
		//Findlandes ==Fines 
		llistaIdiomesFI.add(iFinesOficial);
		llistaIdiomesFI.add(iSuecoOficial);
		llistaIdiomesFI.add(iAnglesNoOficial);
		
		this.paisosIdioma.put("Finland", new PaisIdioma("FI",llistaIdiomesFI));
		
		LinkedList<Idioma> llistaIdiomesFJ= new LinkedList<Idioma>();
		llistaIdiomesFI.add(iAnglesOficial);
		llistaIdiomesFI.add(iChinoNoOficial);
		this.paisosIdioma.put("Fiji", new PaisIdioma("FJ",llistaIdiomesFJ));
		
		LinkedList<Idioma> llistaIdiomesFK= new LinkedList<Idioma>();
		llistaIdiomesFK.add(iAnglesOficial);
		llistaIdiomesFK.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Falkland Islands (Malvinas)", new PaisIdioma("FK",llistaIdiomesFK));
		
		LinkedList<Idioma> llistaIdiomesFM= new LinkedList<Idioma>();
		llistaIdiomesFM.add(iAnglesOficial);
		this.paisosIdioma.put("Micronesia, Federated States of", new PaisIdioma("FM",llistaIdiomesFM));
		
		LinkedList<Idioma> llistaIdiomesFO= new LinkedList<Idioma>();
		//Feroes 
		llistaIdiomesFO.add(iDanès);
		llistaIdiomesFO.add(iAnglesNoOficial);
		this.paisosIdioma.put("Faroe Islands", new PaisIdioma("FO",llistaIdiomesFO));
		
		LinkedList<Idioma> llistaIdiomesFR= new LinkedList<Idioma>();
		Idioma iCatalaNoOficial=new Idioma("ca", "Catalan","Català", false);
		Idioma iVascoNoOficial=new Idioma("eu", "Vasco","Euskarra", false);
		llistaIdiomesFR.add(iFrances);
		llistaIdiomesFR.add(iCatalaNoOficial);
		llistaIdiomesFR.add(iVascoNoOficial);		
		this.paisosIdioma.put("France", new PaisIdioma("FR",llistaIdiomesFR));
		
		LinkedList<Idioma> llistaIdiomesFX= new LinkedList<Idioma>();
		llistaIdiomesFX.add(iFrances);
		llistaIdiomesFX.add(iCatalaNoOficial);
		llistaIdiomesFX.add(iVascoNoOficial);	
		this.paisosIdioma.put("France, Metropolitan", new PaisIdioma("FX",llistaIdiomesFX));
		
		LinkedList<Idioma> llistaIdiomesGA= new LinkedList<Idioma>();
		llistaIdiomesGA.add(iFrances);
		llistaIdiomesGA.add(iIgboNoOficial);
		this.paisosIdioma.put("Gabon", new PaisIdioma("GA",llistaIdiomesGA));
		
		LinkedList<Idioma> llistaIdiomesGB= new LinkedList<Idioma>();
		llistaIdiomesGB.add(iAnglesOficial);
		this.paisosIdioma.put("United Kingdom of Great Britain and Northern Ireland", new PaisIdioma("GB",llistaIdiomesGB));
		
		LinkedList<Idioma> llistaIdiomesGD= new LinkedList<Idioma>();
		llistaIdiomesGD.add(iAnglesOficial);
		this.paisosIdioma.put("Grenada", new PaisIdioma("GD",llistaIdiomesGD));
		
		LinkedList<Idioma> llistaIdiomesGE= new LinkedList<Idioma>();
		Idioma iGeorgiano=new Idioma("ka", "Georgià","ქართული", true);
		llistaIdiomesGE.add(iGeorgiano);
		llistaIdiomesGE.add(iRusoNoOficial);
		this.paisosIdioma.put("Georgia", new PaisIdioma("GE",llistaIdiomesGE));
		
		LinkedList<Idioma> llistaIdiomesGF= new LinkedList<Idioma>();
		llistaIdiomesGF.add(iFrances);
		this.paisosIdioma.put("French Guiana", new PaisIdioma("GF",llistaIdiomesGF));
		
		LinkedList<Idioma> llistaIdiomesGG= new LinkedList<Idioma>();
		llistaIdiomesGG.add(iAnglesOficial);
		llistaIdiomesGG.add(iFrancesNoOficial);
		this.paisosIdioma.put("Guernsey", new PaisIdioma("GG",llistaIdiomesGG));
		
		LinkedList<Idioma> llistaIdiomesGH= new LinkedList<Idioma>();
		llistaIdiomesGH.add(iAnglesOficial);
		llistaIdiomesGH.add(iHausaNoOficial);
		llistaIdiomesGH.add(iYorubaNoOficial);
		llistaIdiomesGH.add(iFulaNoOficial);
		this.paisosIdioma.put("Ghana", new PaisIdioma("GH",llistaIdiomesGH));
		
		LinkedList<Idioma> llistaIdiomesGI= new LinkedList<Idioma>();
		llistaIdiomesGI.add(iAnglesOficial);
		llistaIdiomesGI.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Gibraltar", new PaisIdioma("GI",llistaIdiomesGI));
		
		LinkedList<Idioma> llistaIdiomesGL= new LinkedList<Idioma>();
		//Groenlandes oficial
		Idioma iDanèsNoOficial=new Idioma("da", "Danès","Dansk", false);
		llistaIdiomesGL.add(iDanèsNoOficial);
		llistaIdiomesGL.add(iAnglesNoOficial);
		this.paisosIdioma.put("Greenland", new PaisIdioma("GL",llistaIdiomesGL));
		
		LinkedList<Idioma> llistaIdiomesGM= new LinkedList<Idioma>();
		llistaIdiomesGM.add(iAnglesOficial);
		llistaIdiomesGM.add(iFula);
		this.paisosIdioma.put("Gambia", new PaisIdioma("GM",llistaIdiomesGM));
		
		LinkedList<Idioma> llistaIdiomesGN= new LinkedList<Idioma>();
		llistaIdiomesGN.add(iFrances);
		llistaIdiomesGN.add(iFula);
		this.paisosIdioma.put("Guinea", new PaisIdioma("GN",llistaIdiomesGN));
		
		LinkedList<Idioma> llistaIdiomesGP= new LinkedList<Idioma>();
		llistaIdiomesGP.add(iFrances);
		this.paisosIdioma.put("Guadeloupe", new PaisIdioma("GP",llistaIdiomesGP));
		
		LinkedList<Idioma> llistaIdiomesGO= new LinkedList<Idioma>();
		llistaIdiomesGO.add(iEspanyol);
		llistaIdiomesGO.add(iFrances);
		llistaIdiomesGO.add(iPortugues);
		llistaIdiomesGO.add(iIgboNoOficial);			
		this.paisosIdioma.put("Equatorial Guinea", new PaisIdioma("GQ",llistaIdiomesGO));
		
		LinkedList<Idioma> llistaIdiomesGR= new LinkedList<Idioma>();
		llistaIdiomesGR.add(iGriego);
		this.paisosIdioma.put("Greece", new PaisIdioma("GR",llistaIdiomesGR));
		
		LinkedList<Idioma> llistaIdiomesGS= new LinkedList<Idioma>();
		llistaIdiomesGS.add(iAnglesOficial);
		llistaIdiomesGS.add(iNoruegoNoOficial);
		this.paisosIdioma.put("South Georgia and the South Sandwich Islands", new PaisIdioma("GS", llistaIdiomesGS));
		
		LinkedList<Idioma> llistaIdiomesGT= new LinkedList<Idioma>();
		llistaIdiomesGT.add(iEspanyol);
		this.paisosIdioma.put("Guatemala", new PaisIdioma("GT",llistaIdiomesGT));
		
		LinkedList<Idioma> llistaIdiomesGU= new LinkedList<Idioma>();
		Idioma iJaponesNoOficial=new Idioma("ja", "Japonés","日本語", false);
		Idioma iCoreanoNoOficial=new Idioma("ko", "Coreano","한국어 / 조선말 ", true);
		llistaIdiomesGU.add(iAnglesOficial);
		//Chamorro oficial
		llistaIdiomesGU.add(iJaponesNoOficial);
		llistaIdiomesGU.add(iCoreanoNoOficial);
		llistaIdiomesGU.add(iChinoNoOficial);
		llistaIdiomesGU.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Guam", new PaisIdioma("GU",llistaIdiomesGU));
		
		LinkedList<Idioma> llistaIdiomesGW= new LinkedList<Idioma>();
		llistaIdiomesGW.add(iPortugues);
		llistaIdiomesGW.add(iFulaNoOficial);
		this.paisosIdioma.put("Guinea-Bissau", new PaisIdioma("GW",llistaIdiomesGW));
		
		LinkedList<Idioma> llistaIdiomesGY= new LinkedList<Idioma>();
		llistaIdiomesGY.add(iAnglesOficial);
		this.paisosIdioma.put("Guyana", new PaisIdioma("GY",llistaIdiomesGY));
		
		LinkedList<Idioma> llistaIdiomesHK= new LinkedList<Idioma>();
		llistaIdiomesHK.add(iChino);
		llistaIdiomesHK.add(iAnglesOficial);
		this.paisosIdioma.put("Hong Kong", new PaisIdioma("HK",llistaIdiomesHK));
		
		LinkedList<Idioma> llistaIdiomesHM= new LinkedList<Idioma>();
		llistaIdiomesHM.add(iAnglesOficial);
		this.paisosIdioma.put("Heard Island and McDonald Islands", new PaisIdioma("HM",llistaIdiomesHM));
		
		LinkedList<Idioma> llistaIdiomesHN= new LinkedList<Idioma>();
		llistaIdiomesHN.add(iEspanyol);
		this.paisosIdioma.put("Honduras", new PaisIdioma("HN",llistaIdiomesHN));
		
		LinkedList<Idioma> llistaIdiomesHR= new LinkedList<Idioma>();
		
		Idioma iHungaroNoOficial=new Idioma("hu", "Húngaro","Magyar", false);
		Idioma iChecoNoOficial=new Idioma("cs", "Checo","Čeština", false);
		Idioma iEslovacNoOficial=new Idioma("sk", "Eslovac","Slovenčina", false);

		llistaIdiomesHR.add(iCroat);
		llistaIdiomesHR.add(iSerbiNoOficial);
		llistaIdiomesHR.add(iHungaroNoOficial);
		llistaIdiomesHR.add(iChecoNoOficial);
		llistaIdiomesHR.add(iEslovacNoOficial);
		llistaIdiomesHR.add(iAnglesNoOficial);
		llistaIdiomesHR.add(iItalianoNoOficial);
		
		this.paisosIdioma.put("Croatia", new PaisIdioma("HR",llistaIdiomesHR));
		
		LinkedList<Idioma> llistaIdiomesHT= new LinkedList<Idioma>();
		llistaIdiomesHT.add(iFrances);
		this.paisosIdioma.put("Haiti", new PaisIdioma("HT",llistaIdiomesHT));
		
		LinkedList<Idioma> llistaIdiomesHU= new LinkedList<Idioma>();
		Idioma iHungaro=new Idioma("hu", "Húngaro","Magyar", true);
	
		llistaIdiomesHU.add(iHungaro);
		llistaIdiomesHU.add(iAnglesNoOficial); //afegit pel morro
		llistaIdiomesHU.add(iAlemanNoOficial);
		this.paisosIdioma.put("Hungary", new PaisIdioma("HU",llistaIdiomesHU));
		
		LinkedList<Idioma> llistaIdiomesID= new LinkedList<Idioma>();
		Idioma iIndonesio=new Idioma("id", "Indonesio","Bahasa Indonesia", true);
		Idioma iMaduresNoOficial=new Idioma("mdr", "Madurès","Bhâsa Madhurâ", false);
		llistaIdiomesID.add(iIndonesio);
		llistaIdiomesID.add(iMaduresNoOficial);
		llistaIdiomesID.add(iAnglesOficial);//xksi
		this.paisosIdioma.put("Indonesia", new PaisIdioma("ID",llistaIdiomesID));
		
		LinkedList<Idioma> llistaIdiomesIE= new LinkedList<Idioma>();
		Idioma iIrlandes=new Idioma("ga", "Irlandès","Bahasa Gaeilge", true);
		llistaIdiomesIE.add(iIrlandes);
		llistaIdiomesIE.add(iAnglesOficial);		
		this.paisosIdioma.put("Ireland", new PaisIdioma("IE",llistaIdiomesIE));
		
		LinkedList<Idioma> llistaIdiomesIL= new LinkedList<Idioma>();
		Idioma iHebreo=new Idioma("he", "Hebreu","עברית (Ivrit)", true);
		llistaIdiomesIL.add(iHebreo);
		llistaIdiomesIL.add(iAnglesNoOficial);	
		llistaIdiomesIL.add(iArabeNoOficial);		
		this.paisosIdioma.put("Israel", new PaisIdioma("IL",llistaIdiomesIL));
		
		LinkedList<Idioma> llistaIdiomesIM= new LinkedList<Idioma>();
		llistaIdiomesIM.add(iAnglesOficial);
		//Manés
		this.paisosIdioma.put("Isle of Man", new PaisIdioma("IM",llistaIdiomesIM));
		
		LinkedList<Idioma> llistaIdiomesIN= new LinkedList<Idioma>();
		Idioma iUrduNoOficial=new Idioma("ur", "Urdú","اُردُو", false);
		Idioma iUrdu=new Idioma("ur", "Urdú","اُردُو", true);
		Idioma iTélugu=new Idioma("te", "Télugu","తెలుగు", true);	
		Idioma iGujarati=new Idioma("gu", "Gujarati","ગુજરાતી ", true);	
		Idioma iKannada=new Idioma("kn", "Kannada","ಕನ್ನಡ ", true);		
		Idioma iSindhiIndia=new Idioma("sdi", "SindhiIndia","सिन्धी", true);
		Idioma iMalayalam=new Idioma("ml", "Malayalam","മലയാളം", true);
		Idioma iOdia=new Idioma("or", "Odia","ଓଡ଼ିଆ", true);
		Idioma iMaithili=new Idioma("mai", "Maithili","मैथिली", true);
		Idioma iAssames=new Idioma("as", "Assamès","অসমীয়া", true);
		
		llistaIdiomesIN.add(iHindi);
		llistaIdiomesIN.add(iUrdu);
		llistaIdiomesIN.add(iMaratí);
		llistaIdiomesIN.add(iTélugu);
		llistaIdiomesIN.add(iTamil);
		llistaIdiomesIN.add(iGujarati);
		llistaIdiomesIN.add(iKannada);
		llistaIdiomesIN.add(iAnglesOficial);	
		llistaIdiomesIN.add(iSindhiIndia);
		llistaIdiomesIN.add(iMalayalam);
		llistaIdiomesIN.add(iOdia);
		llistaIdiomesIN.add(iMaithili);
		llistaIdiomesIN.add(iAssames);
		this.paisosIdioma.put("India", new PaisIdioma("IN",llistaIdiomesIN));
		
		
		LinkedList<Idioma> llistaIdiomesIO= new LinkedList<Idioma>();
		llistaIdiomesIO.add(iAnglesOficial);
		this.paisosIdioma.put("British Indian Ocean Territory", new PaisIdioma("IO",llistaIdiomesIO));
		
		LinkedList<Idioma> llistaIdiomesIQ= new LinkedList<Idioma>();
		Idioma iKurdArab=new Idioma("kua", "Kurd","کوردی", true);	
		Idioma iKurdArabNoOfical=new Idioma("kua", "Kurd","کوردی", false);	
		llistaIdiomesIQ.add(iArabe);
		llistaIdiomesIQ.add(iKurdArab);
		this.paisosIdioma.put("Iraq", new PaisIdioma("IQ",llistaIdiomesIQ));
		
		LinkedList<Idioma> llistaIdiomesIR= new LinkedList<Idioma>();
		llistaIdiomesIR.add(iPersa);
		llistaIdiomesIR.add(iAzerbaidjanès);
		llistaIdiomesIR.add(iKurdArabNoOfical);
		this.paisosIdioma.put("Iran, Islamic Republic of", new PaisIdioma("IR",llistaIdiomesIR));

		LinkedList<Idioma> llistaIdiomesIS= new LinkedList<Idioma>();
		Idioma iIslandes=new Idioma("is", "Islandès","Íslenska", true);	
		llistaIdiomesIS.add(iIslandes);
		llistaIdiomesIS.add(iAnglesNoOficial);
		this.paisosIdioma.put("Iceland", new PaisIdioma("IS",llistaIdiomesIS));
		
		LinkedList<Idioma> llistaIdiomesIT= new LinkedList<Idioma>();
		llistaIdiomesIT.add(iItaliano);
		llistaIdiomesIT.add(iAleman);
		llistaIdiomesIT.add(iFrances);
		llistaIdiomesIT.add(iCatala);		
		this.paisosIdioma.put("Italy", new PaisIdioma("IT",llistaIdiomesIT));
		
		LinkedList<Idioma> llistaIdiomesJE= new LinkedList<Idioma>();
		llistaIdiomesJE.add(iAnglesOficial);
		llistaIdiomesJE.add(iFrances);
		//Normando oficial
		this.paisosIdioma.put("Jersey", new PaisIdioma("JE",llistaIdiomesJE));
		
		LinkedList<Idioma> llistaIdiomesJM= new LinkedList<Idioma>();
		llistaIdiomesJM.add(iAnglesOficial);
		this.paisosIdioma.put("Jamaica", new PaisIdioma("JM",llistaIdiomesJM));
		
		LinkedList<Idioma> llistaIdiomesJO= new LinkedList<Idioma>();
		llistaIdiomesJO.add(iArabe);
		llistaIdiomesJO.add(iAnglesNoOficial);
		this.paisosIdioma.put("Jordan", new PaisIdioma("JO",llistaIdiomesJO));
		
		LinkedList<Idioma> llistaIdiomesJP= new LinkedList<Idioma>();
		llistaIdiomesJP.add(iJapones);
		this.paisosIdioma.put("Japan", new PaisIdioma("JP",llistaIdiomesJP));
		
		LinkedList<Idioma> llistaIdiomesKE= new LinkedList<Idioma>();
		Idioma iSwahili=new Idioma("sw", "Swahili", "Kiswahili", true);
		Idioma iOromoNoOficial=new Idioma("om","Oromo","Oromiffa", false);
		llistaIdiomesKE.add(iSwahili);
		llistaIdiomesKE.add(iOromoNoOficial);
		llistaIdiomesKE.add(iAnglesOficial);
		this.paisosIdioma.put("Kenya", new PaisIdioma("KE",llistaIdiomesKE));
		
		LinkedList<Idioma> llistaIdiomesKG= new LinkedList<Idioma>();
		Idioma iKirguís=new Idioma("ky", "Kirguís", "Кыргыз тили", true);
		llistaIdiomesKG.add(iKirguís);
		llistaIdiomesKG.add(iRuso);
		this.paisosIdioma.put("Kyrgyzstan", new PaisIdioma("KG",llistaIdiomesKG));
		
		LinkedList<Idioma> llistaIdiomesKH= new LinkedList<Idioma>();
		Idioma iKhmer=new Idioma("km", "Khmer", "ខ្មែរ", true);
		Idioma iThaiNoOficial=new Idioma("th", "Thai", "ภาษาไทย", false);
		//Jemer
		llistaIdiomesKH.add(iKhmer);
		llistaIdiomesKH.add(iFrancesNoOficial);
		llistaIdiomesKH.add(iAnglesNoOficial);
		llistaIdiomesKH.add(iChinoNoOficial);
		llistaIdiomesKH.add(iVietnamitaNoOficial);	
		llistaIdiomesKH.add(iThaiNoOficial);		
		this.paisosIdioma.put("Cambodia", new PaisIdioma("KH",llistaIdiomesKH));
		
		LinkedList<Idioma> llistaIdiomesKI= new LinkedList<Idioma>();
		//I-Kiribati
		llistaIdiomesKI.add(iAnglesOficial);
		this.paisosIdioma.put("Kiribati", new PaisIdioma("KI",llistaIdiomesKI));
		
		LinkedList<Idioma> llistaIdiomesKM= new LinkedList<Idioma>();
		//Comoriano
		llistaIdiomesKM.add(iArabe);
		llistaIdiomesKM.add(iFrances);
		this.paisosIdioma.put("Comoros", new PaisIdioma("KM",llistaIdiomesKM));
		
		LinkedList<Idioma> llistaIdiomesKN= new LinkedList<Idioma>();
		llistaIdiomesKN.add(iAnglesOficial);
		this.paisosIdioma.put("Saint Kitts and Nevis", new PaisIdioma("KN",llistaIdiomesKN));
		
		LinkedList<Idioma> llistaIdiomesKP= new LinkedList<Idioma>();
		llistaIdiomesKP.add(iCoreano);
		this.paisosIdioma.put("Korea, Democratic People's Republic of", new PaisIdioma("KP",llistaIdiomesKP));
		
		LinkedList<Idioma> llistaIdiomesKR= new LinkedList<Idioma>();
		llistaIdiomesKR.add(iCoreano);
		this.paisosIdioma.put("Korea, Republic of", new PaisIdioma("KR",llistaIdiomesKR));
		
		LinkedList<Idioma> llistaIdiomesKW= new LinkedList<Idioma>();
		llistaIdiomesKW.add(iArabe);
		llistaIdiomesKW.add(iAnglesNoOficial);
		llistaIdiomesKW.add(iHindiNoOficial);
		llistaIdiomesKW.add(iPersaNoOficial);
		llistaIdiomesKW.add(iUrduNoOficial);
		this.paisosIdioma.put("Kuwait", new PaisIdioma("KW",llistaIdiomesKW));
		
		LinkedList<Idioma> llistaIdiomesKY= new LinkedList<Idioma>();
		llistaIdiomesKY.add(iAnglesOficial);
		llistaIdiomesKY.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Cayman Islands", new PaisIdioma("KY",llistaIdiomesKY));
		
		LinkedList<Idioma> llistaIdiomesKZ= new LinkedList<Idioma>();
		Idioma iKazakh=new Idioma("kk", "Kazakh", "Қазақ тілі", true);
		llistaIdiomesKZ.add(iKazakh);
		llistaIdiomesKZ.add(iRuso);
		this.paisosIdioma.put("Kazakhstan", new PaisIdioma("KZ",llistaIdiomesKZ));
		
		LinkedList<Idioma> llistaIdiomesLA= new LinkedList<Idioma>();

		Idioma Lao=new Idioma("lo", "Laosià", "ພາສາລາວ", true);
		llistaIdiomesLA.add(Lao);
		llistaIdiomesLA.add(iAnglesNoOficial);
		llistaIdiomesLA.add(iVietnamitaNoOficial);
		llistaIdiomesLA.add(iChinoNoOficial);
		this.paisosIdioma.put("Lao People's Democratic Republic", new PaisIdioma("LA",llistaIdiomesLA));
		
		LinkedList<Idioma> llistaIdiomesLB= new LinkedList<Idioma>();
		llistaIdiomesLB.add(iArabe);
		llistaIdiomesLB.add(iFrancesNoOficial);
		llistaIdiomesLB.add(iAnglesNoOficial);
		this.paisosIdioma.put("Lebanon", new PaisIdioma("LB",llistaIdiomesLB));
		
		LinkedList<Idioma> llistaIdiomesLC= new LinkedList<Idioma>();
		llistaIdiomesLC.add(iAnglesOficial);
		this.paisosIdioma.put("Saint Lucia", new PaisIdioma("LC",llistaIdiomesLC));
		
		LinkedList<Idioma> llistaIdiomesLI= new LinkedList<Idioma>();
		llistaIdiomesLI.add(iAleman);
		this.paisosIdioma.put("Liechtenstein", new PaisIdioma("LI",llistaIdiomesLI));
		
		LinkedList<Idioma> llistaIdiomesLK= new LinkedList<Idioma>();
		Idioma Cingales=new Idioma("si", "Singalès", "සිංහල", true);
		llistaIdiomesLK.add(Cingales);
		llistaIdiomesLK.add(iTamil);		
		this.paisosIdioma.put("Sri Lanka", new PaisIdioma("LK",llistaIdiomesLK));
		
		LinkedList<Idioma> llistaIdiomesLR= new LinkedList<Idioma>();
		llistaIdiomesLR.add(iAnglesOficial);
		this.paisosIdioma.put("Liberia", new PaisIdioma("LR",llistaIdiomesLR));
		
		LinkedList<Idioma> llistaIdiomesLS= new LinkedList<Idioma>();
		Idioma iSesotho=new Idioma("st", "Sesotho", "Sesotho", true);
		llistaIdiomesLS.add(iSesotho);
		llistaIdiomesLS.add(iAnglesOficial);
		this.paisosIdioma.put("Lesotho", new PaisIdioma("LS",llistaIdiomesLS));
		
		LinkedList<Idioma> llistaIdiomesLT= new LinkedList<Idioma>();
		//Lituano
		Idioma iLituano=new Idioma("lt", "Lituà", "Lietuvių kalba", true);
		llistaIdiomesLT.add(iLituano);
		llistaIdiomesLT.add(iRusoNoOficial);
		llistaIdiomesLT.add(iAnglesNoOficial);
		this.paisosIdioma.put("Lithuania", new PaisIdioma("LT",llistaIdiomesLT));
		
		LinkedList<Idioma> llistaIdiomesLU= new LinkedList<Idioma>();
		//Luxemburgues
		Idioma iLuxemburgues=new Idioma("lb","Luxemburguès", "Lëtzebuergesch", true);
		llistaIdiomesLU.add(iLuxemburgues);
		llistaIdiomesLU.add(iFrances);
		llistaIdiomesLU.add(iAleman);
		llistaIdiomesLU.add(iNeerlandes);
		llistaIdiomesLU.add(iPortuguesNoOficial);
		llistaIdiomesLU.add(iAnglesNoOficial);
		this.paisosIdioma.put("Luxembourg", new PaisIdioma("LU",llistaIdiomesLU));
		
		LinkedList<Idioma> llistaIdiomesLV= new LinkedList<Idioma>();
		Idioma iLetón=new Idioma("lv","Letó", "Latviešu valoda", true);
		Idioma iPolonèsNoOficial=new Idioma("pl","Polonès", "Polski", false);
		llistaIdiomesLV.add(iLetón);
		llistaIdiomesLV.add(iRusoNoOficial);
		llistaIdiomesLV.add(iAnglesNoOficial);
		llistaIdiomesLV.add(iAlemanNoOficial);	
		llistaIdiomesLV.add(iPolonèsNoOficial);
		this.paisosIdioma.put("Latvia", new PaisIdioma("LV",llistaIdiomesLV));
		
		LinkedList<Idioma> llistaIdiomesLY= new LinkedList<Idioma>();
		llistaIdiomesLY.add(iArabe);
		llistaIdiomesLY.add(iItalianoNoOficial);
		this.paisosIdioma.put("Libya", new PaisIdioma("LY",llistaIdiomesLY));
		
		LinkedList<Idioma> llistaIdiomesMA= new LinkedList<Idioma>();
		llistaIdiomesMA.add(iArabe);
		//Bereber
		llistaIdiomesMA.add(iFrancesNoOficial);
		llistaIdiomesMA.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Morocco", new PaisIdioma("MA",llistaIdiomesMA));
		
		LinkedList<Idioma> llistaIdiomesMC= new LinkedList<Idioma>();
		llistaIdiomesMC.add(iFrances);
		//Monegasco
		llistaIdiomesMC.add(iItalianoNoOficial);
		llistaIdiomesMC.add(iAnglesNoOficial);		
		this.paisosIdioma.put("Monaco", new PaisIdioma("MC",llistaIdiomesMC));
		
		LinkedList<Idioma> llistaIdiomesMD= new LinkedList<Idioma>();
		Idioma iRumano=new Idioma("ro","Romanès", "Română", true);
		llistaIdiomesMD.add(iRumano);
		llistaIdiomesMD.add(iRusoNoOficial);
		this.paisosIdioma.put("Moldova, Republic of", new PaisIdioma("MD",llistaIdiomesMD));
		
		LinkedList<Idioma> llistaIdiomesME= new LinkedList<Idioma>();

		//Montenegrino oficial
		//Serbio y Bosnio
		llistaIdiomesME.add(iMontenegrí);
		llistaIdiomesME.add(iSerbi);
		llistaIdiomesME.add(iBosnià);
		llistaIdiomesME.add(iCroat);
		llistaIdiomesME.add(iAlbanes);	

		this.paisosIdioma.put("Montenegro", new PaisIdioma("ME",llistaIdiomesME));
		
		LinkedList<Idioma> llistaIdiomesMF= new LinkedList<Idioma>();
		llistaIdiomesMF.add(iFrances);
		llistaIdiomesMF.add(iAnglesNoOficial);
		this.paisosIdioma.put("Saint Martin (French part)", new PaisIdioma("MF",llistaIdiomesMF));
		
		LinkedList<Idioma> llistaIdiomesMG= new LinkedList<Idioma>();
		Idioma iMalgache=new Idioma("mg","Malgaix", "Malagasy", true);

		llistaIdiomesMG.add(iMalgache);
		llistaIdiomesMG.add(iFrances);
		llistaIdiomesMG.add(iAnglesNoOficial);
		this.paisosIdioma.put("Madagascar", new PaisIdioma("MG",llistaIdiomesMG));
		
		LinkedList<Idioma> llistaIdiomesMH= new LinkedList<Idioma>();
		//Marshalles
		llistaIdiomesMH.add(iAnglesOficial);
		llistaIdiomesMH.add(iJaponesNoOficial);
		llistaIdiomesMH.add(iEspanyolNoOficial);	
		this.paisosIdioma.put("Marshall Islands", new PaisIdioma("MH",llistaIdiomesMH));
		
		LinkedList<Idioma> llistaIdiomesMK= new LinkedList<Idioma>();
		Idioma iMacedonio=new Idioma("mg","Macedoni", "Македонски", true);
		llistaIdiomesMK.add(iMacedonio);
		llistaIdiomesMK.add(iAlbanes);
		llistaIdiomesMK.add(iTurcoNoOficial);
		this.paisosIdioma.put("Macedonia, the former Yugoslav Republic of", new PaisIdioma("MK",llistaIdiomesMK));
		
		LinkedList<Idioma> llistaIdiomesML= new LinkedList<Idioma>();
		llistaIdiomesML.add(iFrances);
		llistaIdiomesML.add(iFula);
		this.paisosIdioma.put("Mali", new PaisIdioma("ML",llistaIdiomesML));
		
		LinkedList<Idioma> llistaIdiomesMM= new LinkedList<Idioma>();
		Idioma iTamilNoOficial=new Idioma("ta", "Tamil","தமிழ்", false);
		Idioma iBirmà=new Idioma("my","Birmà","မြန်မာဘာသာ", true);
		
		llistaIdiomesMM.add(iBirmà);
		llistaIdiomesMM.add(iAnglesNoOficial);//xksi
		llistaIdiomesMM.add(iTamilNoOficial);
		this.paisosIdioma.put("Myanmar", new PaisIdioma("MM",llistaIdiomesMM));
		
		LinkedList<Idioma> llistaIdiomesMN= new LinkedList<Idioma>();
		Idioma iMongol=new Idioma("mn","Mongol","Монгол хэл", true);
		llistaIdiomesMN.add(iMongol);
		llistaIdiomesMN.add(iAnglesNoOficial);//xksi
		this.paisosIdioma.put("Mongolia", new PaisIdioma("MN",llistaIdiomesMN));
		
		LinkedList<Idioma> llistaIdiomesMO= new LinkedList<Idioma>();
		Idioma iCantones=new Idioma("yue", "Cantonés","廣東話 / 广东话", true);
		llistaIdiomesMO.add(iCantones);
		llistaIdiomesMO.add(iPortugues);
		llistaIdiomesMO.add(iAnglesNoOficial);
		llistaIdiomesMO.add(iChinoNoOficial);		
		this.paisosIdioma.put("Macao", new PaisIdioma("MO",llistaIdiomesMO));
		
		LinkedList<Idioma> llistaIdiomesMP= new LinkedList<Idioma>();
		llistaIdiomesMP.add(iAnglesOficial);
		//Chamorro
		//Carolinian
		llistaIdiomesMP.add(iJaponesNoOficial);
		llistaIdiomesMP.add(iChinoNoOficial);
		this.paisosIdioma.put("Northern Mariana Islands", new PaisIdioma("MP",llistaIdiomesMP));
		
		LinkedList<Idioma> llistaIdiomesMQ= new LinkedList<Idioma>();
		llistaIdiomesMQ.add(iFrances);
		this.paisosIdioma.put("Martinique", new PaisIdioma("MQ",llistaIdiomesMQ));
		
		LinkedList<Idioma> llistaIdiomesMR= new LinkedList<Idioma>();
		llistaIdiomesMR.add(iArabe);
		llistaIdiomesMR.add(iFula);
		this.paisosIdioma.put("Mauritania", new PaisIdioma("MR",llistaIdiomesMR));
		
		LinkedList<Idioma> llistaIdiomesMS= new LinkedList<Idioma>();
		llistaIdiomesMS.add(iAnglesOficial);
		this.paisosIdioma.put("Montserrat", new PaisIdioma("MS",llistaIdiomesMS));
		
		LinkedList<Idioma> llistaIdiomesMT= new LinkedList<Idioma>();

		Idioma iMaltes=new Idioma("mt","Maltès","Malti", true);
		llistaIdiomesMT.add(iMaltes);
		llistaIdiomesMT.add(iAnglesOficial);
		llistaIdiomesMT.add(iItalianoNoOficial);
		this.paisosIdioma.put("Malta", new PaisIdioma("MT",llistaIdiomesMT));
		
		LinkedList<Idioma> llistaIdiomesMU= new LinkedList<Idioma>();
		llistaIdiomesMU.add(iAnglesOficial);
		llistaIdiomesMU.add(iFrances);
		llistaIdiomesMU.add(iHindi);
		llistaIdiomesMU.add(iTamilNoOficial);		
		this.paisosIdioma.put("Mauritius", new PaisIdioma("MU",llistaIdiomesMU));
		
		LinkedList<Idioma> llistaIdiomesMV= new LinkedList<Idioma>();
		//Dhivehi 
		llistaIdiomesMV.add(iAnglesNoOficial);
		this.paisosIdioma.put("Maldives", new PaisIdioma("MV",llistaIdiomesMV));
		
		LinkedList<Idioma> llistaIdiomesMW= new LinkedList<Idioma>();
		Idioma iTumbuka=new Idioma("tum", "Tumbuka","Chitumbuka", true);
		Idioma iChichewa=new Idioma("ny", "Chichewa","Chinyanja", true);
		llistaIdiomesMW.add(iTumbuka);
		llistaIdiomesMW.add(iChichewa);
		llistaIdiomesMW.add(iAnglesNoOficial);
		this.paisosIdioma.put("Malawi", new PaisIdioma("MW",llistaIdiomesMW));
		
		LinkedList<Idioma> llistaIdiomesMX= new LinkedList<Idioma>();
		llistaIdiomesMX.add(iEspanyol);
		this.paisosIdioma.put("Mexico", new PaisIdioma("MX",llistaIdiomesMX));
		
		LinkedList<Idioma> llistaIdiomesMY= new LinkedList<Idioma>();
		llistaIdiomesMY.add(iMalayo);
		llistaIdiomesMY.add(iAnglesNoOficial);
		llistaIdiomesMY.add(iChinoNoOficial);
		llistaIdiomesMY.add(iTamilNoOficial);	
		llistaIdiomesMY.add(iTéluguNoOficial);	
		llistaIdiomesMY.add(iThaiNoOficial);
		this.paisosIdioma.put("Malaysia", new PaisIdioma("MY",llistaIdiomesMY));
		
		LinkedList<Idioma> llistaIdiomesMZ= new LinkedList<Idioma>();
		llistaIdiomesMZ.add(iPortugues);
		this.paisosIdioma.put("Mozambique", new PaisIdioma("MZ",llistaIdiomesMZ));
		
		LinkedList<Idioma> llistaIdiomesNA= new LinkedList<Idioma>();
		Idioma iAfrikaans=new Idioma("af", "Afrikaans","Afrikaans", true);
		llistaIdiomesNA.add(iAfrikaans);
		llistaIdiomesNA.add(iAnglesOficial);
		llistaIdiomesNA.add(iAlemanNoOficial);
		this.paisosIdioma.put("Namibia", new PaisIdioma("NA",llistaIdiomesNA));
		
		LinkedList<Idioma> llistaIdiomesNC= new LinkedList<Idioma>();
		Idioma iJavanesNoOficial=new Idioma("jav", "Javanés","ꦧꦱꦗꦮ", false);
		//Idioma iJavanes=new Idioma("jav", "Javanes","ꦧꦱꦗꦮ", true);
		llistaIdiomesNC.add(iFrances);
		llistaIdiomesNC.add(iJaponesNoOficial);		
		llistaIdiomesNC.add(iJavanesNoOficial);
		this.paisosIdioma.put("New Caledonia", new PaisIdioma("NC",llistaIdiomesNC));
		
		LinkedList<Idioma> llistaIdiomesNE= new LinkedList<Idioma>();
		Idioma iHausa=new Idioma("ha", "Hausa","Hausa", true);
		
		llistaIdiomesNE.add(iHausa);
		llistaIdiomesNE.add(iFrances);
		llistaIdiomesNE.add(iFulaNoOficial);
		this.paisosIdioma.put("Niger", new PaisIdioma("NE",llistaIdiomesNE));
		
		LinkedList<Idioma> llistaIdiomesNF= new LinkedList<Idioma>();
		//Norfuk
		llistaIdiomesNF.add(iAnglesOficial);
		this.paisosIdioma.put("Norfolk Island", new PaisIdioma("NF",llistaIdiomesNF));
		
		LinkedList<Idioma> llistaIdiomesNG= new LinkedList<Idioma>();
		llistaIdiomesNG.add(iAnglesOficial);
		llistaIdiomesNG.add(iHausaNoOficial);
		llistaIdiomesNG.add(iYorubaNoOficial);
		llistaIdiomesNG.add(iIgboNoOficial);
		this.paisosIdioma.put("Nigeria", new PaisIdioma("NG",llistaIdiomesNG));
		
		LinkedList<Idioma> llistaIdiomesNI= new LinkedList<Idioma>();
		llistaIdiomesNI.add(iEspanyol);
		this.paisosIdioma.put("Nicaragua", new PaisIdioma("NI",llistaIdiomesNI));
		
		LinkedList<Idioma> llistaIdiomesNL= new LinkedList<Idioma>();
		Idioma iLimburgués=new Idioma("li", "Limburguès","Lèmbörgs", true);

		
		llistaIdiomesNL.add(iNeerlandes);
		//Frisi Occidental
		llistaIdiomesNL.add(iAleman);//Alemany Baix
		llistaIdiomesNL.add(iLimburgués);
		llistaIdiomesNL.add(iAnglesNoOficial);
		this.paisosIdioma.put("Netherlands", new PaisIdioma("NL",llistaIdiomesNL));
		
		LinkedList<Idioma> llistaIdiomesNO= new LinkedList<Idioma>();
		llistaIdiomesNO.add(iNoruegoOficial);
		llistaIdiomesNO.add(iAnglesOficial);
		this.paisosIdioma.put("Norway", new PaisIdioma("NO",llistaIdiomesNO));
		
		LinkedList<Idioma> llistaIdiomesNP= new LinkedList<Idioma>();
		Idioma iNepali=new Idioma("ne", "Nepalès","नेपाली", true);
		llistaIdiomesNP.add(iNepali);
		llistaIdiomesNP.add(iMaithili);
		llistaIdiomesNP.add(iAnglesNoOficial);
		llistaIdiomesNP.add(iUrduNoOficial);
		
		this.paisosIdioma.put("Nepal", new PaisIdioma("NP",llistaIdiomesNP));
		
		LinkedList<Idioma> llistaIdiomesNR= new LinkedList<Idioma>();
		//Nauruà
		llistaIdiomesNR.add(iAnglesOficial);
		this.paisosIdioma.put("Nauru", new PaisIdioma("NR",llistaIdiomesNR));
		
		LinkedList<Idioma> llistaIdiomesNU= new LinkedList<Idioma>();
		//Niueà
		llistaIdiomesNU.add(iAnglesOficial);
		this.paisosIdioma.put("Niue", new PaisIdioma("NU",llistaIdiomesNU));
		
		LinkedList<Idioma> llistaIdiomesNZ= new LinkedList<Idioma>();
		llistaIdiomesNZ.add(iAnglesOficial);
		//Maori
		this.paisosIdioma.put("New Zealand", new PaisIdioma("NZ",llistaIdiomesNZ));
		
		LinkedList<Idioma> llistaIdiomesOM= new LinkedList<Idioma>();
		llistaIdiomesOM.add(iArabe);
		llistaIdiomesOM.add(iAnglesNoOficial);		
		
		Idioma iSwahiliNoOficial=new Idioma("sw", "Swahili","Kiswahili", false);
		llistaIdiomesOM.add(iSwahiliNoOficial);
		this.paisosIdioma.put("Oman", new PaisIdioma("OM",llistaIdiomesOM));
		
		LinkedList<Idioma> llistaIdiomesPA= new LinkedList<Idioma>();
		llistaIdiomesPA.add(iEspanyol);
		llistaIdiomesPA.add(iAnglesOficial);
		this.paisosIdioma.put("Panama", new PaisIdioma("PA",llistaIdiomesPA));
		
		LinkedList<Idioma> llistaIdiomesPE= new LinkedList<Idioma>();
		llistaIdiomesPE.add(iEspanyol);
		this.paisosIdioma.put("Peru", new PaisIdioma("PE",llistaIdiomesPE));
		
		LinkedList<Idioma> llistaIdiomesPF= new LinkedList<Idioma>();
		llistaIdiomesPF.add(iFrances);
		this.paisosIdioma.put("French Polynesia", new PaisIdioma("PF",llistaIdiomesPF));
		
		LinkedList<Idioma> llistaIdiomesPG= new LinkedList<Idioma>();
		llistaIdiomesPG.add(iAnglesOficial);
		this.paisosIdioma.put("Papua New Guinea", new PaisIdioma("PG",llistaIdiomesPG));
		
		LinkedList<Idioma> llistaIdiomesPH= new LinkedList<Idioma>();
		Idioma iFilipi=new Idioma("tl", "Filipí","Filipino", true);
		llistaIdiomesPH.add(iFilipi);
		llistaIdiomesPH.add(iAnglesOficial);
		this.paisosIdioma.put("Philippines", new PaisIdioma("PH",llistaIdiomesPH));
		
		LinkedList<Idioma> llistaIdiomesPK= new LinkedList<Idioma>();
		Idioma iSindhiPakistan=new Idioma("sdp","Sindhi", "سِنڌِي", true);  //escriptura perso-àrab
		
		llistaIdiomesPK.add(iUrdu);
		llistaIdiomesPK.add(iAnglesOficial);
		llistaIdiomesPK.add(iSindhiPakistan);		
		this.paisosIdioma.put("Pakistan", new PaisIdioma("PK",llistaIdiomesPK));
		
		LinkedList<Idioma> llistaIdiomesPL= new LinkedList<Idioma>();
		//polones o polaco
		Idioma iPolonès=new Idioma("pl","Polonès", "Polski", true);
		llistaIdiomesPL.add(iPolonès);
		llistaIdiomesPL.add(iAnglesNoOficial);//xksi
		llistaIdiomesPL.add(iAlemanNoOficial);
		llistaIdiomesPL.add(iRusoNoOficial);		
		this.paisosIdioma.put("Poland", new PaisIdioma("PL",llistaIdiomesPL));
		
		LinkedList<Idioma> llistaIdiomesPM= new LinkedList<Idioma>();
		Idioma iGascon=new Idioma("gsc","Gascó", "Gascon", true);		
		llistaIdiomesPM.add(iFrances);
		llistaIdiomesPM.add(iGascon);
		llistaIdiomesPM.add(iAnglesNoOficial);		
		this.paisosIdioma.put("Saint Pierre and Miquelon", new PaisIdioma("PM",llistaIdiomesPM));
		
		LinkedList<Idioma> llistaIdiomesPN= new LinkedList<Idioma>();
		llistaIdiomesPN.add(iAnglesOficial);
		this.paisosIdioma.put("Pitcairn", new PaisIdioma("PN",llistaIdiomesPN));
		
		LinkedList<Idioma> llistaIdiomesPR= new LinkedList<Idioma>();
		llistaIdiomesPR.add(iEspanyol);
		llistaIdiomesPR.add(iAnglesOficial);
		this.paisosIdioma.put("Puerto Rico", new PaisIdioma("PR",llistaIdiomesPR));
		
		LinkedList<Idioma> llistaIdiomesPS= new LinkedList<Idioma>();
		Idioma iHebreoNoOficial=new Idioma("he", "Hebreu","עברית (Ivrit)", false);
		llistaIdiomesPS.add(iArabe);
		llistaIdiomesPS.add(iHebreoNoOficial);
		llistaIdiomesPS.add(iAnglesNoOficial);
		llistaIdiomesPS.add(iFrancesNoOficial);
		llistaIdiomesPS.add(iTurcoNoOficial);		
		this.paisosIdioma.put("Palestine", new PaisIdioma("PS",llistaIdiomesPS));
		
		LinkedList<Idioma> llistaIdiomesPT= new LinkedList<Idioma>();
		Idioma iGallegoNoOficial=new Idioma("gl", "Gallego","Galego", false);
		llistaIdiomesPT.add(iPortugues);
		llistaIdiomesPT.add(iGallegoNoOficial);
		this.paisosIdioma.put("Portugal", new PaisIdioma("PT",llistaIdiomesPT));
		
		LinkedList<Idioma> llistaIdiomesPW= new LinkedList<Idioma>();
		//Palaues
		llistaIdiomesPW.add(iAnglesOficial);
		llistaIdiomesPW.add(iJaponesNoOficial);
		llistaIdiomesPW.add(iChinoNoOficial);
		llistaIdiomesPW.add(iCoreanoNoOficial);		
		this.paisosIdioma.put("Palau", new PaisIdioma("PW",llistaIdiomesPW));
		
		LinkedList<Idioma> llistaIdiomesPY= new LinkedList<Idioma>();
		llistaIdiomesPY.add(iEspanyol);
		llistaIdiomesPY.add(iPortuguesNoOficial);
		llistaIdiomesPY.add(iAlemanNoOficial);	
		this.paisosIdioma.put("Paraguay", new PaisIdioma("PY",llistaIdiomesPY));
		
		LinkedList<Idioma> llistaIdiomesQA= new LinkedList<Idioma>();
		Idioma iBengaliNoOficial=new Idioma("bn", "Bengalí", "বাংলা", false);
		llistaIdiomesQA.add(iArabe);
		llistaIdiomesQA.add(iAnglesNoOficial);
		llistaIdiomesQA.add(iHindiNoOficial);
		llistaIdiomesQA.add(iUrduNoOficial);
		llistaIdiomesQA.add(iTamilNoOficial);
		llistaIdiomesQA.add(iBengaliNoOficial);
		this.paisosIdioma.put("Qatar", new PaisIdioma("QA",llistaIdiomesQA));
		
		LinkedList<Idioma> llistaIdiomesRE= new LinkedList<Idioma>();
		llistaIdiomesRE.add(iFrances);
		llistaIdiomesRE.add(iTamilNoOficial);
		llistaIdiomesRE.add(iUrduNoOficial);		
		this.paisosIdioma.put("Réunion", new PaisIdioma("RE",llistaIdiomesRE));
		
		LinkedList<Idioma> llistaIdiomesRO= new LinkedList<Idioma>();
		llistaIdiomesRO.add(iRumano);
		llistaIdiomesRO.add(iAnglesNoOficial);
		llistaIdiomesRO.add(iBengaliNoOficial);
		llistaIdiomesRO.add(iAlemanNoOficial);		
		this.paisosIdioma.put("Romania", new PaisIdioma("RO",llistaIdiomesRO));
		
		LinkedList<Idioma> llistaIdiomesRS= new LinkedList<Idioma>();

		llistaIdiomesRS.add(iSerbi);
		llistaIdiomesRS.add(iBosniàNoOficial);
		llistaIdiomesRS.add(iCroatNoOficial);
		llistaIdiomesRS.add(iAnglesNoOficial);
		this.paisosIdioma.put("Serbia", new PaisIdioma("RS",llistaIdiomesRS));
		
		LinkedList<Idioma> llistaIdiomesRU= new LinkedList<Idioma>();
		llistaIdiomesRU.add(iRuso);
		this.paisosIdioma.put("Russian Federation", new PaisIdioma("RU",llistaIdiomesRU));
		
		LinkedList<Idioma> llistaIdiomesRW= new LinkedList<Idioma>();
		
		Idioma iKinyarwanda=new Idioma("rw", "Kinyarwanda", "Ikinyarwanda", true);
		llistaIdiomesRW.add(iKinyarwanda);
		llistaIdiomesRW.add(iFrances);
		llistaIdiomesRW.add(iAnglesOficial);
		llistaIdiomesRW.add(iSwahili);
		this.paisosIdioma.put("Rwanda", new PaisIdioma("RW",llistaIdiomesRW));
		
		LinkedList<Idioma> llistaIdiomesSA= new LinkedList<Idioma>();
		llistaIdiomesSA.add(iArabe);
		llistaIdiomesSA.add(iUrduNoOficial);
		llistaIdiomesSA.add(iHindiNoOficial);		
		this.paisosIdioma.put("Saudi Arabia", new PaisIdioma("SA",llistaIdiomesSA));
		
		LinkedList<Idioma> llistaIdiomesSB= new LinkedList<Idioma>();
		llistaIdiomesSB.add(iAnglesOficial);
		this.paisosIdioma.put("Solomon Islands", new PaisIdioma("SB",llistaIdiomesSB));
		
		LinkedList<Idioma> llistaIdiomesSC= new LinkedList<Idioma>();
		llistaIdiomesSC.add(iFrances);
		llistaIdiomesSC.add(iAnglesOficial);
		this.paisosIdioma.put("Seychelles", new PaisIdioma("SC",llistaIdiomesSC));
		
		LinkedList<Idioma> llistaIdiomesSD= new LinkedList<Idioma>();
		llistaIdiomesSD.add(iArabe);
		llistaIdiomesSD.add(iAnglesOficial);
		llistaIdiomesSD.add(iHausaNoOficial);
		llistaIdiomesSD.add(iFulaNoOficial);
		this.paisosIdioma.put("Sudan", new PaisIdioma("SD",llistaIdiomesSD));
		
		LinkedList<Idioma> llistaIdiomesSE= new LinkedList<Idioma>();
		//Suec
		llistaIdiomesSE.add(iSuecoOficial);
		//Fines
		llistaIdiomesSE.add(iFinesOficial);
		llistaIdiomesSE.add(iAnglesOficial);
		this.paisosIdioma.put("Sweden", new PaisIdioma("SE",llistaIdiomesSE));
		
		LinkedList<Idioma> llistaIdiomesSG= new LinkedList<Idioma>();
		llistaIdiomesSG.add(iChino);
		llistaIdiomesSG.add(iMalayo);
		llistaIdiomesSG.add(iTamil);
		llistaIdiomesSG.add(iAnglesOficial);
		llistaIdiomesSG.add(iCantonesNoOficial);
		llistaIdiomesSG.add(iBengaliNoOficial);
		llistaIdiomesSG.add(iUrduNoOficial);		
		this.paisosIdioma.put("Singapore", new PaisIdioma("SG",llistaIdiomesSG));
		
		LinkedList<Idioma> llistaIdiomesSH= new LinkedList<Idioma>();
		llistaIdiomesSH.add(iAnglesOficial);
		this.paisosIdioma.put("Saint Helena, Ascension and Tristan da Cunha", new PaisIdioma("SH",llistaIdiomesSH));
		
		LinkedList<Idioma> llistaIdiomesSI= new LinkedList<Idioma>();
		//Eslove
		llistaIdiomesSI.add(iItalianoNoOficial);
		llistaIdiomesSI.add(iHungaroNoOficial);
		this.paisosIdioma.put("Slovenia", new PaisIdioma("SI",llistaIdiomesSI));
		
		LinkedList<Idioma> llistaIdiomesSJ= new LinkedList<Idioma>();
		//Noruec
		llistaIdiomesSJ.add(iNoruegoOficial);
		llistaIdiomesSJ.add(iAnglesNoOficial);
		this.paisosIdioma.put("Svalbard and Jan Mayen", new PaisIdioma("SJ",llistaIdiomesSJ));
		
		LinkedList<Idioma> llistaIdiomesSK= new LinkedList<Idioma>();
		Idioma iEslovac=new Idioma("sk", "Eslovac","Slovenčina", true);
		llistaIdiomesSK.add(iEslovac);
		llistaIdiomesSK.add(iHungaroNoOficial);
		llistaIdiomesSK.add(iAnglesNoOficial); //xksi
		this.paisosIdioma.put("Slovakia", new PaisIdioma("SK",llistaIdiomesSK));
		
		LinkedList<Idioma> llistaIdiomesSL= new LinkedList<Idioma>();
		llistaIdiomesSL.add(iAnglesOficial);
		llistaIdiomesSL.add(iFulaNoOficial);
		this.paisosIdioma.put("Sierra Leone", new PaisIdioma("SL",llistaIdiomesSL));
		
		LinkedList<Idioma> llistaIdiomesSM= new LinkedList<Idioma>();
		llistaIdiomesSM.add(iItaliano);
		this.paisosIdioma.put("San Marino", new PaisIdioma("SM",llistaIdiomesSM));
		
		LinkedList<Idioma> llistaIdiomesSN= new LinkedList<Idioma>();
		llistaIdiomesSN.add(iFrances);
		llistaIdiomesSN.add(iFula);
		this.paisosIdioma.put("Senegal", new PaisIdioma("SN",llistaIdiomesSN));
		
		LinkedList<Idioma> llistaIdiomesSO= new LinkedList<Idioma>();
		llistaIdiomesSO.add(iSomalí);
		llistaIdiomesSO.add(iArabe);
		llistaIdiomesSO.add(iOromoNoOficial);
		this.paisosIdioma.put("Somalia", new PaisIdioma("SO",llistaIdiomesSO));
		
		LinkedList<Idioma> llistaIdiomesSR= new LinkedList<Idioma>();
		llistaIdiomesSR.add(iNeerlandes);
		llistaIdiomesSR.add(iHindiNoOficial);
		llistaIdiomesSR.add(iJavanesNoOficial);
		llistaIdiomesSR.add(iPortuguesNoOficial);
		this.paisosIdioma.put("Suriname", new PaisIdioma("SR",llistaIdiomesSR));
		
		LinkedList<Idioma> llistaIdiomesSS= new LinkedList<Idioma>();
		llistaIdiomesSS.add(iAnglesOficial);
		llistaIdiomesSS.add(iArabe);
		this.paisosIdioma.put("South Sudan", new PaisIdioma("SS",llistaIdiomesSS));
		
		LinkedList<Idioma> llistaIdiomesST= new LinkedList<Idioma>();
		llistaIdiomesST.add(iPortugues);
		this.paisosIdioma.put("Sao Tome and Principe", new PaisIdioma("ST",llistaIdiomesST));

		LinkedList<Idioma> llistaIdiomesSV= new LinkedList<Idioma>();
		Idioma iNáhuatl=new Idioma("nah", "Náhuatl","Nāhuatl", true);
		llistaIdiomesSV.add(iEspanyol);
		llistaIdiomesSV.add(iNáhuatl);
		this.paisosIdioma.put("El Salvador", new PaisIdioma("SV",llistaIdiomesSV));
		
		LinkedList<Idioma> llistaIdiomesSX= new LinkedList<Idioma>();
		llistaIdiomesSX.add(iNeerlandes);
		llistaIdiomesSX.add(iAnglesOficial);
		this.paisosIdioma.put("Sint Maarten (Dutch part)", new PaisIdioma("SX",llistaIdiomesSX));

		LinkedList<Idioma> llistaIdiomesSY= new LinkedList<Idioma>();
		Idioma iKurdLlatiNoOficial=new Idioma("kul", "Kurd","Kurdî", true);	
		llistaIdiomesSY.add(iArabe);
		llistaIdiomesSY.add(iAnglesOficial);
		llistaIdiomesSY.add(iKurdLlatiNoOficial);
		llistaIdiomesSY.add(iTurcoNoOficial);
		this.paisosIdioma.put("Syrian Arab Republic", new PaisIdioma("SY",llistaIdiomesSY));
		
		LinkedList<Idioma> llistaIdiomesSZ= new LinkedList<Idioma>();
		Idioma iSiswati=new Idioma("ss", "Siswati","SiSwati", true);
		llistaIdiomesSZ.add(iSiswati);
		llistaIdiomesSZ.add(iAnglesOficial);
		this.paisosIdioma.put("Swaziland", new PaisIdioma("SZ",llistaIdiomesSZ));
		
		LinkedList<Idioma> llistaIdiomesTC= new LinkedList<Idioma>();
		llistaIdiomesTC.add(iAnglesOficial);
		llistaIdiomesTC.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Turks and Caicos Islands", new PaisIdioma("TC",llistaIdiomesTC));
		
		LinkedList<Idioma> llistaIdiomesTD= new LinkedList<Idioma>();
		llistaIdiomesTD.add(iArabe);
		llistaIdiomesTD.add(iFrances);
		llistaIdiomesTD.add(iHausaNoOficial);
		llistaIdiomesTD.add(iFulaNoOficial);
		this.paisosIdioma.put("Chad", new PaisIdioma("TD",llistaIdiomesTD));
		
		LinkedList<Idioma> llistaIdiomesTF= new LinkedList<Idioma>();
		llistaIdiomesTF.add(iFrances);
		this.paisosIdioma.put("French Southern Territories", new PaisIdioma("TF",llistaIdiomesTF));
		
		LinkedList<Idioma> llistaIdiomesTG= new LinkedList<Idioma>();
		llistaIdiomesTG.add(iFrances);
		llistaIdiomesTG.add(iHausaNoOficial);
		llistaIdiomesTG.add(iYorubaNoOficial);
		llistaIdiomesTG.add(iFulaNoOficial);
		
		this.paisosIdioma.put("Togo", new PaisIdioma("TG",llistaIdiomesTG));
		
		LinkedList<Idioma> llistaIdiomesTH= new LinkedList<Idioma>();
		Idioma iThai=new Idioma("th", "Thai", "ภาษาไทย", true);
		Idioma iKhmerNoOficial=new Idioma("km", "Khmer", "ខ្មែរ", false);
		
		llistaIdiomesTH.add(iThai);
		llistaIdiomesTH.add(iKhmerNoOficial);
		llistaIdiomesTH.add(iAnglesNoOficial);
		llistaIdiomesTH.add(iChinoNoOficial);
		
		this.paisosIdioma.put("Thailand", new PaisIdioma("TH",llistaIdiomesTH));
		
		LinkedList<Idioma> llistaIdiomesTJ= new LinkedList<Idioma>();
		Idioma iTayiko=new Idioma("tg", "Tadjik", "Тоҷикӣ", true);
		llistaIdiomesTJ.add(iTayiko);
		llistaIdiomesTJ.add(iRusoNoOficial);
		llistaIdiomesTJ.add(iPersaNoOficial);
		this.paisosIdioma.put("Tajikistan", new PaisIdioma("TJ",llistaIdiomesTJ));
		
		LinkedList<Idioma> llistaIdiomesTK= new LinkedList<Idioma>();
		//Tokelauès 
		llistaIdiomesTK.add(iAnglesOficial);
		this.paisosIdioma.put("Tokelau", new PaisIdioma("TK",llistaIdiomesTK));
		
		LinkedList<Idioma> llistaIdiomesTL= new LinkedList<Idioma>();
		Idioma iIndonesioNoOficial=new Idioma("id", "Indonesio","Bahasa Indonesia", false);
		//Tetum
		llistaIdiomesTL.add(iPortugues);
		llistaIdiomesTL.add(iIndonesioNoOficial);
		llistaIdiomesTL.add(iAnglesNoOficial);
		this.paisosIdioma.put("Timor-Leste", new PaisIdioma("TL",llistaIdiomesTL));
		
		LinkedList<Idioma> llistaIdiomesTM= new LinkedList<Idioma>();
		Idioma iTurcman=new Idioma("tk", "Turcman","Türkmen dili", false);
		llistaIdiomesTM.add(iTurcman);
		llistaIdiomesTM.add(iRusoNoOficial);
		llistaIdiomesTM.add(iAnglesNoOficial);
		this.paisosIdioma.put("Turkmenistan", new PaisIdioma("TM",llistaIdiomesTM));
		
		LinkedList<Idioma> llistaIdiomesTN= new LinkedList<Idioma>();
		llistaIdiomesTN.add(iArabe);
		//Berlusca
		llistaIdiomesTN.add(iFrancesNoOficial);
		llistaIdiomesTN.add(iItalianoNoOficial);
		llistaIdiomesTN.add(iAnglesNoOficial);
		this.paisosIdioma.put("Tunisia", new PaisIdioma("TN",llistaIdiomesTN));
		
		LinkedList<Idioma> llistaIdiomesTO= new LinkedList<Idioma>();
		Idioma iTonganes=new Idioma("to", "Tongà","Lea faka-Tonga", false);
		llistaIdiomesTO.add(iTonganes);
		llistaIdiomesTO.add(iAnglesOficial);
		this.paisosIdioma.put("Tonga", new PaisIdioma("TO",llistaIdiomesTO));
		
		LinkedList<Idioma> llistaIdiomesTR= new LinkedList<Idioma>();

		llistaIdiomesTR.add(iTurco);
		llistaIdiomesTR.add(iArabeNoOficial);
		llistaIdiomesTR.add(iGriegoNoOficial);
		llistaIdiomesTR.add(iKurdLlatiNoOficial);
		this.paisosIdioma.put("Turkey", new PaisIdioma("TR",llistaIdiomesTR));
		
		LinkedList<Idioma> llistaIdiomesTT= new LinkedList<Idioma>();
		llistaIdiomesTT.add(iAnglesOficial);
		llistaIdiomesTT.add(iFrancesNoOficial);
		llistaIdiomesTT.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Trinidad and Tobago", new PaisIdioma("TT",llistaIdiomesTT));
		
		LinkedList<Idioma> llistaIdiomesTV= new LinkedList<Idioma>();
		//Tuvaluà
		llistaIdiomesTV.add(iAnglesOficial);
		this.paisosIdioma.put("Tuvalu", new PaisIdioma("TV",llistaIdiomesTV));
		
		LinkedList<Idioma> llistaIdiomesTW= new LinkedList<Idioma>();
		llistaIdiomesTW.add(iChino);
		//Taiwanes hokken
		llistaIdiomesTW.add(iAnglesNoOficial);
		llistaIdiomesTW.add(iJaponesNoOficial);
		this.paisosIdioma.put("Taiwan", new PaisIdioma("TW",llistaIdiomesTW));
		
		LinkedList<Idioma> llistaIdiomesTZ= new LinkedList<Idioma>();
		Idioma iGujaratiNoOficial=new Idioma("gu", "Gujarati","ગુજરાતી ", false);	
		llistaIdiomesTZ.add(iSwahili);
		llistaIdiomesTZ.add(iAnglesOficial);
		llistaIdiomesTZ.add(iGujaratiNoOficial);
		this.paisosIdioma.put("Tanzania, United Republic of", new PaisIdioma("TZ",llistaIdiomesTZ));
		
		LinkedList<Idioma> llistaIdiomesUA= new LinkedList<Idioma>();
	
		Idioma iUcraïnès=new Idioma("uk", "Ucraïnès","Українська", true);
		llistaIdiomesUA.add(iUcraïnès);
		llistaIdiomesUA.add(iRusoNoOficial);
		this.paisosIdioma.put("Ukraine", new PaisIdioma("UA",llistaIdiomesUA));
		
		LinkedList<Idioma> llistaIdiomesUG= new LinkedList<Idioma>();
		llistaIdiomesUG.add(iAnglesOficial);
		llistaIdiomesUG.add(iSwahili);
		llistaIdiomesUG.add(iGujaratiNoOficial);
		this.paisosIdioma.put("Uganda", new PaisIdioma("UG",llistaIdiomesUG));
		
		LinkedList<Idioma> llistaIdiomesUM= new LinkedList<Idioma>();
		llistaIdiomesUM.add(iAnglesOficial);
		this.paisosIdioma.put("United States Minor Outlying Islands", new PaisIdioma("UM",llistaIdiomesUM));
		
		LinkedList<Idioma> llistaIdiomesUS= new LinkedList<Idioma>();
		llistaIdiomesUS.add(iAnglesOficial);
		llistaIdiomesUS.add(iEspanyolNoOficial);
		llistaIdiomesUS.add(iFrancesNoOficial);
		//Navajo
		this.paisosIdioma.put("United States of America", new PaisIdioma("US",llistaIdiomesUS));
		
		LinkedList<Idioma> llistaIdiomesUY= new LinkedList<Idioma>();
		llistaIdiomesUY.add(iEspanyol);
		llistaIdiomesUY.add(iItalianoNoOficial);
		llistaIdiomesUY.add(iPortuguesNoOficial);
		this.paisosIdioma.put("Uruguay", new PaisIdioma("UY",llistaIdiomesUY));
		
		LinkedList<Idioma> llistaIdiomesUZ= new LinkedList<Idioma>();
		Idioma iUzbek=new Idioma("uz", "Uzbek","Oʻzbek tili", true);
		llistaIdiomesUZ.add(iUzbek);
		llistaIdiomesUZ.add(iRusoNoOficial);		
		this.paisosIdioma.put("Uzbekistan", new PaisIdioma("UZ",llistaIdiomesUZ));
		
		LinkedList<Idioma> llistaIdiomesVA= new LinkedList<Idioma>();
		//Llati
		llistaIdiomesVA.add(iItalianoNoOficial);
		llistaIdiomesVA.add(iFrancesNoOficial);
		llistaIdiomesVA.add(iEspanyolNoOficial);
		llistaIdiomesVA.add(iAlemanNoOficial);
		llistaIdiomesVA.add(iAnglesNoOficial);		
		this.paisosIdioma.put("Holy See", new PaisIdioma("VA",llistaIdiomesVA));
		
		LinkedList<Idioma> llistaIdiomesVC= new LinkedList<Idioma>();
		llistaIdiomesVC.add(iAnglesOficial);
		this.paisosIdioma.put("Saint Vincent and the Grenadines", new PaisIdioma("VC",llistaIdiomesVC));
		
		LinkedList<Idioma> llistaIdiomesVE= new LinkedList<Idioma>();
		llistaIdiomesVE.add(iEspanyol);
		this.paisosIdioma.put("Venezuela, Bolivarian Republic of", new PaisIdioma("VE",llistaIdiomesVE));
		
		LinkedList<Idioma> llistaIdiomesVG= new LinkedList<Idioma>();
		llistaIdiomesVG.add(iAnglesOficial);
		llistaIdiomesVG.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Virgin Islands, British", new PaisIdioma("VG",llistaIdiomesVG));
		
		LinkedList<Idioma> llistaIdiomesVI= new LinkedList<Idioma>();
		llistaIdiomesVI.add(iAnglesOficial);
		llistaIdiomesVI.add(iEspanyolNoOficial);
		this.paisosIdioma.put("Virgin Islands, U.S.", new PaisIdioma("VI",llistaIdiomesVI));
		
		LinkedList<Idioma> llistaIdiomesVN= new LinkedList<Idioma>();

		
		llistaIdiomesVN.add(iVietnamita);
		llistaIdiomesVN.add(iKhmerNoOficial);
		llistaIdiomesVN.add(iAnglesNoOficial);//xk si
		this.paisosIdioma.put("Viet Nam", new PaisIdioma("VN",llistaIdiomesVN));
		
		LinkedList<Idioma> llistaIdiomesVU= new LinkedList<Idioma>();
		//Bislama
		llistaIdiomesVU.add(iAnglesOficial);
		llistaIdiomesVU.add(iFrances);
		this.paisosIdioma.put("Vanuatu", new PaisIdioma("VU",llistaIdiomesVU));
		
		LinkedList<Idioma> llistaIdiomesWF= new LinkedList<Idioma>();
		llistaIdiomesWF.add(iFrances);
		this.paisosIdioma.put("Wallis and Futuna", new PaisIdioma("WF",llistaIdiomesWF));
		
		LinkedList<Idioma> llistaIdiomesWS= new LinkedList<Idioma>();
		//Samoà
		llistaIdiomesWS.add(iAnglesOficial);
		llistaIdiomesWS.add(iAlemanNoOficial);
		this.paisosIdioma.put("Samoa", new PaisIdioma("WS",llistaIdiomesWS));
		
		LinkedList<Idioma> llistaIdiomesYE= new LinkedList<Idioma>();
		llistaIdiomesYE.add(iArabe);
		llistaIdiomesYE.add(iAnglesNoOficial);
		this.paisosIdioma.put("Yemen", new PaisIdioma("YE",llistaIdiomesYE));
		
		LinkedList<Idioma> llistaIdiomesYT= new LinkedList<Idioma>();
		llistaIdiomesYT.add(iFrances);
		llistaIdiomesYT.add(iArabeNoOficial);
		this.paisosIdioma.put("Mayotte", new PaisIdioma("YT",llistaIdiomesYT));
		
		LinkedList<Idioma> llistaIdiomesZA= new LinkedList<Idioma>();
		llistaIdiomesZA.add(iAfrikaans);
		llistaIdiomesZA.add(iAnglesOficial);
		this.paisosIdioma.put("South Africa", new PaisIdioma("ZA",llistaIdiomesZA));
		
		LinkedList<Idioma> llistaIdiomesZM= new LinkedList<Idioma>();
		llistaIdiomesZM.add(iAnglesOficial);
		this.paisosIdioma.put("Zambia", new PaisIdioma("ZM",llistaIdiomesZM));
		
		LinkedList<Idioma> llistaIdiomesZW= new LinkedList<Idioma>();
		llistaIdiomesZW.add(iAnglesOficial);
		this.paisosIdioma.put("Zimbabwe", new PaisIdioma("ZW",llistaIdiomesZW));	
		
		
		

	}
	
	public Hashtable<String,PaisIdioma> getPaisIdioma()
	{
		
		return this.paisosIdioma;
	}
	public PaisIdioma getIdiomesPais(String pais)
	{
		return this.paisosIdioma.get(pais);
	}
	
	public void setPaisIdioma(Hashtable<String,PaisIdioma> paisosIdioma)
	{
		this.paisosIdioma= paisosIdioma;
	}
	
}
