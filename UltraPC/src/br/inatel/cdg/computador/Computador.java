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
		sistemaOperacional = new SistemaOperacional(nomeSistema);		//Sistema Operacional = agregação
						
	}
	
	//Add Memoria USB
	public void addMemoriaUSB(MemoriaUSB mem) {
		this.memoriaUSB = mem;
	}
	
	
	//Add Componentes do PC
	public void addComponente(Componente comp) {
		for(int i =  0; i < componentes.length ; i++) {
			if(this.componentes [i] == null) {			//se a posição i do vetor for vazia
				this.componentes [i] = comp;			//recebe comp passada pela função na posição i
				break;									//sai da estrutura
			}	
		}	
	}
	
	
	//mostra configurações do PC
	public void mostraPcConfig ()
	{
		
		//Marca
		System.out.println("Marca: " + this.marca);
		
		//Preco
		System.out.println("Preço: " + this.preco);
		
		
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
		else System.out.println("Memoria USB: " + "Não incluído");
		
		//Sistema Operacional
		System.out.println("Sistema Operacional: " + sistemaOperacional.getNome());
		
		
		System.out.println(); 		//pula linha antes de mostrar o próximo PC
	
	}
	
	
	//Getters
	public double getPreco() {
		return preco;
	}
	public String getMarca() {
		return marca;
	}
	
	
			
	}
	
	
	

