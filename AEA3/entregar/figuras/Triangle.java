package AEA3.entregar.figuras;

public class Triangle extends Figura {

    private int base;
    private int altura;

    public Triangle() {
        super("triangle");
    }

    public Triangle(int base, int altura) {
        super("triangle");
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
