import java.util.Scanner;
class multi3 {
   public static void main(String[] args) {

      System.out.print("Indica hasta qué valor quieres sumar múltiplos de 3? ");
      Scanner limite = new Scanner(System.in);
      int n = limite.nextInt();
      int SUMA = 0 ;

      if (n < 0) {
            System.out.println("introduce un número positivo. Por favor. ");  
      }
      else{
            int i = 0;
            while (i * 3 <= n) {
                int multiplo = i * 3;
                System.out.println("Añadimos " + multiplo + "...");
                SUMA  =  SUMA +  multiplo;
                i++;
         }
         System.out.println( "El resultado final es " + SUMA + ".");
      }
   }
}