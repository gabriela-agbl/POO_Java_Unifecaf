package AC3;

public class Multifuncional implements Imprimivel2, Escaneavel, Copiavel{
	@Override
	public void imprimir(String documento) {
		System.out.println("O documento: " + documento + " foi imprimido");
	}
	
	@Override
	public void escanear() {
		System.out.println("Escaneado");
	}
	
	@Override
	public void copiar() {
		System.out.println("Copiado");
	}
}