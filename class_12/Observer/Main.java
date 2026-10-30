package Observer;
public class Main {
    public static void main(String[] args){
        Pedido pedido = new Pedido();

        Observador email = new NotificadorEmail();
        Observador sms = new NotificadorSMS();

        pedido.adicionar_observador(email);
        pedido.adicionar_observador(sms);

        pedido.confirmar_pedido();
    }
}
