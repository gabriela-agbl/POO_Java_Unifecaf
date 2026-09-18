public class PagamentoPix implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("Pagamento com PIX realizado: R$ %.2f%n", valor);
	}
}
