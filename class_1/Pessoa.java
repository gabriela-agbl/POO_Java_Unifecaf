public class Pessoa{
    String nome;
    int idade;

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Gabriela";
        pessoa.idade = 20;

        System.out.println("Nome:" + pessoa.nome + "\nIdade:" + pessoa.idade);
    }
}