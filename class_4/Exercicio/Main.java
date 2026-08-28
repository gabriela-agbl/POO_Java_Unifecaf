public class Main{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Nuvem", "Lucas");
    
        biblioteca.exibir_livros();
        biblioteca.setTipo_user("Aluno");
         
        if (biblioteca.getTipo_user().equals("Aluno")){
            Aluno aluno = new Aluno("Maria","Maria@gmail.com","CDC");
            
            aluno.exibir_aluno();
        }

        else if (biblioteca.getTipo_user().equals("Professor")){
            Professor professor = new Professor("Maria", "Maria@gmail.com", "Matemática");
            
            professor.exibir_professor();
        }
    }
}