package com.verissimoLucas.easyFeira.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verissimoLucas.easyFeira.domain.Lista;
import com.verissimoLucas.easyFeira.repositories.ListaRepository;
import com.verissimoLucas.easyFeira.services.exceptions.ObjectNotFoundException;

@Service
public class ListaService {

	@Autowired
	private ListaRepository repo;
	
	public Lista find(Integer id) {
		Optional<Lista> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Lista.class.getName()));
	}
}
