public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria");

        conta.depositar(7000);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(300);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
