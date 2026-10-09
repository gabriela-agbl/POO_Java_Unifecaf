package AC3;

public class ContaPoupanca extends ContaBancaria implements Sacavel{
	@Override
	public void sacar(double valor) {
		System.out.println("Valor: " + valor + " sacado da conta poupança");
	}
	
	public void aplicarRendimento(double percentual) {
		System.out.println("Rendimento de " + percentual + " aplicado na poupança ");
	}
}
