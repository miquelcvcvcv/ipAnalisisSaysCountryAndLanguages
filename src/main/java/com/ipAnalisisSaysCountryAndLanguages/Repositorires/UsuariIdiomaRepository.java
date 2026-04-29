package com.ipAnalisisSaysCountryAndLanguages.Repositorires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.UsuariIdioma;

public interface UsuariIdiomaRepository extends JpaRepository<UsuariIdioma, String>
{
	List<UsuariIdioma> findByUsuariEmail(String usuariEmail);
}