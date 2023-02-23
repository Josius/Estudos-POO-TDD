package coo.tdd.exercicio.um.classes.veiculos;

import coo.tdd.exercicio.um.enums.Estado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class VeiculoMovidoACombustao extends VeiculoBase {

	private String placa;
	private boolean isLigado;
	protected int litrosCombustivel;

	public void ligar() {
		if (this.isLigado) {

			System.out.println("Já está ligado");
			return;
		}
		this.isLigado = true;
		System.out.println("Ligando...");
	}

	public void desligar() {
		if (this.isLigado && carroEstaParado()) {
			this.isLigado = false;
			System.out.println("Desligando carro");
		} else {
			System.out.println("Carro em movimento, nao pode desligar.");
		}
	}

	public void abastecer(int combustivel) {
		if (tanqueDeCombustivelAindaNaoEstiverCheio(combustivel)) {
			
			preenchaOTanqueComAQuantidadeInformada(combustivel);
		} else {
			preenchaOQueFaltaNoTanqueParaFicarCheio();
		}
	}

	private void preenchaOQueFaltaNoTanqueParaFicarCheio() {
		this.litrosCombustivel += (Estado.MAXIMO_DE_COMBUSTIVEL.getEstado() - this.litrosCombustivel);
	}

	private void preenchaOTanqueComAQuantidadeInformada(int combustivel) {
		this.litrosCombustivel += combustivel;
	}

	private boolean tanqueDeCombustivelAindaNaoEstiverCheio(int combustivel) {
		return (this.litrosCombustivel + combustivel) <= Estado.MAXIMO_DE_COMBUSTIVEL.getEstado();
	}

	private boolean carroEstaParado() {
		return this.getVelocidade() == Estado.PARADO.getEstado();
	}

}
