package AC3;

public class DocumentoPDF extends Documento implements Assinavel, Imprimivel{
	@Override
	public void visualizar() {
		System.out.println("PDF visualizado");
	}
	
	@Override
	public void imprimir() {
		System.out.println("PDF imprimido");
	}
	
	@Override
	public void assinar(String responsavel) {
		System.out.println("PDF de " + responsavel + " assinado");
	}
}
