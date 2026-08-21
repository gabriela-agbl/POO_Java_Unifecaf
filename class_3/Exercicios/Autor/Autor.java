public class Autor{
    private String nome;
    private Livro livro;

    public Autor(String nome, Livro livro){
        this.nome = nome;
        this.livro = livro;
    }

    public void apresentar(){
        System.out.println("Autor: " +nome);
        System.out.println("Livro: " +livro.getNome());
    }
}
