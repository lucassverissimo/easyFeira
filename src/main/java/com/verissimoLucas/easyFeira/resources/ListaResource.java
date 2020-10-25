package com.verissimoLucas.easyFeira.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verissimoLucas.easyFeira.domain.Lista;
import com.verissimoLucas.easyFeira.services.ListaService;

@RestController
@RequestMapping(value="/listas")
public class ListaResource {
	
	@Autowired
	private ListaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Lista> find(@PathVariable Integer id) {
		Lista obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
