public class ContaBancaria {
  private String nome;
  private int numConta;
  private double saldo;

  public ContaBancaria(String nome, int numConta, double saldo){
    this.nome = nome;
    this.numConta = numConta;
    this.saldo = 0;
  }

  public int getNumConta(){
    return numConta;
  }

  public void setNumConta(int numConta){
    this.numConta = numConta;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public boolean sacar(double valor){
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }else {
      return false;
    }
  }

  public void depositar(double valor){
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public String imprimir(){
    return "O saldo é de: "+ this.saldo;
  }
}
