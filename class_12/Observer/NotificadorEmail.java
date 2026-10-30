package Observer;
public class NotificadorEmail implements Observador{
    @Override 

    public void atualizar(String mensagem){
        System.out.println("Email: " + mensagem);
    }
}
