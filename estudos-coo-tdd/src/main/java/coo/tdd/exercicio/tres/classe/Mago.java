package coo.tdd.exercicio.tres.classe;

import java.util.ArrayList;
import java.util.List;

import coo.tdd.exercicio.tres.personagem.Personagem;

public class Mago extends Personagem {
	
	private List<String> magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magia = new ArrayList<String>();
	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	@Override
	public void lvlUp() {
		this.aumentarMana(50);
		this.aumentarInteligencia(6);
		this.aumentarForca(1);
		this.aumentarVida(4);
	}
		
	public int attack() {
		return this.getInteligencia()*this.getLevel() + this.numeroRandomico();
	}
	
	
	public String listarTecnicas() {
		String s = "MAGIAS\n";
		for (String magia : this.magia) {
			s += magia + "\n";
		}		
		return s;
	}
	
	public void aprenderMagia(String magia) {
		this.magia.add(magia);
	}
	
	@Override
	public String toString() {
		
		return "PERSONAGEM\nClasse: " + this.getClass().getSimpleName() + super.toString() + this.listarTecnicas();
	}

	
	

}
