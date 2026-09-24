public class Aguia extends Ave implements Voadora{
	@Override
	public void mover() {
		System.out.println("Àguia está se movendo");
	}
	
	@Override
	public void voar() {
		System.out.println("Águia está voando");
	}
}
