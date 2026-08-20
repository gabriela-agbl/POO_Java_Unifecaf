public class Main {
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua 20", 676767);
        Pessoa pessoa = new Pessoa("Maria", endereco);

        pessoa.cadastro();
    }
}