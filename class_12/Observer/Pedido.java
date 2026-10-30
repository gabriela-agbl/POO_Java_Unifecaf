package Observer;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Observador> observadores;
    private String status;

    public Pedido(){
        this.observadores = new ArrayList<>();
        this.status = "PENDENTE";
    }

    public void adicionar_observador(Observador observador){
        this.observadores.add(observador);
    }

    public void remover_observador(Observador observador){
        this.observadores.remove(observador);
    }

    private void notificadorObservadores(){
        for(Observador observador : observadores){
            observador.atualizar("Pedido atualizado: " +status);
        }
    }

    public void confirmar_pedido(){
        this.status = "CONFIRMADO";
        this.notificadorObservadores();
    }
}
