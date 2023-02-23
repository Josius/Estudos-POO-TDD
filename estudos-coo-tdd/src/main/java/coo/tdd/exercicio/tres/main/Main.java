package coo.tdd.exercicio.tres.main;

import coo.tdd.exercicio.tres.classe.Guerreiro;
import coo.tdd.exercicio.tres.classe.Mago;
import coo.tdd.exercicio.tres.personagem.Personagem;

public class Main {

	public static void main(String[] args) {
		
		String[] magias = {"Bola de fogo", "Raio de gelo", "Pasmar", "Patas de aranha", "Misseis magicos", "Voar"};
		String[] habilidades = {"Ataque simples", "Ataque Duplo", "Ataque giratorio", "Investida", "Flanquear", "Lutar as cegas"};
		
		Mago magoUm = new Mago("Elminster", 30, 200, (float) 1356.79, 24, 12, 27);
		Mago magoDois = new Mago("Radagast, o castanho", 20, 25, (float) 800.10, 15, 10, 9);
		Guerreiro gue = new Guerreiro("Argaus", 50, 5, (float) 504.32, 9, 18, 7);
		
		for (int i = 0; i < habilidades.length; i++) {
			gue.aprenderHabilidade(habilidades[i]);
		}
		
		for (int i = 0; i < magias.length; i++) {
			magoUm.aprenderMagia(magias[i]);
			if(i > 2 ) {
				magoDois.aprenderMagia(magias[i]);
			}
		}
	
		System.out.println("Testando Level Up");
		System.out.println(magoUm);
		magoUm.lvlUp();
		System.out.println(magoUm);
		System.out.println(gue);
		gue.lvlUp();
		System.out.println(gue);
		
		System.out.println("\nTestando ataques");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Mago ataca com pontuacao de: " + magoDois.attack());
			System.out.println("Guerreiro ataca com pontuacao de: " + gue.attack());
		}
	
		System.out.println("\nTestando quantidade de Personagens criados");
		System.out.println("quantidade de Personagens criados: " + Personagem.getQtdPersonagens());
	}

}
