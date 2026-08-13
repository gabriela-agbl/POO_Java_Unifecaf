public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Maria", 10);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.setNome("Olivia");
        pessoa.setIdade(60);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.apresentar();
    }
}