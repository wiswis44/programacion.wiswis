import java.util.Scanner;

public class examen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0 ; 
//introducir el  tamaño : 
        System.out.print("ingrese la longitud de los vectores : ");
        while(true){
                if (sc.hasNextDouble()) {
                    longitud = sc.nextInt();
                    break ; 
                } else {
                    System.out.println(" ERROR . SOLO NUMEROS INTENTA DE NUEVO");
                    sc.next();
                }
            }
        
// los arrays 
        double[] array1 = new double[longitud]; 
        double[] array2 = new double[longitud];
        double[] suma = new double [longitud]; 
//introducir valores de los arrays :
        System.out.println("ingrese los elementos del primer vector : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Elemento "+ (i+1)+ " :");
            while(true){
                if (sc.hasNextDouble()) {
                    
                    array1 [i]= sc.nextDouble();
                    break ; 
                } else {
                    System.out.println(" ERROR . SOLO NUMEROS INTENTA DE NUEVO");
                    sc.next();
                }
            }
            
        }
        System.out.println("ingrese los elementos del primer vector : ");
        for (int i = 0; i < array2.length; i++) {
            while(true){
                System.out.print("Elemento "+ (i+1)+ " :");
                if (sc.hasNextDouble()) {
                    
                    array2 [i]= sc.nextDouble();
                    break ; 
                } else {
                    System.out.println(" ERROR . SOLO NUMEROS INTENTA DE NUEVO");
                    sc.next();
                }
            }
        }
//calcular : 
        for (int i = 0; i < suma.length; i++) {
            suma[i]= array1[i] +   array2[i] ; 
        }
//imprimir en el terminal  :
        System.out.println("la suma de  los vectores es :");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i]+ " ");
        }
        sc.close();
    }
}