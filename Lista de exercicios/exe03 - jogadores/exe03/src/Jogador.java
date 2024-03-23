public class Jogador {
    private String nome;
    private float pontuacao;
    private int numBatalhas, nivel;

    public Jogador(String nome, float pontuacao, int numBatalhas, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numBatalhas = numBatalhas;
        this.nivel = nivel;
    }

    public void atualizarPonto(float pontuacao) {
        this.pontuacao = +pontuacao;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("O nome do jogador é: " + this.nome + ". A pontuação do jogador é: " + this.pontuacao
                + ". O numero de batalhas é: " + this.numBatalhas + ". O nivel é: " + this.nivel);
    }

    public int compareTo(Jogador outroJogador) {
        if (this.nivel != outroJogador.nivel) {
            return Integer.compare(this.nivel, outroJogador.nivel);
        } else {
            return Integer.compare(this.numBatalhas, outroJogador.numBatalhas);
        }
    }

}
