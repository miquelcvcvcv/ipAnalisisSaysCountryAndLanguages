package com.ipAnalisisSaysCountryAndLanguages.Repositorires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.MissatgeIdioma;
import com.ipAnalisisSaysCountryAndLanguages.Model.MissatgesIdiomesId;


public interface MissatgesIdiomesRepository extends JpaRepository<MissatgeIdioma, MissatgesIdiomesId>
{
	//List<MissatgeIdioma> findByIdiomaAndNumeroMissatge(String idioma, Short numeroMissatge);
	
	
	@Query("SELECT m.missatge FROM MissatgeIdioma m WHERE m.idioma = :idioma AND m.numeroMissatge = :numeroMissatge")
	List<String> findMissatgeByIdiomaAndNumeroMissatge(String idioma, Short numeroMissatge);
	
	/*@Query("SELECT m.missatge FROM MissatgeIdioma m WHERE m.idioma = :idioma AND m.numeroMissatge >= :numeroMissatgeRangBaix AND m.numeroMissatge <= :numeroMissatgeRangAlt")
	List<String> findMissatgeByIdiomaAndRang(String idioma, Short numeroMissatgeRangBaix, Short numeroMissatgeRangAlt);*/
	
	/* Canviar els numeros si s'afegeixen missatges a la BD */
	/*@Query("SELECT m.idioma, m.numeroMissatge , m.missatge FROM MissatgeIdioma m WHERE m.idioma = :idioma AND m.numeroMissatge >= 200 AND m.numeroMissatge <= 803")*/
	@Query("SELECT new com.mailAttacherPackage.Hibernate.MissatgeIdioma(m.idioma, m.numeroMissatge , m.missatge) FROM MissatgeIdioma m WHERE m.idioma = :idioma AND m.numeroMissatge >= 200 AND m.numeroMissatge <= 803")
	List<MissatgeIdioma> findMissatgesIdioma(String idioma);
	
	/*
	@Query("SELECT m.idioma, m.numeroMissatge , m.missatge FROM MissatgeIdioma m WHERE m.idioma = :idioma")
	List<MissatgeIdioma> findMissatgesIdiomaSimple(String idioma);
	*/
	
}

