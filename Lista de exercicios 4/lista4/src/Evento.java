public class Evento {
  private String nome;
  private String dataHora;
  private float precoIngresso;
  private int quantIngresso;
  private int quantIngressoVendido;

  public Evento(String nome, String dataHora, float precoIngresso,int quantIngresso ){
    this.nome = nome;
    this.dataHora = dataHora;
    this.precoIngresso = precoIngresso;
    this.quantIngresso = quantIngresso;
    this.quantIngressoVendido = 0;
  }

  public void descricao(){
    System.out.println("O nome do evento é: "+ this.nome + "\nA data e o horario é: " + this.dataHora + "\nO preço do ingresso é: "+ this.precoIngresso + "\nA quantidade de ingressos é: " + this.quantIngresso + "\nForam vendidos " + this.quantIngressoVendido + " ingressos." + "\nA arrecadação é de: "+ verArrecadacao());
  }

  public String venderIngresso(int quantidade){
    if (this.quantIngresso >= quantidade) {
      this.quantIngresso -= quantidade;
      this.quantIngressoVendido += quantidade;
      return "Vendido";
    }else{
      return "Não à ingressos disponiveis";
    }
  }

  public double verArrecadacao(){
    return this.quantIngressoVendido * this.precoIngresso;
  }

}
