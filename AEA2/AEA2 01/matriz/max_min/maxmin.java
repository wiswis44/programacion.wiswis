import java.util.Scanner; 
public class maxmin {
    public static void main(String[] args  ) {
        Scanner sc = new Scanner(System.in);

        int filas = 0 ; 
        int culumnas = 0 ;
        boolean validofil = false ;
        boolean validocul = false ;
//indicar LA capacidad de la matriz :
    //la de filas
        do{
            System.out.print("INTODUCE EL NUMERO DE FILAS :");
            if (sc.hasNextInt()){
                filas = sc.nextInt();

            }else{
                System.out.println("ERROR . intentalo de nuevo .");
                sc.next();
                continue ;
            }

            if ( filas >0){
                validofil = true ;
            }else{
                validofil = false ; 
                System.out.println("ERROR . valores positivos");
            }
        }while(!validofil);
    //la de columnas
        do{
            System.out.print("INTODUCE EL NUMERO DE CULUMNAS :");
            if (sc.hasNextInt()){
                culumnas= sc.nextInt();
            }else{
                System.out.println("ERROR . intentalo de nuevo .");
                sc.next();
                continue ;
            }

            if (culumnas > 0 ){
                validocul = true ;
            }else{
                validocul = false ; 
                System.out.println("ERROR . valores positivos ");
            }
        }while(!validocul);

        double[][] matriz = new double [filas][culumnas];

//introducir los numeros 
    for (int i=0 ; i <matriz.length ; i++){
        for  (int  j=0 ; j<matriz[i].length ; j++){
            System.out.println("valor "+ (j + 1)+" en la fila con numero de indice  "+ i + ": ");
            if(sc.hasNextDouble()){
            matriz [i][j] = sc.nextDouble();
            }else{
                System.out.println("ERROR .solo numeros porfa");
                sc.next();
                j--;
            }
        }
    }
    sc.close();

//los variables que utilizaré para comparar los valores :

    double max = matriz[0][0];
    double min = matriz[0][0];

// comparar :

    for (int i=0 ; i <matriz.length ; i++){
        for  (int  j=0 ; j<matriz[i].length ; j++){
            if(max < matriz[i][j]){
                max = matriz[i][j] ;
            }else if (min > matriz[i][j]){
                min = matriz[i][j] ;
            }
        }
    }
//mostrar por pantalla : 
    System.out.println("el numero más grande es " + max);
    System.out.println("el numero más pequeño es " + min );

    }
}