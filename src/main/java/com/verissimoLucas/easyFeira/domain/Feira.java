package com.verissimoLucas.easyFeira.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.verissimoLucas.easyFeira.domain.enums.FormaPagamento;

public class Feira implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Lista lista;
	private Date data;
	private List<FormaPagamento> formasPagamento;
	
	public Feira() {
		
	}

	public Feira(Integer id, Lista lista, Date data, List<FormaPagamento> formasPagamento) {
		super();
		this.id = id;
		this.lista = lista;
		this.data = data;
		this.formasPagamento = formasPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((formasPagamento == null) ? 0 : formasPagamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
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
		Feira other = (Feira) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (formasPagamento == null) {
			if (other.formasPagamento != null)
				return false;
		} else if (!formasPagamento.equals(other.formasPagamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}
	
	
}
