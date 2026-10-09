package AC3;

public class ImpressoraSimples implements Imprimivel2{
	@Override
	public void imprimir(String documento) {
		System.out.println("O documento: " + documento + " foi imprimido");
	}
}
