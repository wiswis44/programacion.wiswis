package AEA3.entregar.hotel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Allotjament[] allotjaments = new Allotjament[5];

        allotjaments[0] = new Habitacio("Habitació 101",3,3);
        allotjaments[1] = new Apartament("Apartament Blue",4,2,true);
        allotjaments[2] = new CasaRural("Masia Verda",6,true,false);
        allotjaments[3] = new Habitacio("Habitació 202",1,1);
        allotjaments[4] = new CasaRural("Can Soler",5,true,true);

        int opcio = 0;

        while (opcio != 4) {

            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");

            opcio = sc.nextInt();
            sc.nextLine();

            if (opcio == 1) {

                for (int i = 0; i < allotjaments.length; i++) {

                    if (allotjaments[i].isDisponible()) {

                        System.out.println(allotjaments[i].mostrarInformacio());
                    }
                }
            }

            if (opcio == 2) {

                System.out.println("Introdueix el nom de l'allotjament:");
                String nom = sc.nextLine();

                for (int i = 0; i < allotjaments.length; i++) {

                    if (allotjaments[i].getNom().equalsIgnoreCase(nom)) {

                        if (allotjaments[i].reservar()) {
                            System.out.println("Reservat correctament.");
                        } else {
                            System.out.println("No disponible.");
                        }
                        
                    }
                }
            }

            if (opcio == 3) {

                System.out.println("Introdueix el nom de l'allotjament:");
                String nom = sc.nextLine();

                for (int i = 0; i < allotjaments.length; i++) {

                    if (allotjaments[i].getNom().equalsIgnoreCase(nom)) {

                        allotjaments[i].alliberar();
                        System.out.println("Alliberat correctament.");
                    }
                }
            }
        }
    }
}
