public class Livro {
    public String titulo, autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String informacoes(String titulo, String autor, int anoPublicacao) {
        return "O titulo do livro é: " + this.titulo + ". O autor é: " + this.autor + ". O ano de lançamento é: "
                + this.anoPublicacao
                + ". O tempo de lançamento é de: " + tempoLancamento() + " anos ";
    }

    public int tempoLancamento() {
        return 2024 - this.anoPublicacao;
    }

}
