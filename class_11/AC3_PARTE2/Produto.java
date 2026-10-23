public class Produto {
    private String nome;
    private double preco;
    private int quantidade; 

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        if(preco > 0){
            this.preco = preco;
        }
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calcularSubtotal(){
        return preco * quantidade;
    }
}
