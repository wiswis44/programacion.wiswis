package AEA3.entregar.figuras10;

public class Rombe extends Figura {

    private double dMajor, dMenor;

    public Rombe() {
        super("rombe");
    }

    public Rombe(double dMajor, double dMenor) {
        super("rombe");
        this.dMajor = dMajor;
        this.dMenor = dMenor;
    }

    public void llegirDades() {
        dMajor = llegirDoublePositiu("Diagonal major:");
        dMenor = llegirDoublePositiu("Diagonal menor:");
    }

    public double calcularArea() {
        return (dMajor * dMenor) / 2;
    }
}