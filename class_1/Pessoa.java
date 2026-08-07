public class Pessoa{
    String nome; //Atributo//
    int idade;  //Atributo//

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa(); //Instanciando a classe//

        pessoa.nome = "Gabriela"; //Atribuindo valor ao atributo nome//
        pessoa.idade = 20; //Atribuindo valor ao atributo idade//

        System.out.println("Nome:" + pessoa.nome + "\nIdade:" + pessoa.idade); //Exibindo mensagem com os valores//
    }
}

