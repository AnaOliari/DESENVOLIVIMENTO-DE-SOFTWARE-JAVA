import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        float ipi = entrada.nextFloat();

        System.out.print("Digite o codigo do produto 1: ");
        int produto1 = entrada.nextInt();

        System.out.print("Digite o valor do produto 1: ");
        float valor1 = entrada.nextFloat();

        System.out.print("Digite a quantidade do produto 1: ");
        int quant1 = entrada.nextInt();

        System.out.print("Digite o codigo do produto 2: ");
        int produto2 = entrada.nextInt();

        System.out.print("Digite o valor do produto 2: ");
        float valor2 = entrada.nextFloat();

        System.out.print("Digite a quantidade do produto 2: ");
        int quant2 = entrada.nextInt(); 

        System.out.println( "O codigo do produto 1 é: "+ produto1 + "\nO valor do produto 1 é: " + valor1 + "\nA quantidade do produto 1 é: " + quant1 + "\nO codigo do produto 2 é: "+ produto2 + "\nO valor do produto 2 é: " + valor2 + "\nA quantidade do produto 2 é: " + quant2 + "\nTotal com IPI é de: "+ (((valor1 * quant1) + (valor2 * quant2)) * ipi) + " reais ");

    }
}
