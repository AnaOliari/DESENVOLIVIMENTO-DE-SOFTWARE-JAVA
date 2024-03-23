import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Crepusculo", "Stephenie Meyer", 2010);

        Livro livrobom = new Livro("Herry Potter", "Tiago montanhes", 2000);

        System.out.println(livro1.informacoes(null, null, 0));
        System.out.println(livrobom.informacoes(null, null, 0));
    }
}