package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.util.Hashtable;

public class IdiomesPrincipalsTraduits
{

 private  Hashtable<String,IdiomaPrincipalTraduit> paisosIdioma;
 
 private static IdiomesPrincipalsTraduits idiomesPrincipalsTraduits;
 
 public static  IdiomesPrincipalsTraduits getInstance()
 {
	 if (idiomesPrincipalsTraduits==null)
	 {
		 idiomesPrincipalsTraduits=new IdiomesPrincipalsTraduits();
	 }
	 return idiomesPrincipalsTraduits;
 }
 
 private IdiomesPrincipalsTraduits()
 {
	this.paisosIdioma=new  Hashtable<String,IdiomaPrincipalTraduit>();
	this.inicialitzar();
 }
 
 public Hashtable<String, IdiomaPrincipalTraduit> getPaisosIdioma()
{
	return paisosIdioma;
}
 

public void setPaisosIdioma(Hashtable<String, IdiomaPrincipalTraduit> paisosIdioma)
{
	this.paisosIdioma = paisosIdioma;
}

public void inicialitzar()
{
	
	//iso 639-1
	
	IdiomaPrincipalTraduit ingles=new IdiomaPrincipalTraduit("Inglés","English", true);//1
	this.paisosIdioma.put("en",ingles );
	
	IdiomaPrincipalTraduit chino=new IdiomaPrincipalTraduit("Chino mandarín","中文", true);//2
	this.paisosIdioma.put("zh",chino );
	
	IdiomaPrincipalTraduit hindi=new IdiomaPrincipalTraduit("Hindi","हिन्दी", true);//3
	this.paisosIdioma.put("hi",hindi );
	
	IdiomaPrincipalTraduit castella=new IdiomaPrincipalTraduit("Español","Español", true);//4
	this.paisosIdioma.put("es",castella );
	
	IdiomaPrincipalTraduit frances=new IdiomaPrincipalTraduit("Francés","Français", true);//5
	this.paisosIdioma.put("fr",frances );
	
	IdiomaPrincipalTraduit arabe=new IdiomaPrincipalTraduit("Árabe","العربية" ,true);//6
	this.paisosIdioma.put("ar",arabe );
	
	IdiomaPrincipalTraduit bengali=new IdiomaPrincipalTraduit("Bengalí","বাংলা", true);//7
	this.paisosIdioma.put("bn",bengali );
	
	IdiomaPrincipalTraduit ruso=new IdiomaPrincipalTraduit("Ruso","Русский", true);//8
	this.paisosIdioma.put("ru",ruso );
	
	IdiomaPrincipalTraduit portugues=new IdiomaPrincipalTraduit("Portugués","Portugués", true);//9
	this.paisosIdioma.put("pt",portugues );

	IdiomaPrincipalTraduit indonesio=new IdiomaPrincipalTraduit("Indonesio","Bahasa Indonesia", true);//10
	this.paisosIdioma.put("id",indonesio );
	
	IdiomaPrincipalTraduit urdu=new IdiomaPrincipalTraduit("Urdú","اُردُو", true);//11
	this.paisosIdioma.put("ur",urdu );
	
	IdiomaPrincipalTraduit aleman=new IdiomaPrincipalTraduit("Alemán","Deutsch", true);//12
	this.paisosIdioma.put("de",aleman );
	
	IdiomaPrincipalTraduit japones=new IdiomaPrincipalTraduit("Japonés","日本語", true);//13	
	this.paisosIdioma.put("ja",japones );
		
	IdiomaPrincipalTraduit swahili=new IdiomaPrincipalTraduit("Swahili","Kiswahili",true);//14
	this.paisosIdioma.put("sw",swahili );
	
	IdiomaPrincipalTraduit marathi=new IdiomaPrincipalTraduit("Maratí","मराठी", true);//15
	this.paisosIdioma.put("mr",marathi );
	
	IdiomaPrincipalTraduit telugu=new IdiomaPrincipalTraduit("Télugu","తెలుగు",true);//16
	this.paisosIdioma.put("te",telugu );
	
	IdiomaPrincipalTraduit turco=new IdiomaPrincipalTraduit("Turco","Türkçe", true);//17
	this.paisosIdioma.put("tr",turco );
	
	IdiomaPrincipalTraduit shanghaines=new IdiomaPrincipalTraduit("Shanghainés","上海话", true);//18
	this.paisosIdioma.put("wuu",shanghaines );
	
	IdiomaPrincipalTraduit tamil=new IdiomaPrincipalTraduit("Tamil","தமிழ்", true);//19
	this.paisosIdioma.put("ta",tamil );
	
	IdiomaPrincipalTraduit cantones=new IdiomaPrincipalTraduit("Cantonés","廣東話 / 广东话", true);//20
	this.paisosIdioma.put("yue",cantones );
	
	IdiomaPrincipalTraduit vietnamita=new IdiomaPrincipalTraduit("Vietnamita", "Tiếng Việt", true);//21
	this.paisosIdioma.put("vi",vietnamita );
	
	IdiomaPrincipalTraduit coreano=new IdiomaPrincipalTraduit("Coreano","한국어 / 조선말",true);//22
	this.paisosIdioma.put("ko",coreano );
	
	IdiomaPrincipalTraduit hausa=new IdiomaPrincipalTraduit("Hausa","Hausa",true);//23
	this.paisosIdioma.put("ha",hausa );
	
	IdiomaPrincipalTraduit javanes=new IdiomaPrincipalTraduit("Javanés","ꦧꦱꦗꦮ", true);//24
	this.paisosIdioma.put("jv",javanes );
	
	IdiomaPrincipalTraduit egipcio=new IdiomaPrincipalTraduit("Egipcio","المصري", true);//25
	this.paisosIdioma.put("arz",egipcio );
	
	IdiomaPrincipalTraduit italia=new IdiomaPrincipalTraduit("Italiano","Italiano", true);//26
	this.paisosIdioma.put("it",italia );
	
	IdiomaPrincipalTraduit thai=new IdiomaPrincipalTraduit("Thai","ภาษาไทย", true);//27
	this.paisosIdioma.put("th",thai );
	
	IdiomaPrincipalTraduit gujarati=new IdiomaPrincipalTraduit("Gujarati","ગુજરાતી", true);//28
	this.paisosIdioma.put("gu",gujarati );
	
	IdiomaPrincipalTraduit kannada=new IdiomaPrincipalTraduit("Kannada","ಕನ್ನಡ", true);//29
	this.paisosIdioma.put("kn",kannada );
	
	IdiomaPrincipalTraduit persa=new IdiomaPrincipalTraduit("Persa","فارسی", true);//30
	this.paisosIdioma.put("fa",persa );
	
	//Afegits pel morro
	
	IdiomaPrincipalTraduit neerlandes=new IdiomaPrincipalTraduit("Neerlandes","Nederlands", true);//añadido 31
	this.paisosIdioma.put("nl",neerlandes );
	
	IdiomaPrincipalTraduit griego=new IdiomaPrincipalTraduit("Griego","Ελληνικά", true);//añadido 32
	this.paisosIdioma.put("el",griego );
	
	IdiomaPrincipalTraduit noruego=new IdiomaPrincipalTraduit("Noruego","Norsk", true);//añadido 33
	this.paisosIdioma.put("no",noruego );
	
	IdiomaPrincipalTraduit catalan=new IdiomaPrincipalTraduit("Catalan","Català", true);//añadido 34
	this.paisosIdioma.put("ca",catalan );
		
	IdiomaPrincipalTraduit gallego=new IdiomaPrincipalTraduit("Gallego","Galego", true);//añadido 35
	this.paisosIdioma.put("gl",gallego );
	
	IdiomaPrincipalTraduit vasco=new IdiomaPrincipalTraduit("Vasco","Euskarra", true);//añadido 36
	this.paisosIdioma.put("eu",vasco );
	
	IdiomaPrincipalTraduit fines=new IdiomaPrincipalTraduit("Finés","Suomi", true);//añadido 37
	this.paisosIdioma.put("fi",fines );
	
	IdiomaPrincipalTraduit sueco=new IdiomaPrincipalTraduit("Sueco","Svenska", true);//añadido 38
	this.paisosIdioma.put("sv",sueco );
	//daki per abaix idioma no afegit a la bd
	IdiomaPrincipalTraduit filipino=new IdiomaPrincipalTraduit("Filipí","Filipino", true);//añadido 39 
	this.paisosIdioma.put("tl",filipino);
	IdiomaPrincipalTraduit birmà=new IdiomaPrincipalTraduit("Birmà","မြန်မာဘာသာ", true);//añadido 40
	this.paisosIdioma.put("my",birmà);
	IdiomaPrincipalTraduit amhàric=new IdiomaPrincipalTraduit("Amárico","አማርኛ", true);//añadido 41
	this.paisosIdioma.put("am",amhàric);
	IdiomaPrincipalTraduit polonès=new IdiomaPrincipalTraduit("Polonès","Polski", true);//añadido 42
	this.paisosIdioma.put("pl",polonès);
	IdiomaPrincipalTraduit rumano=new IdiomaPrincipalTraduit("Romanès","Română", true);//añadido 43
	this.paisosIdioma.put("ro",rumano);
	IdiomaPrincipalTraduit hongarès=new IdiomaPrincipalTraduit("Húngaro","Magyar", true);//añadido 44 
	this.paisosIdioma.put("hu",hongarès);
	IdiomaPrincipalTraduit txec=new IdiomaPrincipalTraduit("Checo","Čeština", true);//añadido 45
	this.paisosIdioma.put("cs",txec);
	IdiomaPrincipalTraduit ucraïnès=new IdiomaPrincipalTraduit("Ucraïnès","Українська", true);//añadido 46
	this.paisosIdioma.put("uk",ucraïnès);
	IdiomaPrincipalTraduit kinyarwanda=new IdiomaPrincipalTraduit("Kinyarwanda","Ikinyarwanda", true);//añadido 47
	this.paisosIdioma.put("rw",kinyarwanda);
	IdiomaPrincipalTraduit chichewa=new IdiomaPrincipalTraduit("Chichewa","Chinyanja", true);//añadido 48
	this.paisosIdioma.put("ny",chichewa);
	IdiomaPrincipalTraduit somalí=new IdiomaPrincipalTraduit("Somalí","Soomaaliga", true);//añadido 49
	this.paisosIdioma.put("so",somalí);
	IdiomaPrincipalTraduit albanès=new IdiomaPrincipalTraduit("Albanès","Shqip", true);//añadido 50
	this.paisosIdioma.put("sq",albanès);
	IdiomaPrincipalTraduit danès=new IdiomaPrincipalTraduit("Danès","Dansk", true);//añadido 51
	this.paisosIdioma.put("da",danès);
	IdiomaPrincipalTraduit uzbek=new IdiomaPrincipalTraduit("Uzbek","Oʻzbek tili", true);//añadido 52
	this.paisosIdioma.put("uz",uzbek);
	IdiomaPrincipalTraduit kurdArab=new IdiomaPrincipalTraduit("Kurd","کوردی", true);//añadido 53
	this.paisosIdioma.put("kua",kurdArab);
	IdiomaPrincipalTraduit kurdLlati=new IdiomaPrincipalTraduit("Kurd","Kurdî", true);//añadido 53
	this.paisosIdioma.put("kul",kurdLlati);
	IdiomaPrincipalTraduit bielorús=new IdiomaPrincipalTraduit("Bielorús","Беларуская", true);//añadido 54
	this.paisosIdioma.put("be",bielorús);	
	IdiomaPrincipalTraduit eslovac=new IdiomaPrincipalTraduit("Eslovac","Slovenčina", true);//añadido 55
	this.paisosIdioma.put("sk",eslovac);	
	IdiomaPrincipalTraduit kazakh=new IdiomaPrincipalTraduit("Kazakh","Қазақ тілі", true);//añadido 56
	this.paisosIdioma.put("kk",kazakh);	
	IdiomaPrincipalTraduit hebreu=new IdiomaPrincipalTraduit("Hebreu","עברית (Ivrit)", true);//añadido 57
	this.paisosIdioma.put("he",hebreu);	
	IdiomaPrincipalTraduit singalès=new IdiomaPrincipalTraduit("Singalès","සිංහල", true);//añadido 58
	this.paisosIdioma.put("si",singalès);	
	IdiomaPrincipalTraduit afrikaans=new IdiomaPrincipalTraduit("Afrikaans","Afrikaans", true);//añadido 59
	this.paisosIdioma.put("af",afrikaans);	
	IdiomaPrincipalTraduit malgache=new IdiomaPrincipalTraduit("Malgaix","Malagasy", true);//añadido 60<--fins aqui
	this.paisosIdioma.put("mg",malgache);	
	IdiomaPrincipalTraduit malayo=new IdiomaPrincipalTraduit("Malai","Bahasa Melayu", true);//añadido 61
	this.paisosIdioma.put("ms",malayo);	
	IdiomaPrincipalTraduit lingala=new IdiomaPrincipalTraduit("Lingala","Lingála", true);//añadido 62
	this.paisosIdioma.put("ln",lingala);
	IdiomaPrincipalTraduit kituba=new IdiomaPrincipalTraduit("Kituba","Kikongo ya Leta", true);//añadido 63
	this.paisosIdioma.put("ktu",kituba);
	IdiomaPrincipalTraduit nepali=new IdiomaPrincipalTraduit("Nepalès","नेपाली", true);//añadido 64
	this.paisosIdioma.put("ne",nepali);
	IdiomaPrincipalTraduit serbio=new IdiomaPrincipalTraduit("Serbi","Српски", true);//añadido 65
	this.paisosIdioma.put("sr",serbio);
	IdiomaPrincipalTraduit croata=new IdiomaPrincipalTraduit("Croat","Hrvatski", true);//añadido 66
	this.paisosIdioma.put("hr",croata);
	IdiomaPrincipalTraduit bosniano=new IdiomaPrincipalTraduit("Bosnià","Bosanski", true);//añadido 67
	this.paisosIdioma.put("bs ",bosniano);
	IdiomaPrincipalTraduit montenegrí=new IdiomaPrincipalTraduit("Montenegrí","Crnogorski", true);//añadido 68
	this.paisosIdioma.put("cnr",montenegrí);
	IdiomaPrincipalTraduit tayiko=new IdiomaPrincipalTraduit("Tadjik","Тоҷикӣ", true);//añadido 69
	this.paisosIdioma.put("tg",tayiko);
	IdiomaPrincipalTraduit turcman=new IdiomaPrincipalTraduit("Turcman","Türkmen dili", true);//añadido 70
	this.paisosIdioma.put("tk",turcman);
	IdiomaPrincipalTraduit sesotho=new IdiomaPrincipalTraduit("Sesotho","Sesotho", true);//añadido 71
	this.paisosIdioma.put("st",sesotho);
	IdiomaPrincipalTraduit laosià=new IdiomaPrincipalTraduit("Laosià","ພາສາລາວ", true);//añadido 72
	this.paisosIdioma.put("lo",laosià);
	IdiomaPrincipalTraduit mongol=new IdiomaPrincipalTraduit("Mongol","Монгол хэл", true);//añadido 73
	this.paisosIdioma.put("mn",mongol);
	IdiomaPrincipalTraduit kirguís=new IdiomaPrincipalTraduit("Kirguís","Кыргыз тили", true);//añadido 74
	this.paisosIdioma.put("ky",kirguís);
	IdiomaPrincipalTraduit georgiano=new IdiomaPrincipalTraduit("Georgià","ქართული", true);//añadido 75
	this.paisosIdioma.put("ka",georgiano);
	IdiomaPrincipalTraduit lituano=new IdiomaPrincipalTraduit("Lituà","Lietuvių kalba", true);//añadido 76
	this.paisosIdioma.put("lt",lituano);
	IdiomaPrincipalTraduit macedonio=new IdiomaPrincipalTraduit("Macedoni","Македонски", true);//añadido 77
	this.paisosIdioma.put("mk",macedonio);
	IdiomaPrincipalTraduit tumbuka=new IdiomaPrincipalTraduit("Tumbuka","Chitumbuka", true);//añadido 78
	this.paisosIdioma.put("tum",tumbuka);
	IdiomaPrincipalTraduit siswati=new IdiomaPrincipalTraduit("Siswati","SiSwati", true);//añadido 79
	this.paisosIdioma.put("ss",siswati);
	IdiomaPrincipalTraduit letón=new IdiomaPrincipalTraduit("Letó","Latviešu valoda", true);//añadido 80
	this.paisosIdioma.put("lv",letón);
	IdiomaPrincipalTraduit náhuatl=new IdiomaPrincipalTraduit("Náhuatl","Nāhuatl", true);//añadido 81
	this.paisosIdioma.put("nah",náhuatl);
	IdiomaPrincipalTraduit limburgués=new IdiomaPrincipalTraduit("Limburguès","Lèmbörgs", true);//añadido 82
	this.paisosIdioma.put("li",limburgués);
	IdiomaPrincipalTraduit estonio=new IdiomaPrincipalTraduit("Estonià","Eesti keel", true);//añadido 83
	this.paisosIdioma.put("et",estonio);
	IdiomaPrincipalTraduit irlandès=new IdiomaPrincipalTraduit("Irlandès","Gaeilge", true);//añadido 84
	this.paisosIdioma.put("ga",irlandès);
	IdiomaPrincipalTraduit tongà=new IdiomaPrincipalTraduit("Tongà","Lea faka-Tonga", true);//añadido 85
	this.paisosIdioma.put("to",tongà);
	IdiomaPrincipalTraduit maltes=new IdiomaPrincipalTraduit("Maltès","Malti", true);//añadido 86
	this.paisosIdioma.put("mt",maltes);
	IdiomaPrincipalTraduit gascón =new IdiomaPrincipalTraduit("Gascó","Gascon", true);//añadido 87
	this.paisosIdioma.put("gsc",gascón); //inventat el codi 3 lletres
	IdiomaPrincipalTraduit romanche=new IdiomaPrincipalTraduit("Romanx","Rumantsch", true);//añadido 88
	this.paisosIdioma.put("rm",romanche);
	IdiomaPrincipalTraduit bulgaro=new IdiomaPrincipalTraduit("Búlgar","български език", true);//añadido 89
	this.paisosIdioma.put("bg",bulgaro);
	IdiomaPrincipalTraduit afar=new IdiomaPrincipalTraduit("Afar","Qafár af", true);//añadido 90
	this.paisosIdioma.put("aa",afar);
	//repàs, idiomes amb molts parlants olvidats
	IdiomaPrincipalTraduit oromo=new IdiomaPrincipalTraduit("Oromo","Oromiffa", true);//añadido 91
	this.paisosIdioma.put("om",oromo);
	IdiomaPrincipalTraduit igbo=new IdiomaPrincipalTraduit("Igbo","Ìgbò", true);//añadido 92
	this.paisosIdioma.put("ig",igbo);
	IdiomaPrincipalTraduit yoruba=new IdiomaPrincipalTraduit("Yoruba","Yorùbá", true);//añadido 93
	this.paisosIdioma.put("yo",yoruba);
	IdiomaPrincipalTraduit sindhiPakistan=new IdiomaPrincipalTraduit("Sindhi","سِنڌِي", true); // añadido escriptura perso-àrab 94
	this.paisosIdioma.put("sdp",sindhiPakistan);
	IdiomaPrincipalTraduit sindhiIndia=new IdiomaPrincipalTraduit("Sindhi","सिन्धी", true);//añadido escriptura devanagari 95
	this.paisosIdioma.put("sdi",sindhiIndia);
	IdiomaPrincipalTraduit malayalam=new IdiomaPrincipalTraduit("Malayalam","മലയാളം", true);//añadido  96
	this.paisosIdioma.put("ml",malayalam);
	IdiomaPrincipalTraduit odia=new IdiomaPrincipalTraduit("Odia","ଓଡ଼ିଆ", true);//añadido 97
	this.paisosIdioma.put("or",odia);
	IdiomaPrincipalTraduit maithili=new IdiomaPrincipalTraduit("Maithili","मैथिली", true);//añadido 98 
	this.paisosIdioma.put("mai",maithili);
	IdiomaPrincipalTraduit azerbaidjanès=new IdiomaPrincipalTraduit("Azerbaidjanès","Azərbaycanca", true);//añadido 99
	this.paisosIdioma.put("az",azerbaidjanès);
	IdiomaPrincipalTraduit fula=new IdiomaPrincipalTraduit("Fula","Fulfulde", true);//añadido 100
	this.paisosIdioma.put("ff",fula);
	IdiomaPrincipalTraduit assames=new IdiomaPrincipalTraduit("Assamès","অসমীয়া", true);//añadido 101
	this.paisosIdioma.put("as",assames);
	IdiomaPrincipalTraduit madurès=new IdiomaPrincipalTraduit("Madurès","Bhâsa Madhurâ", true);//añadido 102
	this.paisosIdioma.put("mdr",madurès);
	IdiomaPrincipalTraduit khmer=new IdiomaPrincipalTraduit("Khmer","ខ្មែរ", true);//añadido 103
	this.paisosIdioma.put("km",khmer);
	IdiomaPrincipalTraduit zhuang=new IdiomaPrincipalTraduit("Zhuang","Cuengh", true);//añadido 104 
	this.paisosIdioma.put("za",zhuang);
	IdiomaPrincipalTraduit islandes=new IdiomaPrincipalTraduit("Islandès","Íslenska", true);//añadido 105 
	this.paisosIdioma.put("is",islandes);
	IdiomaPrincipalTraduit luxemburgues=new IdiomaPrincipalTraduit("Luxemburguès","Lëtzebuergesch", true);//añadido  106
	this.paisosIdioma.put("lb",luxemburgues);



	
	
	
	
	//Bulgaro 
	

	/*
	 Aquí tens la llista d'idiomes amb el nombre de parlants, ordenada de més a menys, i amb els noms en català, espanyol i en l'idioma original quan s'han pogut determinar:

Idiomes per Nombre de Parlants (de més a menys)
Romanx:

        Català: Romanx

        Español: Romanche

        En el idioma: Rumantsch

        Nombre de parlants: ~60.000

        Codi ISO 639-1: rm




    Tetum:

        Català: Tetum

        Español: Tetum

        En el idioma: Tetun

        Nombre de parlants: ~800.000

        Codi ISO 639-1: (No 639-1, tet és 639-2)

    Comorès:

        Català: Comorès

        Español: Comorense

        En el idioma: Shikomor

        Nombre de parlants: ~700.000

        Codi ISO 639-1: (No 639-1, zdj per ngazidja és 639-3)

    Dzongkha:

        Català: Dzongkha

        Español: Dzongkha

        En el idioma: རྫོང་ཁ (Dzongkha)

        Nombre de parlants: ~640.000

        Codi ISO 639-1: dz

   
    Samoà:

        Català: Samoà

        Español: Samoano

        En el idioma: Gagana Sāmoa

        Nombre de parlants: ~500.000

        Codi ISO 639-1: sm

    Frisó Occidental:

        Català: Frisó Occidental

        Español: Frisón Occidental

        En el idioma: Frysk

        Nombre de parlants: ~480.000

        Codi ISO 639-1: fy

    Sango:

        Català: Sango

        Español: Sango

        En el idioma: Sängö

        Nombre de parlants: ~450.000

        Codi ISO 639-1: sg

    Papiament:

        Català: Papiament

        Español: Papiamento

        En el idioma: Papiamentu

        Nombre de parlants: ~340.000

        Codi ISO 639-1: (No 639-1, pap és 639-2)

    Dhivehi:

        Català: Dhivehi

        Español: Dhivehi

        En el idioma: ދިވެހި (Dhivehi)

        Nombre de parlants: ~300.000

        Codi ISO 639-1: dv



    I-Kiribati:

        Català: Kiribati

        Español: I-Kiribati

        En el idioma: Kiribati

        Nombre de parlants: ~100.000

        Codi ISO 639-1: (No 639-1, gil és 639-2)

    Norman:

        Català: Normand

        Español: Normando

        En el idioma: Normaund

        Nombre de parlants: ~100.000 (diversos dialectes)

        Codi ISO 639-1: (No 639-1)

    Feroès:

        Català: Feroès

        Español: Feroés

        En el idioma: Føroyskt

        Nombre de parlants: ~75.000-80.000

        Codi ISO 639-1: fo

    
    Grenlandès:

        Català: Grenlandès

        Español: Groenlandés

        En el idioma: Kalaallisut

        Nombre de parlants: ~57.000

        Codi ISO 639-1: kl

    Chamorro:

        Català: Chamorro

        Español: Chamorro

        En el idioma: Chamoru

        Nombre de parlants: ~47.000

        Codi ISO 639-1: ch

    Maori de les Illes Cook:

        Català: Maori de les Illes Cook

        Español: Maorí de las Islas Cook

        En el idioma: Te reo Māori Kūki 'Āirani

        Nombre de parlants: ~21.000

        Codi ISO 639-1: (No 639-1, rar és 639-2)

    Palauà:

        Català: Palauà

        Español: Palauano

        En el idioma: Tekoi ra Belau

        Nombre de parlants: ~15.000

        Codi ISO 639-1: (No 639-1, pau és 639-2)

    Tuvaluà:

        Català: Tuvaluà

        Español: Tuvaluano

        En el idioma: Te Gana Tuvalu

        Nombre de parlants: ~13.000

        Codi ISO 639-1: (No 639-1, tvl és 639-2)

    Nauruà:

        Català: Nauruà

        Español: Nauruano

        En el idioma: Dorerin Naoero

        Nombre de parlants: ~6.000

        Codi ISO 639-1: na

    Bislama:

        Català: Bislama

        Español: Bislama

        En el idioma: Bislama

        Nombre de parlants: ~6.000 (parlants nadius, amb ~200.000 L2)

        Codi ISO 639-1: bi

    Monegasc:

        Català: Monegasc

        Español: Monegasco

        En el idioma: Munegascu

        Nombre de parlants: ~5.000 (parlants locals, però principalment francès)

        Codi ISO 639-1: (No 639-1, dialecte del ligur)

    Carolinià:

        Català: Carolinià

        Español: Carolinio

        En el idioma: Refaluwasch

        Nombre de parlants: ~3.100

        Codi ISO 639-1: (No 639-1, cal és 639-2)

    Manx:

        Català: Manx

        Español: Manés

        En el idioma: Gaelg / Gailck

        Nombre de parlants: ~2.000

        Codi ISO 639-1: gv

    Niueà:

        Català: Niueà

        Español: Niueano

        En el idioma: Ko e vagahau Niuē

        Nombre de parlants: ~1.600

        Codi ISO 639-1: (No 639-1, niu és 639-2)

    Tokelauà:

        Català: Tokelauà

        Español: Tokelauano

        En el idioma: Gagana Tokelau

        Nombre de parlants: ~1.500

        Codi ISO 639-1: (No 639-1, tkl és 639-2)

    Norfuk:

        Català: Norfuk

        Español: Norfuk

        En el idioma: Norfuk / Pitcairn

        Nombre de parlants: ~500

        Codi ISO 639-1: (No 639-1, pih és 639-2)

    Llatí:

        Català: Llatí

        Español: Latín

        En el idioma: Lingua Latina

        Nombre de parlants: (No hi ha parlants nadius, s'utilitza en contextos específics)

        Codi ISO 639-1: la

    Hokkien taiwanès:

        Català: Hokkien taiwanès

        Español: Hokkien taiwanés

        En el idioma: 臺灣閩南語 (Tâi-oân Bân-lâm-gí)

        Nombre de parlants: (Desenes de milions, depenent de la definició exacta)

        Codi ISO 639-1: (No 639-1, dialecte del xinès zh)
/////////////////////////////////////////////////////////////////////////////////////////
    

	
	
	
	//hebreo 
	//irlandes
	//Bulgaro 
	//Bosnio Croata Serbio
	//kirundi
	//Malayo
	//Dzongkha
	//Bielorruso
	//Sango 
	//Lingala y Kituba 
	//Romanche
	//maori de las islas cook
	//Serbio
	//papiamento
	//checo
	//eslovaco
	//somali afar
	//Danes 
	//Bererber 
	//Estonio
	//Amárico
	//Feroes 
	//Danés
	//Georgiano
	//hungaro 
	//indonesio
	//Groenlandes 
	//Chamorro 
	//hebreo de israel
	//Islandes 
	//Normando
	//Suajili
	//Kirguis.
	//Jemer
	//I-Kiribati
	//Comoriano
	//kazajo 
	//Lao oficial
	//Cingales
	//Sesotho
	//Luxemburgues
	//Lituano
	//Letón
	//Polaco 
	//Malgache
	//Marshalles
	//Bereber
	//Rumano
	//Monegasco
	//Montenegrino 
	//Serbio y Bosnio
	//Macedoni
	//Chamorro
	//Carolinian
	//Dhivehi 
	//Tumbuka 
	//Chichewa 
	//Norfuk
	//Albanes
	//Birmà
	//Mongol
	//Maltes
	//Malai
	//Norfuk
	//Nepales
	//Frisi Occidental
	//Limburgues
	//Nauruà
	//Niueà
	//Maori
	//Filipí
	//polones
	//Gascó 
	//Palaues
	//Romanes
	//Serbi
	//Kinyarwanda 
	//Eslove
	//Eslovac
	//Hongares 
	//Manés
	//Kurdo 
	//Somali
	//Náhuatl 
	//Siswati
	//Tailandes
	//Tadjik 
	//Tokelauès 
	//Tetum
	//Turcman
	//Berlusca
	//Tonganes
	//Tuvaluà
	//Taiwanes hokken
	//Ucraines
	//Navajo
	//Uzbek
	//Llati
	//vietnamita
	//Bislama
	//Samoà
	//Afrikaans
	
/*idiomes restants ordenats per parlants.
Filipino: ~90-100 million (including native and L2 speakers)

Vietnamese: ~75-80 million

Indonesian / Malay (Malayo, Malai): ~77 million native, ~200-300 million total (as a lingua franca, including various dialects under 'Malay' umbrella)

Swahili: ~75-100 million (including L2 speakers, with ~15-20 million native speakers)

Thai (Tailandes): ~69 million

Burmese (Birmà): ~32 million (native speakers)

Amharic (Amárico): ~31 million (native speakers, with additional L2 speakers)

Polish (Polones): ~40 million

Romanian (Romanes, Rumano): ~24-28 million

Serbo-Croatian (Bosnio Croata Serbio, Serbi, Serbio y Bosnio, Montenegrino, Serbio): ~18 million (as a collective, though individual languages like Serbian have ~10 million)

Hungarian (Hungaro): ~13-15 million

Czech (Checo): ~10 million

Kinyarwanda: ~12 million

Chichewa: ~12 million

Somali (Somali Afar): ~10-15 million (including various dialects and L2 speakers)

Albanian (Albanes): ~8 million

Danish (Danés): ~6 million

Belarusian (Bielorruso, Berlusca): ~3.5-5 million native speakers

Slovak (Eslovac, Eslovac): ~5 million

Uzbek: ~30-35 million

Kazakh (Kazajo): ~12-14 million

Ukrainian (Ucraines): ~40 million

Hebrew (Hebreo, Hebreo de Israel): ~9 million

Georgian (Georgiano): ~4 million

Lao (Lao oficial): ~5-6 million

Sinhala (Cingales): ~16 million

Kurdish (Kurdo): ~20-40 million (as a macrolanguage with several distinct languages)

Afrikaans: ~7 million (native speakers)

Nahuatl: ~1.5 million

Estonian (Estonio): ~1.2 million

Lithuanian (Lituano): ~2.8 million

Latvian (Letón): ~1.7 million

Macedonian (Macedoni): ~2 million

Malagasy: ~25 million

Mongolian (Mongol): ~5.7 million

Nepali (Nepales): ~17 million

Kyrgyz (Kirguis): ~5 million

Tajik (Tadjik): ~8 million

Turkmen (Turcman): ~7-8 million

Tongan (Tonganes): ~1 million

Papiamento: ~340,000

Maltese (Maltes): ~500,000

Comorian (Comoriano): ~700,000

Sango: ~450,000

Dzongkha: ~640,000

Sesotho: ~7 million

Siswati: ~2 million

Lingala and Kituba (collective): ~20 million (Lingala ~10-15m, Kituba ~5m)

Gascón: ~250,000

West Frisian (Frisi Occidental): ~480,000

Limburgish (Limburgues): ~1.3 million

Icelandic (Islandes): ~350,000

Irish (Irlandes): ~1.2 million (total speakers, ~70,000 daily native speakers)

Greenlandic (Groenlandes): ~57,000

Faroese (Feroes): ~75,000-80,000

Romansh (Romanche): ~60,000

Manx (Manés): ~2,000

Carolinian (Carolinian): ~3,100

Cook Islands Māori (Maori de las islas cook): ~21,000

Norfuk: ~500

Nauruan (Nauruà): ~6,000

Niuean (Niueà): ~1,600

Palauan (Palaues): ~15,000

Tokelauan (Tokelauès): ~1,500

Tuvaluan (Tuvaluà): ~13,000

Chamorro (Chamorro): ~47,000

Bislama: ~6,000 (native speakers, with ~200,000 L2 speakers)

Samoan (Samoà): ~500,000

Latin (Llati): (No native speakers, but used in specific contexts by scholars/clergy)

Monegasque: ~5,000 (local speakers, but primarily French)

Norman (Normando): ~100,000 (various dialects)

Taiwanes Hokken: This likely refers to Taiwanese Hokkien (Min Nan), which has tens of millions of speakers in Taiwan and other parts of the world. It is a dialect of Min Nan Chinese.

Dhivehi: ~300,000

Tumbuka: ~2 million

I-Kiribati: ~100,000

Tetum: ~800,000
	 */
	
	


	
	
	
	
	
}
 



 

}
