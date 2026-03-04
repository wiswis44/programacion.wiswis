package AEA3.entregar.figuras;
public class Rombe extends Figura {

    private int dMajor;
    private int dMenor;

    public Rombe() {
        super("rombe");
    }

    public Rombe(int dMajor, int dMenor) {
        super("rombe");
        this.dMajor = dMajor;
        this.dMenor = dMenor;
    }

    public double calcularArea() {
        return (dMajor * dMenor) / 2.0;
    }
}