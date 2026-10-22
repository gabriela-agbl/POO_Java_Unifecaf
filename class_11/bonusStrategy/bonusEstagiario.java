public class bonusEstagiario implements BonusStrategy{
    @Override 
    public double calcularBonus(double salario){
        return salario * 0.15;
    }
}
