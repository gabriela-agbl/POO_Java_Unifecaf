public class Cachorro extends Animal{
	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void emitir_som() {
		System.out.println("Au au!");
	}
	
	public void apresentar() {
		System.out.println("Nome: " +nome);
	}
}
