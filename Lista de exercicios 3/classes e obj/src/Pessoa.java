public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public void exibirInfo(){
    System.out.println("O nome é " + nome + " e a idade é: " + idade );
  }
}

