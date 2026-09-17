public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Maria", 200);
		
		FuncionarioRepository bd = new FuncionarioRepository();
		EmailService email = new EmailService();
		RelatorioFuncionario relatorio = new RelatorioFuncionario();
		
		bd.salvar(funcionario);
		email.enviar(funcionario);
		relatorio.gerar(funcionario);

	}

}
