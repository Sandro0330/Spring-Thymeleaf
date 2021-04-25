package com.thymeleaf.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.tutorial.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long>  {

}
