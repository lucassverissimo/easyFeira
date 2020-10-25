package com.verissimoLucas.easyFeira;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verissimoLucas.easyFeira.domain.Lista;
import com.verissimoLucas.easyFeira.domain.Produto;
import com.verissimoLucas.easyFeira.domain.ProdutoLista;
import com.verissimoLucas.easyFeira.domain.Usuario;
import com.verissimoLucas.easyFeira.domain.enums.UnidadeMedida;
import com.verissimoLucas.easyFeira.repositories.ListaRepository;
import com.verissimoLucas.easyFeira.repositories.ProdutoListaRepository;
import com.verissimoLucas.easyFeira.repositories.ProdutoRepository;
import com.verissimoLucas.easyFeira.repositories.UsuarioRepository;

@SpringBootApplication
public class EasyFeiraApplication implements CommandLineRunner  {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ListaRepository listaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoListaRepository produtoListaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EasyFeiraApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		//Feira feira = new Feira();
		//Produto produto = new Produto();
		//ProdutoLista produtoLista = new ProdutoLista();
		
		Usuario u1 = new Usuario(null, "Lucas Verissimo", "Lucas", "991178395", "lucas", "123");
		Lista l1 = new Lista(null, "Lista feira grande", sdf.parse("30/09/2017 10:32"), u1);
		Lista l2 = new Lista(null, "Lista feira pequena", sdf.parse("30/09/2017 10:32"), u1);
		u1.getListas().addAll(Arrays.asList(l1,l2));
		
		Produto p1 = new Produto(null, "banana", null, null, null);				
		
		ProdutoLista pl1 = new ProdutoLista(p1,l1, 1.0, UnidadeMedida.UN);
		
		l1.getItens().addAll(Arrays.asList(pl1));
		
		
		usuarioRepository.saveAll(Arrays.asList(u1));
		listaRepository.saveAll(Arrays.asList(l1,l2));
		produtoRepository.saveAll(Arrays.asList(p1));
		produtoListaRepository.saveAll(Arrays.asList(pl1));
	}

}
