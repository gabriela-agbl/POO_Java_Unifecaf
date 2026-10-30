public class NotificacaoEstoque implements ObservadorPedido{
    @Override

    public void atualizar(String mensagem){
        System.out.printf("Produtos devem ser separados");
    }
}
