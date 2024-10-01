public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel){
        super( nome,nivel,100,0);
    }

    @Override
    public void atacar(){
        System.out.println(nome + " ataca com sua espada" );
    }

    @Override
    public void defender(){
        System.out.println(nome + "se defende com escudo.");
    }
}
