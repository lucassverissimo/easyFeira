package com.verissimoLucas.easyFeira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verissimoLucas.easyFeira.domain.ProdutoLista;

@Repository
public interface ProdutoListaRepository extends JpaRepository<ProdutoLista, Integer> {

}