import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("Jogador 1", 100, 10, 1);
        Jogador jogador2 = new Jogador("Jogador 2", 150, 12, 2);
        Jogador jogador3 = new Jogador("Jogador 3", 200, 9, 1);
        Jogador jogador4 = new Jogador("Jogador 4", 180, 11, 2);
        Jogador jogador5 = new Jogador("Jogador 5", 120, 8, 3);

        Jogador[] jogadores = { jogador1, jogador2, jogador3, jogador4, jogador5 };

        Jogador vencedor = jogador1;
        for (int i = 1; i < jogadores.length; i++) {
            if (jogadores[i].compareTo(vencedor) > 0) {
                vencedor = jogadores[i];
            }
        }

        vencedor.subirNivel();

        System.out.println("O vencedor é:");
        vencedor.exibirInformacoes();
    }
}
