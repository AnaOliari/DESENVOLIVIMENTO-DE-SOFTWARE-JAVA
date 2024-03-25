public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 1");

        Pessoa p = new Pessoa("Ana Carolina", 19);
        p.exibirInfo();

        System.out.println("Exercicio 2");

        Livro livro1 = new Livro("Crepusculo", "Amanda", 2010);

        Livro livrobom = new Livro("Herry Potter", "Tiago", 2000);

        System.out.println(livro1.informacoes(null, null, 0));
        System.out.println(livrobom.informacoes(null, null, 0));

        System.out.println("Exercicio 3");
        Conta conta1 = new Conta("Tiago", 123);
        conta1.depositar(10);
        System.out.println(conta1.imprimir());
        conta1.depositar(50);
        System.out.println(conta1.imprimir());

        if (conta1.sacar(30)) {
            System.out.println("Saque realizado com sucasso");
            System.out.println(conta1.imprimir());
        } else {
            System.out.println("saldo insuficiente");
            System.out.println(conta1.imprimir());
        }
        System.out.println("Exercico 4");

        Triangulo triangulo = new Triangulo(10, 10);
        System.out.println("A area do triangulo é: " + triangulo.area());

        System.out.println("Esercicio 5");

        Cafeteira oster = new Cafeteira();

        oster.encherCafe(14);
        oster.encherAgua(30);
        oster.ligar();

        System.out.println(oster.status() + "\n");


        if(oster.fazerCafe()){
            System.out.println("Café pronto!");
            System.out.println(oster.status() + "\n");
        }else{
            System.out.println("Não foi possível fazer o café! :(");
            System.out.println(oster.status() + "\n");
        }

        if(oster.fazerCafe()){
            System.out.println("Café pronto!");
            System.out.println(oster.status() + "\n");
        }else{
            System.out.println("Não foi possível fazer o café! :(");
            System.out.println(oster.status() + "\n");
        }
    }

}
