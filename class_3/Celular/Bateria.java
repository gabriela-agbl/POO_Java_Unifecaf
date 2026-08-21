public class Bateria {
    private int capacidade;
    private int nivel;

    public Bateria(int capacidade, int nivel){
        this.capacidade = capacidade;
        this.nivel = nivel;
    }

    public void exibir_nivel(){
        System.out.println("Capacidade: " +capacidade);
        System.out.println("Nivel: " +nivel);
    }
}
