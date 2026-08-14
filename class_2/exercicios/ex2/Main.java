public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcelo");

        aluno.setNota1(11);
        aluno.setNota2(7);

        System.out.println("Nota 1: " + aluno.getNota1() + "\nNota 2: " + aluno.getNota2() + "\nMedia do aluno: " + aluno.calcularMedia());
    }
}
