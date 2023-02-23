package coo.tdd.exercicio.tres.personagem;

import java.util.Random;

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

	public Personagem() {
		super();
	}

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
		this.qtdPersonagens++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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
