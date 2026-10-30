import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final String cliente;
    private final List<Produto> produtos;
    private final String enderecoEntrega;
    private final boolean entregaExpressa;
    private final String observacoes;

    private Pedido(Builder builder){
        this.cliente = builder.cliente;
        this.produtos = builder.produtos;
        this.enderecoEntrega = builder.enderecoEntrega;
        this.entregaExpressa = builder.entregaExpressa;
        this.observacoes = builder.observacoes;
    }

    public double calcularTotal(){
        double Total = 0;
        for(Produto produto : produtos){
            Total += produto.calcularSubtotal();
        }

        return Total;
    }

    public static class Builder{
        private String cliente;
        private List<Produto> produtos = new ArrayList<>();
        private String enderecoEntrega;
        private boolean entregaExpressa;
        private String observacoes;

        public Builder(String cliente){
            this.cliente = cliente;
        }

        public Builder produtos(List<Produto> produtos){
            this.produtos = produtos;
            return this;
        }

        public Builder adicionarProduto(Produto produto){
            this.produtos.add(produto);
            
            return this;
        }

        public Builder enderecoEntrega(String enderecoEntrega){
            this.enderecoEntrega = enderecoEntrega;
            return this;
        }

        public Builder entregaExpressa(boolean entregaExpressa){
            this.entregaExpressa = entregaExpressa;
            return this;
        }

        public Builder observacoes(String observacoes){
            this.observacoes = observacoes;
            return this;
        }

        public Pedido build(){
            if(cliente == null || produtos.isEmpty() || enderecoEntrega == null){
                throw new IllegalStateException("Configuração inválida");
            }

            return new Pedido(this);
        }
    }
}
