import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto produto1 = new Produto("Arroz", 5.0);
		Produto produto2 = new Produto("Feijão", 6.0);
		
		Pedido pedido = new Pedido("Maria");
		
		PagamentoBoleto boleto = new PagamentoBoleto();
		PagamentoCartao cartao = new PagamentoCartao();
		PagamentoPix pix = new PagamentoPix();
		PagamentoService pagamento = new PagamentoService();
		PagamentoValePresente valepresente = new PagamentoValePresente();
		
		PedidoRepository bd = new PedidoRepository();
		EmailService email = new EmailService();
		RelatorioPedido relatorio = new RelatorioPedido();
		
		pedido.adicionarProduto(produto1);
		pedido.adicionarProduto(produto2);
		
		pedido.listarProdutos();
		
		double total = pedido.calcularTotal();
		
		pagamento.processar(boleto, total);
		pagamento.processar(cartao, total);
		pagamento.processar(pix, total);
		pagamento.processar(valepresente, total);
		
		bd.adicionar_pedido(pedido);
		email.enviar_email(pedido);
		relatorio.gerar_relatorio(pedido);

	}

}
