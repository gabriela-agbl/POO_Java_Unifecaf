public class Pessoa{
    private String nome;
    private Endereco endereco;
    
    public Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void cadastro(){
        System.out.println("Pessoa: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: "+ endereco.getLogradouro());
        System.out.println("CEP: "+ endereco.getCep());
    }
}