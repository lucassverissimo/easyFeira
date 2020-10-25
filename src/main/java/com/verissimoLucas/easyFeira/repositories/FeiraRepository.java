package com.verissimoLucas.easyFeira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verissimoLucas.easyFeira.domain.Feira;

@Repository
public interface FeiraRepository extends JpaRepository<Feira, Integer> {

}