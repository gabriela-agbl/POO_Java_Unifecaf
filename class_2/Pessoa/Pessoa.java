public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){ //Definindo parametros no construtor
        this.nome = nome;
        this.idade = idade;
    }

    //GET and SET

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade > 50){
            this.idade = idade;
        }
    }

    void apresentar(){
        System.out.println("Ola! Meu nome é " + nome + "\nTenho " + idade + " anos!");
    }
}