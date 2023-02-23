package coo.tdd.exercicio.tres.classe;

import java.util.ArrayList;
import java.util.List;

import coo.tdd.exercicio.tres.personagem.Personagem;

public class Guerreiro extends Personagem {
	
	private List<String> habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidade = new ArrayList<String>();
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUp() {
		this.aumentarMana(2);
		this.aumentarInteligencia(1);
		this.aumentarForca(6);
		this.aumentarVida(12);
	}	
	
	public int attack() {
		
		return this.getForca()*this.getLevel() + this.numeroRandomico();
	}
	
	
	public String listarTecnicas() {
		String s = "HABILIDADES\n";
		for (String habilidade : this.habilidade) {
			s += habilidade + "\n";
		}		
		return s;
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
	}
	
	
	@Override
	public String toString() {
		return "PERSONAGEM\nClasse: " + this.getClass().getSimpleName() + super.toString() + this.listarTecnicas();
	}

	
}
