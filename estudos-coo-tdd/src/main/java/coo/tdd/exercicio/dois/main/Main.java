package coo.tdd.exercicio.dois.main;

import java.util.ArrayList;
import java.util.List;

import coo.tdd.exercicio.dois.model.Livro;
import coo.tdd.exercicio.dois.model.Loja;
import coo.tdd.exercicio.dois.model.VideoGame;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<>();
		livros.addAll(List.of(l1, l2, l3));
		
		List<VideoGame> games = new ArrayList<>();
		games.addAll(List.of(ps4, ps4Usado, xbox));
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		l2.calculaImposto();
		l3.calculaImposto();
		
		ps4Usado.calculaImposto();
		ps4.calculaImposto();
		
		americanas.listaLivros();
		americanas.listaVideoGames();
		americanas.calculaPatrimonio();
		
	}

}
