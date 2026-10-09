package AC3;

public class Carro extends Veiculo implements Motorizado{
	@Override
	public void ligarMotor() {
		System.out.println("Carro ligado");
	}
	
	@Override 
	public void mover() {
		System.out.println("Carro está movendo");
	}
}
