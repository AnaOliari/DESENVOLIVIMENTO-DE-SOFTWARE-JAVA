public class App {
    public static void main(String[] args) throws Exception {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        meuCarro.exibirInformacoes();
        meuCarro.acelerar(50);
        meuCarro.frear(10);
        meuCarro.exibirInformacoes();
        meuCarro.acelerar(100);
        meuCarro.frear(20);
        meuCarro.exibirInformacoes();
        meuCarro.frear(120);
        meuCarro.exibirInformacoes();


    }
}
