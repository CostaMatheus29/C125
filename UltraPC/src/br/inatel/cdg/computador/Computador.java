package br.inatel.cdg.computador;


public class Computador {
	
	private String marca;
	private double preco;
	Componente componentes[];
	MemoriaUSB  memoriaUSB;
	
	SistemaOperacional sistemaOperacional;

	//CONSTRUTOR
	public Computador(String marca, double preco, int qtdComponentes, String nomeSistema) {
		this.marca = marca;
		this.preco = preco;
		this.componentes = new Componente [qtdComponentes];
		sistemaOperacional = new SistemaOperacional(nomeSistema);		//Sistema Operacional = agrega��o
						
	}
	
	//Add Memoria USB
	public void addMemoriaUSB(MemoriaUSB mem) {
		this.memoriaUSB = mem;
	}
	
	
	//Add Componentes do PC
	public void addComponente(Componente comp) {
		for(int i =  0; i < componentes.length ; i++) {
			if(this.componentes [i] == null) {			//se a posi��o i do vetor for vazia
				this.componentes [i] = comp;			//recebe comp passada pela fun��o na posi��o i
				break;									//sai da estrutura
			}	
		}	
	}
	
	
	//mostra configura��es do PC
	public void mostraPcConfig ()
	{
		
		//Marca
		System.out.println("Marca: " + this.marca);
		
		//Preco
		System.out.println("Pre�o: " + this.preco);
		
		
		//Componentes
		System.out.println("Componentes");
		for (Componente componentes : componentes) {
			if (componentes == null)
				break;
		System.out.println("Comp: " + componentes.getNome() + " " + componentes.getTipo());			
		}
		
		//Memoria USB
		if(memoriaUSB != null) 
			System.out.println("Memoria USB: " + this.memoriaUSB.getMarca() + " " + this.memoriaUSB.getCapacidade());	
		else System.out.println("Memoria USB: " + "N�o inclu�do");
		
		//Sistema Operacional
		System.out.println("Sistema Operacional: " + sistemaOperacional.getNome());
		
		
		System.out.println(); 		//pula linha antes de mostrar o pr�ximo PC
	
	}
	
	
	//Getters
	public double getPreco() {
		return preco;
	}
	public String getMarca() {
		return marca;
	}
	
	
			
	}
	
	
	

