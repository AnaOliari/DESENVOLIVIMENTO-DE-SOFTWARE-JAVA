import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float valor1, valor2, resultado;
        int opcao;
        Boolean menu = true;

        while (menu) {
            System.out.println(
                    "Escolha uma das opções \n" +
                            "1 - Soma \n" +
                            "2 - Subtração \n" +
                            "3 - Divisão \n" +
                            "4 - Multiplicação \n" +
                            "5 - Potenciação \n" +
                            "6 - Fatoração \n" +
                            "0 - Sair\n");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        System.out.println("Os números devem ser positivos e não maiores que 50.");
                    return ;
                    }
                    resultado = valor1 + valor2;
                    System.out.println("O resultado da soma é " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        System.out.println("Os números devem ser positivos e não maiores que 50.");
                    return;
                    }
                    resultado = valor1 - valor2;
                    System.out.println("O resultado da subtracao é " + resultado);
                    break;
                case 3:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        System.out.println("Os números devem ser positivos e não maiores que 50.");
                    return;
                    }
                    resultado = valor1 / valor2;
                    System.out.println("O resultado da divisao é " + resultado);
                    break;
                case 4:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        System.out.println("Os números devem ser positivos e não maiores que 50.");
                    return;
                    }
                    resultado = valor1 * valor2;
                    System.out.println("O resultado da multiplicação é " + resultado);
                    break;
                case 5:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        System.out.println("Os números devem ser positivos e não maiores que 50.");
                    return;
                    }

                    float result = 1;
                    for (int i = 0; i < valor2; i++) {
                        result = result * valor1;
                    }

                    System.out.println("O resultado da potenciação é " + result);
                    break;
                case 6:
                    System.out.print("Digite o número para fatorar: ");
                    int numF = entrada.nextInt();
                    int i;

                    if (numF >= 0 && numF <= 50) {
                        int fatorial = 1;
                        for (i = 1; i <= numF; i++) {
                            fatorial *= i;
                        }
                        System.out.println("Resultado da fatoração: " + fatorial);
                    } else {
                        System.out.println(
                                "Números inválidos! Por favor, insira números não negativos e não maiores que 50.");
                    }

                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    System.out.println("Digite um valor válido");
                    break;
            }
        }

    }
}