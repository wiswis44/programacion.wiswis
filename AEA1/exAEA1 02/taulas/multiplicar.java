import java.util.Scanner;

public class multiplicar {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("¿Hasta qué tabla de multiplicar quieres conocer? ");
        
            int taula = sc.nextInt(); 

            for (int i = 1; i <= taula; i++) {
                System.out.println("La tabla del " + i);

                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
           
    }
}



//int taula = sc.nextInt();

//for ( i=1 ; i=<taula; i++) { 
//
//}