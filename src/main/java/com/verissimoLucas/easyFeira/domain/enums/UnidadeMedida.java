package com.verissimoLucas.easyFeira.domain.enums;

public enum UnidadeMedida {
	
	UN(1, "Unidade"), 
	ML(2, "Mililitros"), 
	L(3, "Litro"), 
	G(4,"Grama"), 
	KG(5,"Kilo");

	private int cod;
	private String descricao;

	private UnidadeMedida(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return this.cod;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public static UnidadeMedida toEnum(Integer cod) {
		if (cod == null)
			return null;

		for (UnidadeMedida tc : UnidadeMedida.values()) {
			if (cod.equals(tc.getCod())) {
				return tc;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
