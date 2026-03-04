package AEA3.entregar.figuras;

public class Trapezi extends Figura {

    private int a;
    private int b;
    private int altura;

    public Trapezi() {
        super("trapezi");
    }

    public Trapezi(int a, int b, int altura) {
        super("trapezi");
        this.a = a;
        this.b = b;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((a + b) * altura) / 2;
    }
}