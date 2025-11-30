import java.util.Scanner;
public class moyenne {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in) ;
        int numero = 0 ;
        double suma = 0 ;

        System.out.print(" ¿ Cuántas notas quieres introducir ? : ") ;
            if (sc.hasNextInt()) { 
                numero = sc.nextInt();
            } else {
                System.out.println("ERROR: Debes introducir un número entero.");
                return; 
            }
    

        double[] notas = new double [numero] ;
        
        for (int i= 0 ; i < notas.length  ; i++) { 
        System.out.println("intruduce la nota "+ (i+1) ) ;
            
            if ( sc.hasNextDouble()) {
                double nota = sc.nextDouble() ;
                notas [i] = nota ;
                suma = suma + notas [i] ;
            } else {
                System.out.println("ERROR : SOLO INTRODUCE NÚMEROS ") ;
                sc.next() ;
                i-- ;
            }
        }
        double media = suma / numero ; 
        System.out.println(" La nota final es: " + media ) ;
    }
}