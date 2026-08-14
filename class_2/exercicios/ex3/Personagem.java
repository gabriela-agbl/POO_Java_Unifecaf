public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getForca(){
        return forca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

     public void setVida(int vida){
        this.vida = vida;
    }

     public void setForca(int forca){
        this.forca = forca;
    }

    public void receberDano(int dano){
        vida = vida - dano;

        if (vida < 0){
            vida = 0;
        }
    }

    public void atacar(Personagem inimigo){
        System.out.println(nome + " atacou " + inimigo.getNome());
        inimigo.receberDano(forca);
    }
}
