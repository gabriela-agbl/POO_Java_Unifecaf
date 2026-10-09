package AC3;

public class ContaCorrente extends ContaBancaria implements Sacavel{
	@Override
	public void sacar(double valor) {
		System.out.println("Valor: " + valor + " sacado da conta corrente");
	}
}
