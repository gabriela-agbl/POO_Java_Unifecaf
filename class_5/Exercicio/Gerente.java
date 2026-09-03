public class Gerente extends Funcionario{
	public Gerente(String nome) {
		super(nome);
	}
	
	@Override
	public void trabalhar() {
		System.out.println("O gerente " +nome+ " está gerenciando a equipe");
	}
}
