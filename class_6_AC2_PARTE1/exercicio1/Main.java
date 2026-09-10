import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();
		
		livros.add(new Livro("Dom Quixote", "Miguel Servantes", true));
		livros.add(new Livro("Cem anos de solidão", "Gabriel Garcia", true));
		livros.add(new Livro("1984", "George Orwell", true));
		livros.add(new Livro("Memorias Postumas de Bras Cubas", "Machado de Assis", true));
		livros.add(new Livro("Crime e Castigo", "Fiodor Dostoievski", true));
		
		Biblioteca biblioteca = new Biblioteca("Da rua", livros);
		
		Livro novo_livro = new Livro("O pequeno principe", "Antoine", true);
		
		biblioteca.listar_livros();
		biblioteca.adicionar_livro(novo_livro);
		
		System.out.printf("=========================%n");
		
		System.out.printf("Novo livro adicionado%n");
		
		biblioteca.listar_livros();
		
		System.out.printf("=========================%n");
		
		System.out.printf("Emprestar livro:%n");
		
		biblioteca.emprestar_livro("Crime e castigo");
		
		System.out.printf("Livros disponíveis:%n");
		
		biblioteca.livros_disponiveis();
		
		System.out.printf("Devolver livro:%n");
		
		biblioteca.devolver_livro("Crime e castigo");
		
		System.out.printf("Livros disponíveis:%n");
		
		biblioteca.livros_disponiveis();

		biblioteca.emprestar_livro("UAU");
	}

}