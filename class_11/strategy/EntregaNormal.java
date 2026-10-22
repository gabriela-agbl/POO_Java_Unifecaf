public class EntregaNormal implements EntregaStrategy{
    @Override
    public double calcular(double peso){
        return peso * 5.0;
    }
}