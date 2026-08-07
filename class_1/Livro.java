public class Livro {
    String titulo;
    String autor;
    int paginas;

    public static void main(String[] args){
        Livro livro = new Livro();

        livro.titulo = "A Song of Ice and Fire";
        livro.autor = "George R. R. Martin";
        livro.paginas = 704;

        System.out.println("Titulo:" + livro.titulo + "\nAutor:" + livro.autor + "\nPaginas:" + livro.paginas);
    }
}
