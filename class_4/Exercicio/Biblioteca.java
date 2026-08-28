public class Biblioteca{
    private Livro livro;
    private String tipo_user;

    public Biblioteca(String titulo, String autor){
        this.livro = new Livro(titulo, autor);
    }

    public void exibir_livros(){
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " +livro.getAutor());
    }

    public String getTipo_user(){
        return tipo_user;
    }

    public void setTipo_user(String tipo_user){
        this.tipo_user = tipo_user;
    }
}