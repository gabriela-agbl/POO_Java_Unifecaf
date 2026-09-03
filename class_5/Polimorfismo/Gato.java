public class Gato extends Animal{
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitir_som() {
		System.out.println("Miau!");
	}
	
	public void apresentar() {
		System.out.println("Nome: " +nome);
	}
}
