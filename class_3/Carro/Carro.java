public class Carro{
    private String modelo;
    private Motor motor;

    public Carro(String modelo, int potencia){
        this.modelo = modelo;
        this.motor = new Motor(potencia);
    }

    public void ligar(){
        System.out.println("Ligando " +modelo);
        motor.ligar();
    }
}