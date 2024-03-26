import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 1");
        ContaBancaria conta = new ContaBancaria("Ana", 123, 100.0);

        System.out.println("Numero da conta: "+ conta.getNumConta());
        System.out.println("Nome do titular: " + conta.getNome());
        System.out.println("Saldo atual: R$ "+ conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo após deposito: R$ "+ conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo após o saque: R$ "+ conta.getSaldo());

        conta.sacar(1500.0);

        System.out.println("Exercicio 2");
        Reserva reserva1 = new Reserva("Ana", 4, LocalDate.of(2024,05,29), 50.0);
        reserva1.exibirReserva();

        System.out.println("Exercicio 3");
        Evento evento = new Evento("Show", "21/12/2004 as 19:00", 20.5f,90);

        evento.descricao();

        evento.venderIngresso(55);

        System.out.println("Após os ingressos vendidos: ");
        evento.descricao();        
        

    }
}
