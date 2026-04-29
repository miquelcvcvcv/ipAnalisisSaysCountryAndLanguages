package com.ipAnalisisSaysCountryAndLanguages.Repositorires;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.Usuari;

//@Repository
public interface UsuariRepository extends JpaRepository<Usuari, Long>
{

	List<Usuari> findByEmail(String email);

	List<Usuari> findByContrassenya(String contrassenya);

}
