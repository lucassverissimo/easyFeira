package com.verissimoLucas.easyFeira.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.verissimoLucas.easyFeira.domain.Feira;
import com.verissimoLucas.easyFeira.services.FeiraService;

@RestController
@RequestMapping(value="/feiras")
public class FeiraResource {
	
	@Autowired
	private FeiraService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Feira> find(@PathVariable Integer id) {
		Feira obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
