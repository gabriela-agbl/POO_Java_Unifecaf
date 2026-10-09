package DIP;

public class SmsNotificador implements Notificador{
	@Override
	public void enviar(String mensagem) {
		System.out.println("SMS: " +mensagem);
	}
}
