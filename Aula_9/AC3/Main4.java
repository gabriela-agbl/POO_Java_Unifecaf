package AC3;

public class Main4 {

	public static void main(String[] args) {
		ImpressoraSimples impressora = new ImpressoraSimples();
		Scanner scan = new Scanner();
		Multifuncional multi = new Multifuncional();
		
		impressora.imprimir("DOC SECRETO");
		scan.escanear();
		multi.escanear();
		multi.imprimir("DOC SECRETO");
		multi.copiar();
		
		CentralDocumentos central = new CentralDocumentos();
		
		central.imprimir("DOC CENTRAL");
		central.escanear();
		central.copiar();

	}

}
