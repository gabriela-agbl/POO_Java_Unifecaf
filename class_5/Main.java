public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Dog");
		Animal animal = new Gato("Cat");
		Animal animal2 = new Cachorro("Dog2");
		
		cachorro.apresentar();
		cachorro.emitir_som();
		
		animal.apresentar();
		animal.emitir_som();
		
		animal2.apresentar();
		animal2.emitir_som();
		
	}

}
