import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Voador> voadores = new ArrayList<>();
		
		voadores.add(new Drone());
		voadores.add(new Aviao());
		voadores.add(new Passaro());
		
		for(Voador voador : voadores) {
			voador.voar();
		}
	}

}
