public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Maria", 20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.setNome("Olivia");
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.apresentar();
    }
}