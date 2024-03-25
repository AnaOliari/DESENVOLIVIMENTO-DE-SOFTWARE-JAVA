public class Triangulo {
  public float base, altura;

  public Triangulo(float base, float altura) {
        this.altura = altura;
        this.base = base;
    }

  public float area() {
        return ((this.base * this.altura) / 2);
    }
}
