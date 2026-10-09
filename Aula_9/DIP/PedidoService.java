package DIP;

public class PedidoService {
	//private EmailService emailService = new EmailService();
	
	private Notificador notificador;
	
	public PedidoService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void finalizar_pedido() {
		System.out.println("Pedido finalizado");
		notificador.enviar("Seu pedido foi finalizado");
	}
}
