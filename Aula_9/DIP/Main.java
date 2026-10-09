package DIP;

public class Main {

	public static void main(String[] args) {
		Notificador email = new EmailNotificador();
		Notificador sms = new SmsNotificador();
		
		PedidoService pedido = new PedidoService(email);
		pedido.finalizar_pedido();
		
		PedidoService pedido2 = new PedidoService(sms);
		pedido2.finalizar_pedido();
	}

}
