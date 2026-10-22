public class Main{
    public static void main(String[] args){
        Pedido pedido = new Pedido(new EntregaNormal());

        double peso = 4.0;

        System.out.printf("Entrega normal: R$ %.2f%n",
            pedido.calcularEntrega(peso);
        );

        pedido.alterarEntrega(new EntregaExpresso);

        System.out.printf("Entrega expresso: R$ %.2f%n",
            pedido.calcularEntrega(peso);
        );

    }
}