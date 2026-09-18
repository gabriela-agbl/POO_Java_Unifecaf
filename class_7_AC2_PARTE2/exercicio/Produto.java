public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void exibirDados() {
		System.out.printf("---Dados do produto---%n");
		
		System.out.printf("Nome: %s%n Preço: $.2f%n", nome, preco);
	}
}
