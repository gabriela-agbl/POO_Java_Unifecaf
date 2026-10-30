public class Main {
    public static void main(String[] args){
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        ObservadorTemperatura temperatura = new DisplayTemperatura();
        ObservadorTemperatura alerta = new AlertaCalor();

        estacao.armazenar_alerta(temperatura);
        estacao.armazenar_alerta(alerta);

        estacao.confirmarTemperatura(57);
        estacao.confirmarTemperatura(22);
        estacao.confirmarTemperatura(30);
        estacao.confirmarTemperatura(37);
    }
}
