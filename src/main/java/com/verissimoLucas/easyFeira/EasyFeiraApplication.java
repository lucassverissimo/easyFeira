package com.verissimoLucas.easyFeira;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verissimoLucas.easyFeira.domain.Lista;
import com.verissimoLucas.easyFeira.domain.Usuario;
import com.verissimoLucas.easyFeira.repositories.UsuarioRepository;

@SpringBootApplication
public class EasyFeiraApplication implements CommandLineRunner  {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

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
		Lista l1 = new Lista(1, "Lista feira grande", sdf.parse("30/09/2017 10:32"), u1);
		u1.getListas().add(l1);
		
		usuarioRepository.saveAll(Arrays.asList(u1));
	}

}
