import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite 1 para par e 2 para impar: ");
        int escolha = entrada.nextInt();

        for (int i : vetor) {
            if ((i % 2)==0 && escolha == 1) {
                System.out.println(i);
            }else if ((i % 2) != 0 && escolha == 2) {
                System.out.println(i );
            }
            
        }

    }
}
