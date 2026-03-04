package AEA3.entregar.figuras10;

public class Parallelogram extends Figura {

    private double base, altura;

    public Parallelogram() {
        super("parallelogram");
    }

    public Parallelogram(double base, double altura) {
        super("parallelogram");
        this.base = base;
        this.altura = altura;
    }

    public void llegirDades() {
        base = llegirDoublePositiu("Base:");
        altura = llegirDoublePositiu("Altura:");
    }

    public double calcularArea() {
        return base * altura;
    }
}