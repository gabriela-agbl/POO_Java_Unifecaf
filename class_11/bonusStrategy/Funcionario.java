public class Funcionario {
    protected String nome;
    protected double salario;
    protected BonusStrategy bonusStrategy;

    public Funcionario(BonusStrategy bonusStrategy, String nome, double salario){
        this.bonusStrategy = bonusStrategy;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public double calcularBonus(){
        return this.bonusStrategy.calcularBonus(getSalario());
    }

    public double calcularRemuneracaoTotal(){
        double total = this.getSalario() + this.calcularBonus();
        return total;
    }

    public void alterarBonus(BonusStrategy novoBonus){
        this.bonusStrategy = novoBonus;
    }
}
