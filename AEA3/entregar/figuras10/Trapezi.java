package AEA3.entregar.figuras10;

public class Trapezi extends Figura {

    private double a, b, altura;

    public Trapezi() {
        super("trapezi");
    }

    public Trapezi(double a, double b, double altura) {
        super("trapezi");
        this.a = a;
        this.b = b;
        this.altura = altura;
    }

    public void llegirDades() {
        a = llegirDoublePositiu("Base major:");
        b = llegirDoublePositiu("Base menor:");
        altura = llegirDoublePositiu("Altura:");
    }

    public double calcularArea() {
        return ((a + b) * altura) / 2;
    }
}