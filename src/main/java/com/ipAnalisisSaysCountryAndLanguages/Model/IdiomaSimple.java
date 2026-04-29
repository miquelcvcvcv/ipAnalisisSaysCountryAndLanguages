package com.ipAnalisisSaysCountryAndLanguages.Model;

public class IdiomaSimple implements Comparable<IdiomaSimple>
{
	String abreviaturaIdioma;	
	String idiomaAmbIdioma;

	public IdiomaSimple()
	{
		this.abreviaturaIdioma=new String();
		this.idiomaAmbIdioma=new String();
	}

	public IdiomaSimple(String abreviaturaIdioma,String idiomaAmbIdioma)
	{
		this.abreviaturaIdioma=abreviaturaIdioma;
		this.idiomaAmbIdioma=idiomaAmbIdioma;
	}
	
	public String getAbreviaturaIdioma()
	{
		return abreviaturaIdioma;
	}

	public void setAbreviaturaIdioma(String abreviaturaIdioma)
	{
		this.abreviaturaIdioma = abreviaturaIdioma;
	}

	public String getIdiomaAmbIdioma()
	{
		return idiomaAmbIdioma;
	}

	public void setIdiomaAmbIdioma(String idiomaAmbIdioma)
	{
		this.idiomaAmbIdioma = idiomaAmbIdioma;
	}
	
	@Override
    public int compareTo(IdiomaSimple altreIdiomaSimple) {
        return this.abreviaturaIdioma.compareTo(altreIdiomaSimple.abreviaturaIdioma); // Ordena per nom
    }
	
	@Override
	public int hashCode() {
	    return abreviaturaIdioma.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof IdiomaSimple)) return false;
	    IdiomaSimple that = (IdiomaSimple) o;
	    return abreviaturaIdioma.equals(that.abreviaturaIdioma);
	}
}
