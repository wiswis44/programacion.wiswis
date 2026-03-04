package AEA3.entregar.figuras;

public class Parallelogram extends Figura {

    private int base;
    private int altura;

    public Parallelogram() {
        super("parallelogram");
    }

    public Parallelogram(int base, int altura) {
        super("parallelogram");
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
