public class PagamentoValePresente implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.printf("Pagamento com Vale Presente realizado: R$ %.2f%n", valor);
	}
}
