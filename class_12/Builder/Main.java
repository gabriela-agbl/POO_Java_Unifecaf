public class Main {
    public static void main(String[] args){
        Computador computador = new Computador.Builder("Intel i7")
        .memoriaRAM(32)
        .armazenamento(1000)
        .placaVideo("RTX 4060").build();

        computador.exibirConfig();
    }
}
