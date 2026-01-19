package AEA3.exemple;

import java.util.Scanner;
public class LeerReals {
  public static void main (String[] args) {
    LeerReals programa = new LeerReals();
    programa.inicio();
  }
  public void inicio() {
    System.out.println("Lea un real por el teclado: ");
    double a = leerRealTeclado();
    System.out.println("El real ha sido " + a + ".");
    System.out.println("Lea otro real por el teclado:");
    a = leerRealTeclado();
    System.out.println("El otro real ha sido " + a + ".");
  }
  
  public double leerRealTeclado() {
  
    Scanner lector = new Scanner(System.in);
    double realLeído = 0;
    boolean leído = false;
  while (!leído) {
    leído = lector.hasNextDouble();
    if (leído) {
      realLeído = lector.nextDouble();
    }
    else {
      System.out.println("Esto no es un real.");
      lector.next();
    }
  }
  
  lector.nextLine();
  
  return realLeído;
  
  }
}