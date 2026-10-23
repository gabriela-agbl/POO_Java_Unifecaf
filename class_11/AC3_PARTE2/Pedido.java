import java.util.ArrayList;

public class Pedido {
   private ArrayList<Produto> produtos;
   private DescontoStrategy descontoStrategy; 

   public void adicionarProduto(Produto produto){
    produtos.add(produto);
    System.out.println("Produto adicionado!");

   }

   public double calcularTotal(){
    for(Produto produto:produto){
        produto.calcularSubtotal();
    }
   }

   public double calcularDesconto(){
    descontoStrategy.calcular(produto.getPreco);
   }


   public double calcularValorFinal(){

   }


   public void alterarDesconto(DescontoStrategy estrategia);
}
