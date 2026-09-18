public class EmailService {
	public void enviar_email(Pedido pedido) {
		System.out.printf("O seu pedido já foi enviado para o seu e-mail %s%n", pedido.getCliente());
	}
}
