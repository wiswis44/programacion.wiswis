package AEA3.entregar.maxmin;
import java.util.Scanner ;

public class maxmin {
    public static void main(String[] args) {
        maxmin programa = new maxmin();
        programa.inicio();
    }
    public void inicio() {
        Scanner sc = new Scanner(System.in);

        double[] valors = EntradaValors.LeerValores(sc);

        double max = CalculMAX.calculaMax(valors);
        double min = calculMIN.calculaMin(valors);
        double mitjana = calculMedia.calculaMitjana(valors);

        System.out.println("Nota maxima: " + max);
        System.out.println("Nota minima: " + min);
        System.out.println("media : " + mitjana);

        sc.close();
    }
}
