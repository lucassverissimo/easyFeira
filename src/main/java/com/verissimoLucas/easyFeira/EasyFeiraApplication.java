package com.verissimoLucas.easyFeira;

import java.io.Console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verissimoLucas.easyFeira.domain.*;

@SpringBootApplication
public class EasyFeiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyFeiraApplication.class, args);
		
		//Feira feira = new Feira();
		//Lista lista = new Lista();
		//Produto produto = new Produto();
		//ProdutoLista produtoLista = new ProdutoLista();
		
		Usuario usuario = new Usuario();
		
	}

}
