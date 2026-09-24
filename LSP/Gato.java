public class Gato extends Animal{
	@Override
	public void emitirSom() {
		throw new UnsupportedOperationException(
				"Não é um animal");
	}
}
