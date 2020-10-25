package com.verissimoLucas.easyFeira.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.verissimoLucas.easyFeira.domain.enums.UnidadeMedida;

@Entity
public class ProdutoLista implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ProdutoListaPK id = new ProdutoListaPK();
	private Double quantidade;
	private UnidadeMedida unidadeMedida;
	
	public ProdutoLista() {
		
	}

	public ProdutoLista(Produto produto, Lista lista, Double quantidade, UnidadeMedida unidadeMedida) {
		super();
		this.id.setProduto(produto);
		this.id.setLista(lista);
		this.quantidade = quantidade;
		this.unidadeMedida = unidadeMedida;
	}

	@JsonIgnore
	public Lista getLista() {
		return this.id.getLista();
	}
	
	public void setLista(Lista lista) {
		id.setLista(lista);
	}

	public Produto getProduto() {
		return this.id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
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
		ProdutoLista other = (ProdutoLista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (unidadeMedida != other.unidadeMedida)
			return false;
		return true;
	}
}
