import java.util.ArrayList;
import java.util.List;

public class ProcessadorPedido {
   Pagamento pagamento;
   private List<ObservadorPedido> observadores;
   
   public ProcessadorPedido(Pagamento pagamento){
    this.pagamento = pagamento;
    this.observadores = new ArrayList<>();
   }

   public void processar(Pedido pedido){
    double ValorFinal = pedido.calcularTotal();
    pagamento.pagar(ValorFinal);
   }

   public void adicionar_observador(ObservadorPedido observador){
    this.observadores.add(observador);
   }

   private void notificadorObservadores(){
    for(ObservadorPedido observador : observadores)
        {
            observador.atualizar("Notificando");
        }
   }
}
