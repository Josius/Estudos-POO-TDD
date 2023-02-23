package coo.tdd.exercicio.um.classes.veiculos;

import coo.tdd.exercicio.um.interfaces.Veiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class VeiculoBase implements Veiculo{

	private String marca;
	private String modelo;
	private String cor;
	private float kmsRodado;
	protected int velocidade;
	private double preco;

	public void pintar(String cor) {
		
		this.cor = cor;
	}
}
