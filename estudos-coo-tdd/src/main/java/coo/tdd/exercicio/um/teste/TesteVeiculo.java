package coo.tdd.exercicio.um.teste;

import coo.tdd.exercicio.um.classes.categorias.Carro;

public class TesteVeiculo {

	public static void main(String[] args) {
		Carro carro = new Carro();

//		Testando se o carro tem combustivel para acelerar
		System.out.println("Testando se o carro tem combustível para acelerar:");
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.acelerar();
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.abastecer(20);
		System.out.println("Qtde Combustível: " + carro.getLitrosCombustivel());
		carro.acelerar();
		System.out.println("Velocidade: " + carro.getVelocidade());

//		Testando capacidade do limite maximo de combustivel
		System.out.println("\nTestando capacidade do limite máximo de combustivel:");
		System.out.println("Qtde Combustivel: " + carro.getLitrosCombustivel());
		carro.abastecer(30);
		System.out.println("Qtde Combustivel: " + carro.getLitrosCombustivel());
		carro.abastecer(30);
		System.out.println("Qtde Combustivel: " + carro.getLitrosCombustivel());
		carro.abastecer(63);
		System.out.println("Qtde Combustivel: " + carro.getLitrosCombustivel());

//		Testando frenagem do veiculo
		System.out.println("\nTestando frenagem do veiculo:");
		carro.abastecer(63);
		System.out.println("Qtde Combustivel: " + carro.getLitrosCombustivel());
		System.out.println("Velocidade: " + carro.getVelocidade());
		for (int i = 0; i < 8; i++) {
			carro.acelerar();
		}
		System.out.println("Velocidade: " + carro.getVelocidade());
		for (int i = 0; i < 7; i++) {
			carro.frear();
		}
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.frear();
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.frear();
		System.out.println("Velocidade: " + carro.getVelocidade());

//		Testando a cor do veiculo
		System.out.println("\nTestando a cor do veiculo:");
		System.out.println("Cor:" + carro.getCor());
		carro.pintar("azul");
		System.out.println("Cor:" + carro.getCor());
		carro.pintar("vermelho");
		System.out.println("Cor:" + carro.getCor());

//		Testando ligacao do carro
		System.out.println("\nTestando ligacao do carro:");
		carro.abastecer(63);
		System.out.println("Carro esta ligado? " + carro.isLigado());
		carro.ligar();
		System.out.println("Carro esta ligado? " + carro.isLigado());
		carro.desligar();

		System.out.println("Carro esta ligado? " + carro.isLigado());
		carro.ligar();
		System.out.println("Carro esta ligado? " + carro.isLigado());
		carro.acelerar();
		carro.desligar();
		System.out.println("Carro esta ligado? " + carro.isLigado());

		carro.frear();
		carro.desligar();
		System.out.println("Carro esta ligado? " + carro.isLigado());

	}

}
