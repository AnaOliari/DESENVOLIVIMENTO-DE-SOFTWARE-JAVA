import java.time.LocalDate;

public class Reserva {
  private String nome;
  private int numPessoas;
  private LocalDate dataReserva;
  private double valor;


  public Reserva(String nome, int numPessoas, LocalDate dataReserva, double valor){
    this.nome = nome;
    this.numPessoas = numPessoas;
    this.dataReserva = dataReserva;
    this.valor = valor;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getNumPessoas(){
    return numPessoas;
  }

  public void setNumPessoas( int numPessoas){
    this.numPessoas = numPessoas;
  }

  public LocalDate getDataReserva(){
    return dataReserva;
  }

  public void setDataReserva(LocalDate dataReserva){
    this.dataReserva = dataReserva;
  }

  public double calcularValorTotal(){
    return this.numPessoas * this.valor;
  }

  public void exibirReserva(){
    System.out.println( "O nome do cliente é: "+ this.nome + "\nA quantidade de pessoas na reserva é: " +  this.numPessoas + "\nA data da reserva é no dia: " + this.dataReserva);  
    System.out.println("O valor total da reserva é de: " + this.calcularValorTotal());
  }



}
