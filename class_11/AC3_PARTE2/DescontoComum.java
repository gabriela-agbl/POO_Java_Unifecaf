public class DescontoComum implements DescontoStrategy{
    @Override
    public double calcular(double valor){
        return valor * 0.05;
    }
}
