package AEA3.entregar.figuras;
public class Figura {

    protected String figura;
    protected int id;
    private static int contador = 0;   // 🔹 contador global

    // Constructor básico
    public Figura() {
        contador++;
        this.id = contador;
    }

    // Constructor complejo
    public Figura(String figura) {
        contador++;
        this.id = contador;
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }

    public int getId() {
        return id;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public double calcularArea() {
        return 0;
    }

    public void imprimirDades() {
        System.out.println("La figura amb id " + id + " és un " + figura + ".");
        System.out.println("L'àrea del " + figura + " és: " + calcularArea());
        System.out.println("---------------");
    }
}