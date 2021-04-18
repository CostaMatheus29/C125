package br.inatel.cdg;
//Importando as classes dos outros pacotes
import br.inatel.cdg.computador.Computador;
import br.inatel.cdg.computador.Componente;
import br.inatel.cdg.computador.MemoriaUSB;
import br.inatel.cdg.cliente.Cliente;


public class Main {

	public static void main(String[] args) {

		//Criando cliente
		Cliente cliente1 = new Cliente ("Matheus", 117096, 2);
		
		//Criando computador 1 e computador 2
		Computador pc1 = new Computador("Dell", 5000, 4, "Windows 10");
		Computador pc2 = new Computador("Acer", 3000, 4, "Linux");
		
		//Adicionando componente para PC1
		pc1.addComponente(new Componente("GPU", "GeForce"));
		pc1.addComponente(new Componente("HD", "2TB"));
		pc1.addComponente(new Componente("RAM", "8GB"));
		pc1.addComponente(new Componente("Tela", "HD 15,6"));
		pc1.mostraPcConfig();
		
		cliente1.addComputador(pc1);
		
			
		//Adicionando componente para PC2
		pc2.addComponente(new Componente("GPU", "AMD"));
		pc2.addComponente(new Componente("SSD", "240GB"));
		pc2.addComponente(new Componente("RAM", "4GB"));
		pc2.addComponente(new Componente("Tela", "Full HD"));
		//Adicionando memoria USB para PC2
		pc2.addMemoriaUSB(new MemoriaUSB("Kingstom", 128));
		pc2.mostraPcConfig();
	
		cliente1.addComputador(pc2);
		
		//Imprimindo o preço total de compra
		System.out.println("Preço da compra: R$ " + cliente1.calculaCompra());
		

		
	}

}
