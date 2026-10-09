package AC3;

public class Moto extends Veiculo implements Motorizado{
	@Override
	public void ligarMotor() {
		System.out.println("Moto ligada");
	}
	
	@Override 
	public void mover() {
		System.out.println("Moto está movendo");
	}
}
