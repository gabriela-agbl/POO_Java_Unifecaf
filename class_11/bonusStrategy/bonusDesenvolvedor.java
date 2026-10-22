public class bonusDesenvolvedor implements BonusStrategy{
    @Override 
    public double calcularBonus(double salario){
        return salario * 0.15;
    }
}
