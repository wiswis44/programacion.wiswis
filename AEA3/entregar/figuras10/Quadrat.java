package AEA3.entregar.figuras10;

public class Quadrat extends Figura {

    private double costat;

    public Quadrat() {
        super("quadrat");
    }

    public Quadrat(double costat) {
        super("quadrat");
        this.costat = costat;
    }

    public void llegirDades() {
        costat = llegirDoublePositiu("Costat del quadrat:");
    }

    public double calcularArea() {
        return costat * costat;
    }
}