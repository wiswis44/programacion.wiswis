package AEA3.entregar.figuras10;
import java.util.Scanner;

public class Figura {

    private String figura;
    private int id;
    private static int contador = 0;

    protected static Scanner sc = new Scanner(System.in);

    public Figura() {
        contador++;
        this.id = contador;
    }

    public Figura(String figura) {
        this();
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public static int seguentFigura() {
        return contador + 1;
    }

    
    protected double llegirDoublePositiu(String missatge) {
        double valor = -1;
        while (valor <= 0) {
            System.out.println(missatge);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor <= 0) System.out.println("Error: El valor ha de ser positiu.");
            } else {
                System.out.println("Error: Introdueix un número vàlid.");
                sc.next(); 
            }
        }
        return valor;
    }

    public void llegirDades() {
    }

    public double calcularArea() {
        return 0;
    }

    public void imprimirDades() {
        System.out.println("Figura ID: " + getId());
        System.out.println("Tipus: " + getFigura());
        System.out.println("Àrea: " + calcularArea());
        System.out.println("----------------------");
    }
}