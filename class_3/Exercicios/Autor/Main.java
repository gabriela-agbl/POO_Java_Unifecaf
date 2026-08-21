public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Calabresa");
        Autor autor = new Autor("Maria", livro);

        autor.apresentar();
    }
}
