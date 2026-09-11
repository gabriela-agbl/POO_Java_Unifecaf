public abstract class Funcionario {
	protected String nome;
	protected double salario;
	protected Projeto projeto;
	
	public Funcionario(String nome, double salario, Projeto projeto) {
		this.nome = nome;
		this.salario = salario;
		this.projeto = projeto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}
	
	public abstract double calcularBonus();
	
	public void exibirDados() {
		System.out.printf("Nome: %s %nSalário: %.2f %nProjeto: %s %nDescrição: %s %n", nome, salario, projeto.getNome(), projeto.getDescricao());
	}
}
