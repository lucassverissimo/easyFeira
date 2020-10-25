package com.verissimoLucas.easyFeira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verissimoLucas.easyFeira.domain.Lista;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer> {

}