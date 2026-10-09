package AC3;

public abstract class ContaBancaria {
	protected String titular;
	protected int numero;
	protected double saldo;
	
	public void consultar_saldo() {
		System.out.println("Saldo consultado");
	}
	
	public void depositar_positivos(double valor) {
		if(valor <= 0) {
			System.out.println("Não foi possível realizar o deposito");
			
			return;
		}
		
		saldo += valor;
		System.out.println("Novo saldo: " + saldo);
	}
}
