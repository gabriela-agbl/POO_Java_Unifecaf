public class PagamentoService {
	public void processar(Pagamento pagamento, double valor) {
		pagamento.pagar(valor);
	}
}
