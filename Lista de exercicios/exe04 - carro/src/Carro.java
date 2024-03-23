public class Carro {
  private String marca, modelo ; 
  private int ano; 
  private float velocidade;

  public Carro(String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.velocidade = 0;
  }

  public void acelerar(int incremento){
    if (incremento < 0 ) {
      System.out.println("O incremento deve ser positivo");
      return;
    }
    this.velocidade += incremento;
  }

  public void frear(int decremento){
    if (decremento < 0){
      System.out.println("O incremento deve ser positivo");
    }
    this.velocidade -= decremento;
    if (this.velocidade < 0) {
      this.velocidade = 0;
      
    }
  }

  public void exibirInformacoes(){
    System.out.println("A marca do carro é: "+ this.marca + ". O modelo do carro é: "+ this.modelo + ". O ano do carro é: " + this.ano + ". A velocidade é de: "+ this.velocidade +  " km. O carro está " + (this.velocidade > 0? "ligado " : "desligado") );
  }

  public boolean estaAndando(){
    return this.velocidade > 0;
  }


}
