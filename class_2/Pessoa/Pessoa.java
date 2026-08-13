public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){ //Definindo parametros no construtor
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Ola! Meu nome é " + nome + "\nTenho " + idade + " anos!");
    }
}