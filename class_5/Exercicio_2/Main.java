import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pagamento> pagamentos = new ArrayList<>();
		
		pagamentos.add(new Pix(100));
		pagamentos.add(new Cartao(250));
		pagamentos.add(new Pix(150));
		
		for(Pagamento pagamento : pagamentos) {
			pagamento.processar();
		}

	}

}
