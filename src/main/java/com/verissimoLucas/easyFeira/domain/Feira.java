package com.verissimoLucas.easyFeira.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Feira implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@OneToMany(mappedBy = "feira")
	private List<Lista> listas = new ArrayList<>();
	
	private Date data;
	
	@ElementCollection
	@CollectionTable(name = "FORMA_PAGAMENTO")
	private List<String> formasPagamento;
	private Boolean open;
	
	public Feira() {
		
	}

	public Feira(Integer id, List<Lista> lista, Date data, List<String> formasPagamento, Boolean open) {
		super();
		this.id = id;
		this.setListas(lista);
		this.data = data;
		this.formasPagamento = formasPagamento;
		this.open = open;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		Feira other = (Feira) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public List<String> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<String> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	public List<Lista> getListas() {
		return listas;
	}

	public void setListas(List<Lista> listas) {
		this.listas = listas;
	}
	
}
