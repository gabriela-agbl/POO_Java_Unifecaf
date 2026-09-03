import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Funcionario funcionario1 = new Funcionario("João");
		// Funcionario funcionario2 = new Gerente("Bruno");
		// Funcionario funcionario3 = new Desenvolvedor("Rodrigo");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Gerente("Otávio"));
		funcionarios.add(new Desenvolvedor("Maria"));
		
		for(Funcionario funcionario : funcionarios) {
			funcionario.trabalhar();
		}
	}

}
