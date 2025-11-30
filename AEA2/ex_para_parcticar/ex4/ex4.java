package AEA2.ex_para_parcticar.ex4;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args  ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas partidas hay : ");
        int     num_partida = sc.nextInt();
        int []  goles = new int[ num_partida ];
        int     suma =0      ;
        double  moyenne      ;
        int     Npartida =0  ;

        for( int i=0 ;i< goles.length; i++ ){
            System.out.print("cuantos goles hay en la partida "+ (i+1) +" : ");
            if (sc.hasNextInt()){
                goles [i] = sc.nextInt();
                if (goles[i]>=0){
                    suma = suma + goles[i];
                }else{
                    System.out.println("ERROR . SOLO NUMEROS POSITIVOS");
                    i--;
                }
            }else{
                System.out.println("¡ERROR! SOLO NUMEROS");
                sc.next();
                i--;
            }
        }
        moyenne = (double)suma / (double)num_partida ;
//clacular la partida con mas goles .
        int plusgrand = goles[0];

        for(int i=0 ;i< goles.length; i++ ){
            if (goles[i]>plusgrand){
                plusgrand = goles[i];
                Npartida = i+1 ;
            }
        }

        System.out.println("el numero total de las goles : "+ suma);
        System.out.println("la promedia" + moyenne);
        System.out.println("la partida con mas goles es la partida "+Npartida+"con "+ plusgrand + "goles" );
        sc.close();
    }
}

/*
4. Marcador de goles :
Registra goles de 12 partidos: 
usar un array para guardar el numero de goles en cada partida  
y calcula total, promedio y el partido con más goles.
con condicionales dentro del boocle .
al final imprimir todo con souts .
*/