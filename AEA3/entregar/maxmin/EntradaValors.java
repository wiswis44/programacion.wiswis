package AEA3.entregar.maxmin;

import java.util.Scanner;

public class EntradaValors {
    public static double[] LeerValores(Scanner sc) {
        double[] valors = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introdueix el valor " + (i + 1) + ": ");
            if(sc.hasNextDouble()){
                valors[i] = sc.nextDouble();
            }else{
                System.out.println("ERROR ");
                sc.next(); 
                i--;
            }
        }
        System.out.println("");

        return valors;
    }
}
