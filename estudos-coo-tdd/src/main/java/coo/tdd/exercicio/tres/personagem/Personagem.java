package coo.tdd.exercicio.tres.personagem;

import java.util.Random;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Personagem {

	private static final int TREZENTOS = 301;

	private static int qtdPersonagens;
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;
	private Random rnd;

	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		this.rnd = new Random();
		Personagem.qtdPersonagens++;
	}

	public void aumentarForca(int pontuacao) {
		this.forca += pontuacao;
	}

	public void aumentarInteligencia(int pontuacao) {
		this.inteligencia += pontuacao;
	}

	public void aumentarVida(int pontuacao) {
		this.vida += pontuacao;
	}

	public void aumentarMana(int pontuacao) {
		this.mana += pontuacao;
	}

	public int numeroRandomico() {
		return this.rnd.nextInt(TREZENTOS);
	}

	public static int getQtdPersonagens() {
		return qtdPersonagens;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nForca: " + forca + "\nInteligencia: " + inteligencia + "\nVida: " + vida
				+ "\nMana: " + mana + "\nLevel: " + level + "\nXP: " + xp + "\n";
	}

	public void lvlUp() {
		this.aumentarMana(1);
		this.aumentarInteligencia(1);
		this.aumentarForca(1);
		this.aumentarVida(1);
	}

}
