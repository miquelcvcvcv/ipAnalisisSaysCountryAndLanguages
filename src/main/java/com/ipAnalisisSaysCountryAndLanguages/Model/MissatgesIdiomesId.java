package com.ipAnalisisSaysCountryAndLanguages.Model;

import java.io.Serializable;

import java.util.Objects;
/*porque la tabla missatge diomdea tiene doble llave primaria*/
public class MissatgesIdiomesId implements Serializable {
    private static final long serialVersionUID = 1L;
    
	private String idioma;
    private Short numeroMissatge;

    public MissatgesIdiomesId() {}

    public MissatgesIdiomesId(String idioma, Short numeroMissatge) {
        this.idioma = idioma;
        this.numeroMissatge = numeroMissatge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MissatgesIdiomesId)) return false;
        MissatgesIdiomesId that = (MissatgesIdiomesId) o;
        return Objects.equals(idioma, that.idioma) &&
               Objects.equals(numeroMissatge, that.numeroMissatge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idioma, numeroMissatge);
    }
}