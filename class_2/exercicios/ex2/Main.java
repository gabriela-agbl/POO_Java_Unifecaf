public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcelo");

        aluno.setNota1(11);
        aluno.setNota2(7);

        System.out.println("Media do aluno: " + aluno.calcularMedia());
    }
}
