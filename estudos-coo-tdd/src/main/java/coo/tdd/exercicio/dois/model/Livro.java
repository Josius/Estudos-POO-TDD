package coo.tdd.exercicio.dois.model;

import coo.tdd.exercicio.dois.enums.ImpostoDeProduto;
import coo.tdd.exercicio.dois.interfaces.Imposto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {

		if (oLivroEhEducativo()) {
			livroEducativoNaoTemImposto();
		
			return 0;
		}
		
		double imposto = impostoSobreLivroNaoEducativo();
		mensagemSobreOLivroNaoEducativo(imposto);
		
		return imposto;
	}

	private void mensagemSobreOLivroNaoEducativo(double imposto) {
		System.out.println("R$ " + imposto + " de impostos sobre o livro " + this.getNome() + ".");
	}

	private double impostoSobreLivroNaoEducativo() {
		return this.getPreco() * ImpostoDeProduto.IMPOSTO_10.getValor();
	}

	private void livroEducativoNaoTemImposto() {
		System.out.println("Livro educativo nao tem imposto: " + this.getNome() + ".");
	}

	private boolean oLivroEhEducativo() {
		return this.tema.equalsIgnoreCase("educativo");
	}

}
