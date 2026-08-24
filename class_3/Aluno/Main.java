public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Inglês");
        Aluno aluno = new Aluno("Maria", curso);

        aluno.exibirDados();
    }
}