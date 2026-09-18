public class RelatorioPedido {
	public void gerar_relatorio(Pedido pedido) {
		System.out.printf("--Pedido da cliente %s%n--", pedido.getCliente());
		pedido.listarProdutos();
	}
}
