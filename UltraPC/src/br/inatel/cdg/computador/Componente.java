package br.inatel.cdg.computador;

public class Componente {
	
	private String tipo;
	private String nome;
	
	//CONSTRUTOR
	public Componente(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
			
	}

	
	//Getters
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
		
}
