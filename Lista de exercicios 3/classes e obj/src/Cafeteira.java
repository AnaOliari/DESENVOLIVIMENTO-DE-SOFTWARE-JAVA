public class Cafeteira {
    public boolean ligado;
    public int qtdeCafe, qtdeAgua;

    public Cafeteira() {
        this.ligado = false;
        this.qtdeCafe = 0;
        this.qtdeAgua = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void encherCafe(int cafe) {
        if (cafe >= 0) {
            this.qtdeCafe += cafe;
        }
    }

    public void encherAgua(int agua) {
        if (agua > 0) {
            this.qtdeAgua += agua;
        }
    }

    public String status() {
        return "A cafeteira esta ligada? " + this.ligado + "\n A quantidade de cafe é: " + this.qtdeCafe + " gramas "
                + "\n A quantidade de agua é " + this.qtdeAgua + " ml";
    }

    public boolean fazerCafe() {
        if (this.qtdeCafe >= 7 && this.qtdeAgua >= 30 && this.ligado) {
            this.qtdeAgua -= 30;
            this.qtdeCafe -= 7;
            return true;
        }
        return false;
    }
}
