package coo.tdd.exercicio.dois.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Produto {
		
	private String nome;
	private double preco;
	private int qtd;
}
