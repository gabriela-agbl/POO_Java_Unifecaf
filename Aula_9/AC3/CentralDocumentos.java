package AC3;

public class CentralDocumentos extends Multifuncional{
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