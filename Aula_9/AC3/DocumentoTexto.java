package AC3;

public class DocumentoTexto extends Documento implements Imprimivel{
	@Override
	public void visualizar() {
		System.out.println("Texto visualizado");
	}
	
	@Override
	public void imprimir() {
		System.out.println("Texto imprimido");
	}

}
