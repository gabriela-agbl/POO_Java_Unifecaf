import java.util.ArrayList;

public class Gerente extends Funcionario implements Trabalhavel{
	ArrayList<Funcionario> funcionarios;
	
	public Gerente(String nome, double salario, Projeto projeto) {
		super(nome, salario, projeto);
		this.funcionarios = new ArrayList<>();
	}
	
	@Override
	
	public double calcularBonus() {
		return salario * 1.15;
	}
	
	@Override 
	
	public void trabalhar() {
		System.out.printf("Gerente: %s %nProjeto: %s %n", nome, projeto.getNome());
	}
	
	@Override
	
	public void exibirDados() {
		super.exibirDados();
		
		System.out.printf("Funcionários na equipe %s %n",funcionarios.size());
		
	}
	
	public void adicionar_funcionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarEquipe() {
		if(funcionarios.isEmpty()) {
			System.out.printf("Não tem funcionários na equipe");
		}
		
		for(Funcionario funcionario : funcionarios) {
			System.out.printf("Funcionário: %s %n", nome);
		}
	}
}
