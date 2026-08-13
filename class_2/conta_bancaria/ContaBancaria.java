public class ContaBancaria{
    // 2 atributos: Titulas e Saldo//

    private String titular;
    private double saldo;

    //Construtor//
    
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    //GET e SET//

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodos//

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        }
    }
}