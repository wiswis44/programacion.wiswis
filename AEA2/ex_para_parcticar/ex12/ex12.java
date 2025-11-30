package AEA2.ex_para_parcticar.ex12;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] cantidad_producto = new int [5][6] ;
        String [][] nombre_producto = new String [5][6];

//introducir los datos . 
        for (int i = 0; i < nombre_producto.length; i++) {
            for (int j = 0; j < nombre_producto[i].length; j++) {
                System.out.println("introduce cuantas unidades hay en el estante "+ (j+1)+ " del pasillo "+ (i+1)+" :");
                while(true){
                    if (sc.hasNextInt()){
                        cantidad_producto[i][j] = sc.nextInt() ;
                        if (cantidad_producto[i][j]>=0) break;
                        else System.out.println("¡ERROR! GHA NOMRAWATH SNJ I ZERO AYDI W FNTROS");
                    }else{
                        System.out.println("¡ERROR! SOLO NUMERO PORFAVOR .");
                        sc.next();
                    }
                }
                /* 
                sc.nextLine();
                System.out.println("introduce el nombre del producto que hay en el estante "+ (j+1)+ " del pasillo "+ (i+1)+" :");
                nombre_producto[i][j] = sc.nextLine().toLowerCase();*/
            }
        }

//analizar  : 
        int suma = 0 ;
        int mayor = cantidad_producto[0][0];
        int num_pasillo = 0 ;
        int num_estante = 0 ;
        int [] suma_estante =new int [5]  ;
        int moyenne ;
        
        for (int i = 0; i < cantidad_producto.length; i++) {
            suma_estante[i] = 0 ; 
            for (int j = 0; j < cantidad_producto[i].length; j++) {
                //sumar 
                suma = suma + cantidad_producto[i][j];
                //el estante mas mayor :
                if(cantidad_producto[i][j] > mayor ){
                    mayor = cantidad_producto[i][j] ; 
                    num_pasillo  = i + 1; 
                    num_estante  = j + 1;
                }
                //suma estante `
                suma_estante[i] = suma_estante[i] + cantidad_producto[i][j]; 
            }
        }
        moyenne = suma / (6*5);
        int min_sumaEstante =suma_estante[0]; 
        int num_MinSumaEstante =0; 
        for (int i = 0; i < suma_estante.length; i++) {
            if(min_sumaEstante>suma_estante[i]) { 
                min_sumaEstante = suma_estante[i];
                num_MinSumaEstante = i+ 1;
            }
        }



//inprimir datos : 

        System.out.println("el stock total es : "+ suma);
        System.out.println("el estante con mayor cantidad individual está en el pasillo "+num_pasillo+" estante "+ num_estante+" y con cantidad : "+ mayor );
        for (int i = 0; i < suma_estante.length; i++)   System.out.println("elstock total del pasillo numero "+ (i+1)+ "es : "+suma_estante[i]);
        System.out.println("el pasillo con menor stockes es"+num_MinSumaEstante+"con valor de" +min_sumaEstante);
        System.out.println("la promedia general es "+ moyenne);
        for (int i = 0; i < suma_estante.length; i++) {
            if (suma_estante[i]<(moyenne/2)) {
                System.out.println("el pasillo numero"+ (i+1)+"es una zona critica .");
            }
        }
        

        sc.close();
    }
}
/*
Enunciado
Un almacén está organizado en 5 pasillos y 6 estantes por pasillo.
Cada estante contiene:
Una cantidad de unidades de un producto.
El nombre del producto almacenado.
Se pide que desarrolles un programa en Java que haga lo siguiente:
1. Entrada de datos
                Solicita al usuario que introduzca la cantidad de unidades de cada estante.
                Deben guardarse en una matriz int[5][6].
                No se permiten valores negativos.
                Solicita al usuario que introduzca el nombre del producto de cada estante.
                Guardar en una matriz String[5][6].
2. Cálculos de inventario
        a) Calcular el stock total del almacén.
        b) Determinar el estante con mayor cantidad individual, indicando pasillo y estante.
        c) Calcular el stock total por pasillo y mostrar el pasillo con menor stock.
        d) Calcular el promedio general de existencias por estante.
     e) Bonus (opcional): Indicar si algún pasillo tiene un stock inferior al 50% del promedio y marcarlo como “zona crítica”. 
*/