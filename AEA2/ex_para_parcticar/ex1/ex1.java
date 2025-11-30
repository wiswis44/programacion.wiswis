import java.util.Scanner;

public class ex1 {
    public static void main(String[] args  ) {
    Scanner sc = new Scanner(System.in);
        double[] temperatura = new double [7];

        for (int i=0 ; i < temperatura.length ; i++){
            System.out.print("la temparatura en el día "+ (i+1) + " es : ");
            temperatura [i] = sc.nextDouble();
        }
            double max = temperatura [0]; 
            double min = temperatura [0];

        for(int i=0 ; i < temperatura.length ; i++){
            if(max < temperatura [i]){
                max = temperatura [i] ;
            }
            if (min > temperatura [i]) {
                min = temperatura [i] ;
            }
        }
        sc.close();
        System.out.println("la temperatura mas alta es"+ max);
        System.out.println("la temperatura mas baja es"+ min);
    }
}
/*
Guarda las temperaturas máximas de 7 días y calcula la media,
la temperatura más alta, la temperatura más baja y el día en que ocurrieron.
*/