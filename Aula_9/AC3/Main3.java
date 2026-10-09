package AC3;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		ArrayList<Documento> docs = new ArrayList<Documento>();
		
		docs.add(new DocumentoPDF());
		docs.add(new DocumentoTexto());
		docs.add(new DocumentoDigitalRestrito());
		
		for(Documento doc:docs) {
			doc.visualizar();
		}
		
		Assinavel pdf = new DocumentoPDF();
		
		pdf.assinar("Gabriela");
		
		Imprimivel texto = new DocumentoTexto();
		
		texto.imprimir();
	}

}
