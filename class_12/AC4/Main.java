public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto("Arroz", 20, 3);
        Produto produto2 = new Produto("Miojo", 5, 6);
        Produto produto3 = new Produto("Banana", 7, 2);

        Pedido pedido = new Pedido.Builder("Carlos")
            .adicionarProduto(produto1)
            .adicionarProduto(produto2)
            .enderecoEntrega("Rua das Flores, 100")
            .entregaExpressa(true)
            .observacoes("Entregar pela manhã")
            .build();

        pedido.calcularTotal();

        PagamentoLegado legado = new PagamentoLegado();
        Pagamento pagamento = new PagamentoAdapter(legado);

        ProcessadorPedido processador = new ProcessadorPedido(pagamento);
        processador.adicionar_observador(new NotificacaoCliente());
        processador.adicionar_observador(new NotificacaoEstoque());
        processador.adicionar_observador(new NotificacaoTransportadora());

        processador.processar(pedido);

        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produtos:");
        System.out.println("Teclado - 2 unidades - R$ 300,00");
        System.out.println("Mouse - 1 unidade - R$ 80,00");
        System.out.println("Monitor - 1 unidade - R$ 900,00");
        System.out.printf("Total: R$ %.2f", pedido.calcularTotal());
    }
}
