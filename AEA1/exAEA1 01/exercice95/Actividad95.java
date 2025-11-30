import java.util.Scanner;

public class Actividad95 {
   public static void main(String[] args) {
      System.out.print("Introduce el precio del producto: ");

      Scanner sc = new Scanner(System.in);
      double precio = sc.nextDouble();

      if (precio >= 95) {
         System.out.println("Se ha aplicado el descuento.");
         System.out.println("El precio final es: " + (precio - (precio * 0.15)) + " EUR");
      } else {
               System.out.println("No se ha aplicado el descuento.");
               System.out.println("el pricio final es:" + pricio + " EUR");
      }
     
      }
      }
          
      
      
	}
}