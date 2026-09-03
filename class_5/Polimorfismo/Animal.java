public abstract class Animal {
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void apresentar() {
		System.out.println("Animal: " +nome);
	}
	
	public abstract void emitir_som();
}