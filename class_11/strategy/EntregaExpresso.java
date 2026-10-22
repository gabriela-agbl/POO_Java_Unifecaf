public class EntregaExpresso implements EntregaStrategy{
    @Override
    public double calcular(double peso){
        return (peso * 10.0) + 15.0;
    }
}