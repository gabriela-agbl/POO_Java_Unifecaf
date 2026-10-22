public class Pedido{
    private EntregaStrategy entregaStrategy;

    public Pedido(EntregaStrategy entregaStrategy){
        this.entregaStrategy = entregaStrategy;
    }

    public double calcularEntrega(double peso){
        return this.entregaStrategy.calcular(peso);
    }

    public void alterarEntrega(EntregaStrategy novaEntrega){
        this.entregaStrategy = novaEntrega;
    }
}