public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida ;
    protected int mana ;

    public Personagem(String nome, int nivel, int vida, int mana){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;

    }

    public abstract void atacar();
    public abstract void defender();

    public String getNome(){
        return nome;
    }
}

