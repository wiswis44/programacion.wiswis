package AEA2.EXAMENES.examen2 ;
import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0 ; 
// introducir el tamaño  de vectore : 
        System.out.print("ingrese la longitud del vectore : ");
        while(true){
                if (sc.hasNextDouble()) {
                    longitud = sc.nextInt();
                    break ;
                } else {
                    System.out.print("ERROR . SOLO NUMEROS INTENTA DE NUEVO :");
                    sc.next();
                }
            }
        double[] array = new double[longitud];

        System.out.println("ingrese los elementos del vector : ");
        for (int i = 0; i < array.length; i++) {
            while(true){
                System.out.print("Elemento "+ (i+1)+ " :");
                if (sc.hasNextDouble()) {
                    array [i]= sc.nextDouble();
                    break ; 
                } else {
                    System.out.print(" ERROR . SOLO NUMEROS INTENTA DE NUEVO :");
                    sc.next();
                }
            }
        }

        double encontrar=0;
        boolean valido = true;
        while(valido ){
                System.out.print("ingrese el valor a buscar :");
                if (sc.hasNextDouble()) {
                    encontrar = sc.nextDouble(); 
                    break;
                } else {
                    System.out.print(" ERROR . SOLO NUMEROS INTENTA DE NUEVO :");
                    sc.next();
                }
        }

        boolean no = true ;
        for (int i = 0; i < array.length; i++) {
            if (encontrar == array[i]){
                System.out.println("el valor  "+encontrar+" se encontra en el elemento "+ (i+1));
                no = false;
                break ;
            }
        }
        if (no) {
            System.out.println("el valor "+ encontrar+" no está en el vector ." );
        }
        
        sc.close();
    }
}
