import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int vetorInteiro[] = new int[5];
        float vetorFloat[] = new float[5];
        int fatorial, ddd, telefone;
        String nome, sobrenome;


        System.out.println("Exercicio 1");
        System.out.println("O valor de pi é: " + pi());

        System.out.println("Exercicio 2");
        System.out.println("Digite um numero inteiro: ");
        int num = entrada.nextInt();
        System.out.println("O fatorial dele é: " + fatorial(num));

        System.out.println("Exercico 3");
        for(int i = 0; i < vetorInteiro.length; i++){
            System.out.println("Digite o " + (i+1) );
            vetorInteiro[i] = entrada.nextInt();
        }
        System.out.println("O maior numero é: " + maiorValor(vetorInteiro));

        System.out.println("Exercício 4");

        for(int i = 0; i < vetorFloat.length; i++){
            System.out.println("Digite o " + (i + 1) + "º ");
            vetorFloat[i] = entrada.nextFloat();
        }

        System.out.println("A soma do vetor é " + somaVetor(vetorFloat));

        System.out.println("Exercício 5");
            System.out.println("Digine o nome");
            entrada.nextLine();
            nome = entrada.nextLine();
            System.out.println("Digite o sobrenome");
            sobrenome = entrada.nextLine();
            System.out.println("Digite o DDD");
            ddd = entrada.nextInt();
            System.out.println("Digite o teleone");
            telefone = entrada.nextInt();

            System.out.println(dadosCliente(nome, sobrenome, ddd, telefone));

        
    }
    public static float pi(){
        return 3.14f;
    }

    public static int fatorial(int i){
        int resultado = i;
        for(i = i - 1; i > 1; i--){
            resultado *= i;
        }
        return resultado;
    }

    public static int maiorValor(int[] vetor){
        int resultado = vetor[0];
        for (int i : vetor) {
            if (i > resultado) {
                resultado = i;
            }
        }
            return resultado;
        }
        public static float somaVetor(float[] vetor){
            float res = 0;
    
            for (float v : vetor) {
                res += v;
            }
    
            return res;
        }
    
        public static String dadosCliente(String nome, String sobrenome, int ddd, int telefone){
    
            return 
                "Nome: " + nome +
                "\nSobrenome: " + sobrenome + 
                "\nDDD: " + ddd +
                "\nTelefone: " + telefone
            ;
    
        }

}
