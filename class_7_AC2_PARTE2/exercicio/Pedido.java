import java.util.ArrayList;

public class Pedido {
	private String cliente;
	private ArrayList<Produto> produtos;
	
	public Pedido(String cliente) {
		this.cliente = cliente;
		this.produtos = new ArrayList<>();
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		
		System.out.printf("Produto %s adicionado no pedido%n", produto.getNome());
	}
	
	public double calcularTotal(){
		double total = 0;
		
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		
		return total;
	}
	
	public void listarProdutos() {
		System.out.printf("--Produtos--%n");
		
		for (Produto produto : produtos) {
			System.out.printf("%s - R$ %.2f%n", produto.getNome(), produto.getPreco());
		}
		
		System.out.printf("Total: R$ %.2f%n", calcularTotal());
	}
}
