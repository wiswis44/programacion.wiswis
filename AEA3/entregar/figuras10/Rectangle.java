package AEA3.entregar.figuras10;

public class Rectangle extends Figura {

    private double costat1;
    private double costat2;

    public Rectangle() {
        super("rectangle");
    }

    public Rectangle(double c1, double c2) {
        super("rectangle");
        this.costat1 = c1;
        this.costat2 = c2;
    }

    public void llegirDades() {
        costat1 = llegirDoublePositiu("Costat 1:");
        costat2 = llegirDoublePositiu("Costat 2:");
    }

    public double calcularArea() {
        return costat1 * costat2;
    }
}