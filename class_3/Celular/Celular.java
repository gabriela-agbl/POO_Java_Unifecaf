public class Celular {
    private String marca;
    private String modelo;
    private Bateria bateria;
    
    public Celular(String marca, String modelo, int capacidade, int nivel){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = new Bateria(capacidade, nivel);
    }

    public void exibirDados(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        
        bateria.exibir_nivel();
    }
}
