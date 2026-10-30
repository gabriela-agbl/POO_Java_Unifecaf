package Observer;
public class NotificadorSMS implements Observador{
    @Override 

    public void atualizar(String mensagem){
        System.out.println("SMS: " +mensagem);
    }
}
