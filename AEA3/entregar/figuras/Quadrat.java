package AEA3.entregar.figuras;

public class Quadrat extends Figura {

    private int costat;

    public Quadrat() {
        super("quadrat");
    }

    public Quadrat(int costat) {
        super("quadrat");
        this.costat = costat;
    }

    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public double calcularArea() {
        return costat * costat;
    }
}
