public class NotificacaoCliente implements ObservadorPedido{
    @Override

    public void atualizar(String mensagem){
        System.out.printf("Pedido confirmado!");
    }
}
