public class PagamentoCartao implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("Pagamento com cartão realizado: R$ %.2f%n", valor);
	}
}
