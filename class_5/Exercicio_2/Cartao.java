public class Cartao extends Pagamento implements Comprovante{
	public Cartao(double valor) {
		super(valor);
	}
	
	@Override
	public void processar() {
		System.out.printf("Pagamento no Cartão de R$ %.2f processado. %n", valor);
	}
	
	@Override
	public void gerarComprovante() {
		System.out.println("Forma de pagamento: Cartão");
		System.out.println("Valor: " +valor);
	}
}
