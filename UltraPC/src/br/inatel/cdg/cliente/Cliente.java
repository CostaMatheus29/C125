package br.inatel.cdg.cliente;
import br.inatel.cdg.computador.Computador;

public class Cliente {
	
	
	private String nome;
	private long cpf;
	Computador computadores [];
	
	//CONSTRUTOR
	public Cliente(String nome, long cpf, int qtdComputador) {
		this.nome = nome;
		this.cpf = cpf;
		this.computadores = new Computador [qtdComputador];
	}
	
	
	public double calculaCompra () {
		double valor = 0;
		for (Computador computador : computadores) {
			valor = valor + computador.getPreco();	
		}
		return valor;
	}
	
	
	public void addComputador(Computador computador) {
		for(int i =  0; i < this.computadores.length ; i++) {
			if(this.computadores [i] == null) {			
				this.computadores [i] = computador;		
				break;									
			}	
		}	
	}
		
}
