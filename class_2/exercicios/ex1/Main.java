public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz");

        produto.setPreco(3.50);
        produto.setQuantidade(35);

        System.out.println("Valor total: " + produto.calcularTotal());
    }
}