public class NotificacaoTransportadora implements ObservadorPedido{
    @Override

    public void atualizar(String mensagem){
        System.out.printf("Pedido pronto para a preparação da entrega");
    }
}
