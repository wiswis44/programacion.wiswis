import java.util.Scanner;

class Actividad {
	public static void main(String[] args) {
	
  Scanner numero = new Scanner(System.in);

   System.out.print("el primer numero : ");
   double w = numero.nextDouble();

   System.out.print("el segundo numero : ");
   double s = numero.nextDouble();

   System.out.print("el tercer numero : ");
   double m = numero.nextDouble();

   System.out.println("el resultado de la multiplicacion es :" + (w * s * m));


	}
}