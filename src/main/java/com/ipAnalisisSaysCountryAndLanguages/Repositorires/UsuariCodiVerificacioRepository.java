package com.ipAnalisisSaysCountryAndLanguages.Repositorires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipAnalisisSaysCountryAndLanguages.Hibernate.UsuariCodiVerificacio;

//@Repository
public interface UsuariCodiVerificacioRepository extends JpaRepository<UsuariCodiVerificacio, Long>
{
	List<UsuariCodiVerificacio> findByEmail(String email);
}
