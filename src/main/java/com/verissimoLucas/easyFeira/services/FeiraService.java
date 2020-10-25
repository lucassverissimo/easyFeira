package com.verissimoLucas.easyFeira.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verissimoLucas.easyFeira.domain.Feira;
import com.verissimoLucas.easyFeira.repositories.FeiraRepository;
import com.verissimoLucas.easyFeira.services.exceptions.ObjectNotFoundException;

@Service
public class FeiraService {

	@Autowired
	private FeiraRepository repo;
	
	public Feira find(Integer id) {
		Optional<Feira> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Feira.class.getName()));
	}
}
