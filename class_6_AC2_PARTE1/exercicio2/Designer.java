public class Designer extends Funcionario implements Trabalhavel{
	private String ferramentaPrincipal;
	
	public Designer(String nome, double salario, Projeto projeto, String ferramentaPrincipal) {
		super(nome, salario, projeto);
		this.ferramentaPrincipal = ferramentaPrincipal;
	}
	
	public String getFerramentaPrincipal() {
		return ferramentaPrincipal;
	}
	
	@Override
	
	public double calcularBonus() {
		return salario * 1.08;
	}
	
	@Override 
	
	public void trabalhar() {
		System.out.printf("Designer: %s %nFerramenta Principal: %s %nProjeto: %s %n", nome, ferramentaPrincipal, projeto.getNome());
	}
	
	@Override 
	
	public void exibirDados() {
		super.exibirDados();
		
		System.out.printf("Ferramenta Principal: %s %n", ferramentaPrincipal);
	}
}
