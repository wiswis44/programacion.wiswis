import java.util.Scanner;
public class matriz {
    public static void main(String[] args  ) {
    Scanner sc = new Scanner(System.in);
    boolean valido = true ;
    boolean validocul = true ;
    int filas = 0 ;
    int culumnas = 0 ; 

// indiquer le nombre de "filas""culumnas" :
    while (valido ){
        System.out.print("cuantas filas quieres :");
        if(sc.hasNextInt()){
            filas = sc.nextInt();
            valido = false ;
                if(filas<0){
                    System.out.println("ERROR .solo numeros positivos .");
                    valido = true ;
                }
        }else{
            System.out.println("ERROR intenta de nuevo .");
            sc.next();
        }
    }

    do{
        System.out.print("cuantas  columnas quieres :");
        if (sc.hasNextInt()){
            culumnas = sc.nextInt();
            if(culumnas < 0){
                System.out.println("ERROR . solo numeros positivos .");
                continue ;
            }else{
                validocul = false;
            }
        }else{
            System.out.println("ERROR . solo numeros interos");
            sc.next();
        }
    } while (validocul);

        double [][] matriz = new double [filas][culumnas]; 
//remplir

    for (int i=0 ; i <matriz.length ; i++){
        for  (int  j=0 ; j<matriz[i].length ; j++){
            System.out.println("valor "+ (j + 1)+" en la fila con numero de indice  "+ i + ": ");
            if(sc.hasNextDouble()){
                matriz [i][j] = sc.nextDouble();
            }else{
                System.out.println("ERROR SOLO NUMEROS . INTENTALO DE NUEVO !");
                sc.next();
                --j;
            }
        }
    }
sc.close();

//changer
System.out.println("la mtrice  despues de los cambios : ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if(i %  2 == 0   && j %  2 == 0){
                    matriz [i] [j] = 1;
                }
                else if(i %  2 == 0 && j %  2 != 0) {
                    matriz [i] [j] = 2;
                }
                else if(i %  2 != 0 && j %  2 == 0){
                    matriz [i] [j] = 3;
                }
                else if(i %  2 != 0  && j %  2 != 0){
                    matriz [i] [j] = 4;
                }
            System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        }
    }
}