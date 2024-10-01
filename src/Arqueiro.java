public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int nivel){
        super(nome,nivel,80,50);
    }
    @Override
    public void atacar(){
        System.out.println(nome + "atira uma flecha" );
    }
    @Override
    public void defender(){
        System.out.println(nome + "se esconde atrás da árvore.");
    }
}