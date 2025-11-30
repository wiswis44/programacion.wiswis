package AEA2.ex_para_parcticar.ex2;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args  ) {
    Scanner sc = new Scanner (System.in);
    int numclientes ;
    int valmax = 0 ;
    int valmin = 0 ; 
    double suma = 0 ;


    System.out.println("¿ cuantas valoraciones vaís a introducir ? :");

    numclientes =sc.nextInt();
    double [] valoraciones = new double[numclientes] ;

    for(int i=0 ; i< valoraciones.length ; i++){
        System.out.print("introduce la valoracion del cliente "+(i+1)+ ":");

        if(sc.hasNextDouble()){
            valoraciones[i] = sc.nextDouble();
            if(valoraciones[i]< 0 || valoraciones[i]>5 ){
                System.out.println("ERROR. SOLO NUMEROS ENTRE 0 Y 5");
                i--;
            }
            else{
                suma = suma + valoraciones[i]; 
                //cuántos dieron un 5 y cuántos dieron menos de 3
                if(valoraciones[i]==5){
                    valmax = valmax + 1 ;
                }
                if(valoraciones[i]< 3){
                    valmin = valmin + 1 ;
                }
            }
        }else{
            System.out.println("ERROR . SOLO NUMEROS ");
            --i;
        }
    }
    
    double moyenne = suma / numclientes ;

    System.out.println("valoracion 5 : "+ valmax);
    System.out.println("valoracion menos de 3 : "+ valmin);
    System.out.println("la promedia de las clientes : "+ moyenne);
sc.close();
    }
}
/*
Recoge las valoraciones (de 1 a 5) de 20 clientes y calcula el promedio, cuántos dieron un 5 y cuántos dieron menos de 3
*/