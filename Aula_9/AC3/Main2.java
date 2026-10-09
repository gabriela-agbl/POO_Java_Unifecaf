package AC3;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		
		contas.add(new ContaCorrente());
		contas.add(new ContaPoupanca());
		contas.add(new ContaInvestimento());
		
		Sacavel conta5 = new ContaCorrente();
		
		for(ContaBancaria conta:contas) {
			conta.depositar_positivos(100);
		}
		
		conta5.sacar(4);

	}

}
