import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		Projeto projeto1 = new Projeto("Projeto beta", "Teste inicial");
		Projeto projeto2 = new Projeto("Projeto omega", "Teste final");
		
		Desenvolvedor dev = new Desenvolvedor("Ana", 200.00, projeto2, "Python");
		Designer designer = new Designer("Maria", 100.00, projeto1, "Figma");
		Gerente gerente = new Gerente("Lucas", 500.00, projeto1);
		
		funcionarios.add(gerente);
		funcionarios.add(dev);
		funcionarios.add(designer);
		
		dev.exibirDados();
		System.out.println("Bônus aplicado: " +dev.calcularBonus());
		
		gerente.exibirDados();
		System.out.println("Bônus aplicado: " +gerente.calcularBonus());gerente.calcularBonus();
		
		designer.exibirDados();
		System.out.println("Bônus aplicado: " +designer.calcularBonus());
		
		dev.trabalhar();
		gerente.trabalhar();
		designer.trabalhar();

	}

}
