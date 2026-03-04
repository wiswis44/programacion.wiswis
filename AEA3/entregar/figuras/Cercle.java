package AEA3.entregar.figuras10;


public class Cercle extends Figura {

    private int radi;

    public Cercle() {
        super("cercle");
    }

    public Cercle(int radi) {
        super("cercle");
        this.radi = radi;
    }

    public double calcularArea() {
        return Math.PI * radi * radi;
    }
}