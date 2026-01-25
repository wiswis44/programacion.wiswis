package AEA3.entregar.maxmin;

import java.util.Scanner;

public class EntradaValors {
    public static double[] LeerValores(Scanner sc) {
        double[] valors = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introdueix el valor " + (i + 1) + ": ");
            valors[i] = sc.nextDouble();
        }
        System.out.println("");

        return valors;
    }
}
