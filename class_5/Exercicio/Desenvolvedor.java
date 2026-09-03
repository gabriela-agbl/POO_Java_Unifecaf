public class Desenvolvedor extends Funcionario{
	public Desenvolvedor(String nome) {
		super(nome);
	}
	
	@Override
	public void trabalhar() {
		System.out.println("O desenvolvedor " +nome+ " está programando");
	}
}
