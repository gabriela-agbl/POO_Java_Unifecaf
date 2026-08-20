public class Endereco{
    private String logradouro;
    private int cep;

    public Endereco(String logradouro, int cep){
        this.logradouro = logradouro;
        this.cep = cep;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public int getCep(){
        return cep;
    }
}