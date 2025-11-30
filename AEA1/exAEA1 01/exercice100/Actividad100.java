import java.util.Scanner;

class Actividad100 {
	public static void main(String[] args) {
          System.out.print("introduce el pricio de la compra :");
	
  Scanner s = new Scanner(System.in);
  double pricio =s.nextDouble();

  if (pricio >= 100) {
   System.out.println("se ha aplicado un descuento del 8%." );
   System.out.print("el precio final es :" + (pricio-(pricio*0.08)) + " EUR");
  } else if (pricio < 30) {
   System.out.println("se ha aplicado una penalización de 2 EUR.");
   System.out.println("el precio final es :" + (pricio + 2 ) + " EUR");
  } else {
   System.out.println("no hay descuento ni penalización.");
   System.out.println("el precio final es :" + pricio + " EUR");
  }
	}
}