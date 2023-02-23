package coo.tdd.exercicio.dois.model;

import coo.tdd.exercicio.dois.enums.ImpostoDeProduto;
import coo.tdd.exercicio.dois.interfaces.Imposto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		double imposto;
		if (this.isUsado) {
			imposto = impostoSobreVideoGameUsado();
			mensagemSobreVideoGameUsado(imposto);

			return imposto;
		}

		imposto = impostoSobreVideoGameNovo();
		mensagemSobreVideoGameNovo(imposto);

		return imposto;
	}

	private void mensagemSobreVideoGameNovo(double imposto) {
		System.out.println("Imposto " + this.getNome() + " " + this.modelo + " R$ " + imposto + ".");
	}

	private double impostoSobreVideoGameNovo() {
		return this.getPreco() * ImpostoDeProduto.IMPOSTO_45.getValor();
	}

	private void mensagemSobreVideoGameUsado(double imposto) {
		System.out.println("Imposto " + this.getNome() + " " + this.modelo + " usado, R$ " + imposto + ".");
	}

	private double impostoSobreVideoGameUsado() {
		return this.getPreco() * ImpostoDeProduto.IMPOSTO_25.getValor();
	}

}
