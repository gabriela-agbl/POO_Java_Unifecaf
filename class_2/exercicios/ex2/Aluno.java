public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome){
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public String getNome(){
        return nome;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota1(double nota1){
        if (nota1 > 0 && nota1 <= 10)
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (nota1 + nota2)/2;
    }
}
