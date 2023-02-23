package coo.tdd.exercicio.um.classes.veiculos;

import coo.tdd.exercicio.um.interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo{

	private String marca;
	private String modelo;
	private String cor;
	private float kmsRodado;
	protected int velocidade;
	private double preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKmsRodado() {
		return kmsRodado;
	}

	public void setKmsRodado(float kmsRodado) {
		this.kmsRodado = kmsRodado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void pintar(String cor) {
		
		this.cor = cor;
	}
}
