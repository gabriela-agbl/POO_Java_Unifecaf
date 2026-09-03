public class Funcionario {
	protected String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public void trabalhar() {
		System.out.println("O funcionário " +nome+ " está trabalhando");
	}
}
