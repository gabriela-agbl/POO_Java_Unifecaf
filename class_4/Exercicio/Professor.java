public class Professor extends Usuario{
    private String disciplina;

    public Professor(String nome, String email, String disciplina){
        super(nome, email);
        this.disciplina = disciplina;
    }

    public void exibir_professor(){
        System.out.println("Nome: " +getNome());
        System.out.println("Tipo: Professor");
        System.out.println("E-mail: " +getEmail());
        System.out.println("Disciplina: " +disciplina);
    }
}