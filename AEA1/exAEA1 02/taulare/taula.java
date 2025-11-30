import java.util.Scanner;
class taula {
	public static void main(String[] args) {
      System.out.print("¿Qué tabla de multiplicar quieres ver? : ");
      Scanner sc = new Scanner(System.in);

      if (sc.hasNextInt()) {
            int number = sc.nextInt();
            for (int i = 10; i >= 1; i--) {
                int taula = number * i;
                System.out.println(i + " * " + number + " = " + taula);
            }
                System.out.println("\n" + "Esta ha sido la tabla del " + number);
        } else {
            System.out.println("por ffavor, introduce solo números.");
        }
	}    
}