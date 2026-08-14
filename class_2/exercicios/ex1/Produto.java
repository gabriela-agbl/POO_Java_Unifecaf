public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome){
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double calcularTotal(){
        return preco * quantidade;
    }
}
