package br.com.daniel;

public enum IMC {
	
	ABAIXO("Ele está abaixo do peso!"),
	IDEAL("Ele está no peso ideal!"),
	ACIMA("Ele está acima do peso!"),
	OBESO("Ele está obeso!");

	private String descricao;

	IMC(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
