import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu para escolher o seu personagem:
        System.out.println("Escolha o seu personagem:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do seu personagem:");
        String nome = scanner.nextLine();

        Personagem personagem = null;

        switch (escolha) {
            case 1:
                personagem = new Guerreiro(nome, 1);
                break;
            case 2:
                personagem = new Mago(nome, 1);
                break;
            case 3:
                personagem = new Arqueiro(nome, 1);
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }


        System.out.println("Você criou um " + personagem.getClass().getSimpleName() + " chamado " + personagem.getNome() + "!");
        //Menu para escolher ação do personagem:
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Defender");

        int acao = scanner.nextInt();
        switch (acao) {
            case 1:
                personagem.atacar();
                break;
            case 2:
                personagem.defender();
                break;
            default:
                System.out.println("Ação inválida.");
        }

        scanner.close();
    }
}
