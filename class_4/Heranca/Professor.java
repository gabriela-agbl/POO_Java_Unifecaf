public class Professor extends Pessoa{
    private String curso;

    public Professor(String nome, int idade, String curso){
        super(nome,idade);
        this.curso = curso;
    }

    public void apresentar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Curso: " +curso);
    }
}
