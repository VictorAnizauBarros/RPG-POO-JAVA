public class Mago extends Personagem{
    public Mago(String nome, int nivel){
        super(nome,nivel,60,100);
    }

    @Override
    public void atacar(){
        System.out.println(nome + "lança uma bola de fogo" );
    }

    @Override
    public void defender(){
        System.out.println(nome + "usa o escudo mágico.");
    }
}
