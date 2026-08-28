public class Aluno extends Usuario{
    private String curso;

    public Aluno(String nome, String email, String curso){
        super(nome, email);
        this.curso = curso;
    }

    public void exibir_aluno(){
        System.out.println("Nome: " +getNome());
        System.out.println("Tipo: Aluno");
        System.out.println("E-mail: " +getEmail());
        System.out.println("Curso: " +curso);
    }
}