public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Funcionario(new bonusDesenvolvedor(), "Maria", 5500);

        Funcionario gerente = new Funcionario(new bonusGerente(), "Ana", 8800);

        Funcionario estag = new Funcionario(new bonusEstagiario(), "Lucas", 1500);

        System.out.printf("----Bonus de Funcionario----%n");

        System.out.printf("Funcionario: %s%nSalario: R$ %.2f%nBonus: R$ %.2f%nRemuneração Total: R$ %.2f%n",
            dev.getNome(),
            dev.getSalario(),
            dev.calcularBonus(),
            dev.calcularRemuneracaoTotal()
        );
    }
}
