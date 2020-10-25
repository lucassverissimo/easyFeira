package com.verissimoLucas.easyFeira.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String apelido;
	private String telfoneZap;	
	private String login;
	private String senha;	
	
	@OneToMany(mappedBy = "usuario")
	private List<Lista> listas = new ArrayList<>();
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String nome, String apelido, String telfoneZap, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.telfoneZap = telfoneZap;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTelfoneZap() {
		return telfoneZap;
	}

	public void setTelfoneZap(String telfoneZap) {
		this.telfoneZap = telfoneZap;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Lista> getListas() {
		return listas;
	}
	
	public void setListas(List<Lista> listas) {
		this.listas = listas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
