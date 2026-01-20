package AEA3.entregar.CalculoAreas;

import java.util.Scanner;

public class CalculArees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //demander
        System.out.println("De quina figura vols calcular l'area?");
        System.out.println(">>>triangle--quadrat--rectangle--trapezi--rombo--paralelogram--cercle<<<");
        String figura = sc.nextLine().toLowerCase();
        //appeler
        double area = GestioFigures.calcular(figura, sc);
        //controler s'il y a une faute 
            if (area == -1) {
                System.out.println("Figura no vàlida");
            } else {
                System.out.println("L'area del " + figura + " es " + area);
            }
    }
}