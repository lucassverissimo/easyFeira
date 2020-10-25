package com.verissimoLucas.easyFeira.domain.enums;

public enum FormaPagamento {
	
	DINHEIRO(1, "Dinheiro"), 
	CREDITO(2, "Cartão de Crédito"), 
	DEBITO(3, "Cartão de Débito"),
	ALIMENTACAO(4, "Cartão Alimentação"),
	CHEQUE(5,"Cheque");

	private int cod;
	private String descricao;

	private FormaPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return this.cod;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public static FormaPagamento toEnum(Integer cod) {
		if (cod == null)
			return null;

		for (FormaPagamento tc : FormaPagamento.values()) {
			if (cod.equals(tc.getCod())) {
				return tc;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
