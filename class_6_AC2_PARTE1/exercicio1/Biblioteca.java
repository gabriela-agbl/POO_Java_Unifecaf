import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> livros;
	
	public Biblioteca(String nome, ArrayList<Livro> livros) {
		this.nome = nome;
		this.livros = livros;
	}
	
	public void adicionar_livro(Livro livro) {
		livros.add(livro);
	}
	
	public void listar_livros() {
		System.out.printf("Biblioteca:%s %n", nome);
		
		for(Livro livro : livros) {
			System.out.printf("Livro: %s - Autor: %s - Disponível: %b %n", livro.getTitulo(), livro.getAutor(), livro.isDisponivel());
		}
	}
	
	public void emprestar_livro(String titulo) {
		System.out.printf("Biblioteca:%s %n", nome);
		
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				if(livro.isDisponivel()) {
					livro.setDisponivel(false);
					
					System.out.printf("Livro %s emprestado. %n", livro.getTitulo());
					
					return;
				}
				
				System.out.printf("Livro %s já foi emprestado. %n", livro.getTitulo());
				
				return;
			}
		}
		
		System.out.printf("O livro não foi encontrado%n");
	}
	
	public void devolver_livro(String titulo) {
		System.out.printf("Biblioteca:%s %n", nome);
		
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				livro.setDisponivel(true);
				
				System.out.printf("O livro %s foi devolvido. %n", livro.getTitulo());
				
				return;
			}
		}
		
		System.out.printf("O livro não foi encontrado");
	}
	
	public void livros_disponiveis() {
		for(Livro livro : livros) {
			if(livro.isDisponivel()) {
				System.out.printf("Livro: %s - Autor: %s - Disponível: %b %n", livro.getTitulo(), livro.getAutor(), livro.isDisponivel());
			}
		}
	}
}