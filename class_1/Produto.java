public class Produto {
    String nome;
    double preco;
    int quantidade;

    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto2 = new Produto();

        produto.nome = "Computador Gamer";
        produto.preco = 3768.15;
        produto.quantidade = 200;

        produto2.nome = "Geladeira";
        produto2.preco = 2070.15;
        produto2.quantidade = 100;

        System.out.println("----Produto 1----");
        System.out.println("\nNome:" + produto.nome + "\nPreco:" + produto.preco + "\nQuantide:" + produto.quantidade);
        System.out.println("\n----Produto 2----");
        System.out.println("\nNome:" + produto2.nome + "\nPreco:" + produto2.preco + "\nQuantide:" + produto2.quantidade);
    }
}
