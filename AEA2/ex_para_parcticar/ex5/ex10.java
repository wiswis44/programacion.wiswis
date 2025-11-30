package AEA2.ex_para_parcticar.ex5;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args  ) {
        Scanner sc = new Scanner(System.in);
        double [] cons_mes =new double[30] ;
        double suma = 0;
        double moyenne ;

            for(int i=0 ;i<cons_mes.length; i++){
                System.out.print("introduce el consumo del dia "+ (i+1)+" :");
                while(!sc.hasNextInt()){
                    System.out.print("ERROR ! solo numeros porfavor . \nintroduce el consumo del dia "+ (i+1)+" :");
                    sc.next();
                }
                cons_mes[i] = sc.nextDouble();
                suma = suma + cons_mes[i];
            }

        moyenne = suma / 30 ;
        int igual =0 ;
        int debajo =0 ;
        int encima =0 ;
        double max = cons_mes[0];
        double min = cons_mes[0];
        int Nmax = 0 ;
        int Nmin = 0 ;

            for (int i = 0; i < cons_mes.length; i++) {
            //consumo /media
                if (cons_mes[i]>moyenne) encima ++ ;
                else if (cons_mes[i]<moyenne) debajo++ ;
                else if (cons_mes[i]==moyenne) igual++ ;
            //
                if (max < cons_mes[i]) {
                    max = cons_mes[i] ;
                    Nmax = i+1 ;
                } else if(min > cons_mes[i]) {
                    min = cons_mes[i] ;
                    Nmin = i+1 ; 
                }
            }
            //1. comprobar si es superior a 50 
            int racha_maxima =0 ;
            int racha_actual =0 ;
            for (int i = 0; i < cons_mes.length; i++) {
                if (cons_mes[i] > 50) {
                        racha_actual++;
                    if (racha_actual> racha_maxima) {
                        racha_maxima++;
                    } 
                } else { 
                    racha_actual = 0 ; 
                }
            }

        System.out.println("la media diaria del consumo es "+ moyenne +"kWh/dia");
        System.out.println("las dias que estuvieron debajo de la media : " + debajo );
        System.out.println("las dias que estuvieron igual a la media : "   + igual);
        System.out.println("las dias que estuvieron encima de la media : " + encima);
        System.out.println("el día con el mayor consumo es "+ Nmax +"con una cantidad de " + max + " kWh .");
        System.out.println("el dia con el menor consumo es "+ Nmin +"con una cantidad de " + min + " kWh ." );
        System.out.println("la racha más larga de días consecutivos donde el consumo fue mayor de 50 kWh es : "+ racha_maxima );
        sc.close();
    }
}

/* 
🔧 Ejercicio 10 — Versión mejorada 
Consumo energético mensual avanzado

Un edificio registra su consumo eléctrico diario durante 30 días.
Debes pedir al usuario que introduzca el consumo de cada día (en kWh) y realizar lo siguiente:

        Mostrar el consumo total del mes.
    guardar en un array usando un boocle 

        Calcular la media diaria de consumo.
    sera fuera del boocle

Mostrar cuántos días estuvieron:
        con unos condiciones dentro de la condicion . 
por debajo de la media,

por encima de la media,

exactamente igual a la media.

    Indicar el día con el mayor consumo y el día con el menor consumo.
(IMPORTANTE: Los días deben mostrarse como 1 a 30, no como índices del array.)

BONUS (parte difícil):
Detectar la racha más larga de días consecutivos donde el consumo fue mayor de 50 kWh.
(Si no hubo rachas, mostrar 0).
*/

