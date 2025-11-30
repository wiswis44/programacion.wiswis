import java.util.Scanner;
public class ex3 {
    public static void main(String[] args  ) {
        Scanner sc = new Scanner(System.in);
        int numero = 15 ;
        int suma = 0 ;
        int poco = 0 ;

        int [] productos = new int [numero];
        System.out.println("indica cuantas unidades hay en cada producto  ");
        for (int  i =0 ;i < productos.length ; i++){
            System.out.println("cuantas unidades hay en el producto" + (i+1) +" :");
            if (sc.hasNextInt()){
                productos[i] = sc.nextInt();
                if (productos[i] >= 0){
                    suma = suma + productos[i];
                    if (productos[i]<5){
                        poco++;
                    }
                } else {
                    System.out.println("¡ERROR! numeros positivos !!!!!!!!!");
                    i--;
                }
            } else { 
                    System.out.println("¡ERROR! SOLO NUMEROS TONTO ");
                    sc.next();
                    --i;
            }
        }

        sc.close();

        System.out.println("TOTAL : " + suma);
        System.out.println("Productos tienen menos de 5 unidades : "+ poco );
    }
}
/*
Registra existencias de 15 productos y muestra stock total y cuántos tienen menos de 5 unidades.
*/