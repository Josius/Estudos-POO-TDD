package coo.tdd.exercicio.dois.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public void listaTodosOsProdutos(){
		listaLivros();
		listaVideoGames();
	}

	public void listaLivros() {
		System.out.println("-----------------------------------------------------------------"
				+ "\nA loja Americanas possui estes livros para venda:");

		listaTodosOsLivrosComPrecoEQuantidade();

	}

	public void listaVideoGames() {
		System.out.println("-----------------------------------------------------------------"
				+ "\nA loja Americanas possui estes video-games para venda:");

		listaTodosOsVideosGamesComPrecoEQuantidade();
	}

	public double calculaPatrimonio() {
		double patrimonio = 0;

		patrimonio = calculaTotalPatrimonioDosLivros(patrimonio);
		patrimonio = calculaTotalPatrimonioDosVideoGames(patrimonio);

		mensagemComOPatrimonioTotalDaLoja(patrimonio);

		return 0;
	}

	private void listaTodosOsLivrosComPrecoEQuantidade() {
		livros.stream()
				.forEach(livro -> System.out.println("Titulo: " + livro.getNome() + ", preco: " + livro.getPreco()
						+ ", quantidade: " + livro.getQtd() + " em estoque."));
	}

	private void listaTodosOsVideosGamesComPrecoEQuantidade() {
		videoGames.stream()
				.forEach(videoGame -> System.out.println("Video-game: " + videoGame.getModelo() + ", preco: "
						+ videoGame.getPreco() + ", quantidade: " + videoGame.getQtd() + " em estoque."));
	}

	private void mensagemComOPatrimonioTotalDaLoja(double patrimonio) {
		System.out.println("-----------------------------------------------------------------"
				+ "\nO patrimonio da loja: Americanas e de R$ " + patrimonio);
	}

	private double calculaTotalPatrimonioDosVideoGames(double patrimonio) {

		for (VideoGame videoGame : videoGames) {
			patrimonio += videoGame.getPreco() * videoGame.getQtd();
		}
		return patrimonio;
	}

	private double calculaTotalPatrimonioDosLivros(double patrimonio) {
		for (Livro livro : livros) {
			patrimonio += livro.getPreco() * livro.getQtd();
		}
		return patrimonio;
	}

}
