package AEA3.entregar.figuras10;

public class Triangle extends Figura {

    private double base;
    private double altura;

    public Triangle() {
        super("triangle");
    }

    public Triangle(double base, double altura) {
        super("triangle");
        this.base = base;
        this.altura = altura;
    }

    public void llegirDades() {
        base = llegirDoublePositiu("Base del triangle:");
        altura = llegirDoublePositiu("Altura del triangle:");
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}