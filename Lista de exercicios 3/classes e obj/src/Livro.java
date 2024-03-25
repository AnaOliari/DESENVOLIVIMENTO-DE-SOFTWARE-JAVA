public class Livro {
  public String titulo, autor;
  public int anoPublicacao;

  public Livro(String titulo, String autor, int anoPublicacao) {
      this.titulo = titulo;
      this.autor = autor;
      this.anoPublicacao = anoPublicacao;
    }

   public String informacoes(String titulo, String autor, int anoPublicacao) {
      return "O titulo do livro é: " + this.titulo + " o autor é: " + this.autor + " o ano é: " + this.anoPublicacao;
    }
}
