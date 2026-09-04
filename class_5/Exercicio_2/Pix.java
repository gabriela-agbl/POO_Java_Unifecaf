public class Pix extends Pagamento implements Comprovante{
	public Pix(double valor) {
		super(valor);
	}
	
	@Override
	public void processar() {
		System.out.printf("Pagamento PIX de R$ %.2f processado. %n", valor);
	}
	
	@Override
	public void gerarComprovante() {
		System.out.println("Forma de pagamento: PIX");
		System.out.println("Valor: " +valor);
	}
}
