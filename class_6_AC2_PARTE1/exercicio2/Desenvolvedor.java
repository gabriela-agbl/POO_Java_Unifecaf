public class Desenvolvedor extends Funcionario implements Trabalhavel{
	private String linguagemPrincipal;
	
	public Desenvolvedor(String nome, double salario, Projeto projeto, String linguagemPrincipal) {
		super(nome, salario, projeto);
		this.linguagemPrincipal = linguagemPrincipal;
	}
	
	public String getLinguagemPrincipal() {
		return linguagemPrincipal;
	}
	
	@Override
	
	public double calcularBonus() {
		return salario * 1.10;
	}
	
	@Override
	
	public void trabalhar() {
		System.out.printf("Desenvolvedor: %s %nLinguagem Principal: %s %nProjeto: %s %n", nome, linguagemPrincipal, projeto.getNome());
	}
	
	@Override
	
	public void exibirDados() {
		super.exibirDados();
		
		System.out.printf("Linguagem Principal: %s %n", linguagemPrincipal);
	}
}
