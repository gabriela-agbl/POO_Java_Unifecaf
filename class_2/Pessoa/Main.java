public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Maria", 20);
        Pessoa pessoa2 = new Pessoa("Mario", 19);

        pessoa.idade = 400;

        pessoa.apresentar();
        pessoa2.apresentar();
    }
}