package AEA3.exemple;

import java.util.Scanner;
public class LeerEnteros {
  public static void main (String[] args) {
    LeerEnteros programa = new LeerEnteros();
    programa.inicio();
  }
  public void inicio() {
    System.out.println("Lea un entero por el teclado: ");
    int a = leerEnterTeclado();
    System.out.println("El entero ha sido " + a + ".");
    System.out.println("Lea otro entero por el teclado:");
    a = leerEnterTeclado();
    System.out.println("El otro entero ha sido " + a + ".");
  }
  //1. ¿Qué tipo de valor genera? Un entero (int)
  public int leerEnterTeclado() {
  //2. Se hace el código que lee un único entero del teclado, como siempre se ha hecho
  //No cambia absolutamente nada...
    Scanner lector = new Scanner(System.in);
    int enteroLeído = 0;
    boolean leído = false;
  while (!leído) {
    leído = lector.hasNextInt();
    if (leído) {
      enteroLeído = lector.nextInt();
    }
    else {
      System.out.println("Esto no es un entero.");
      lector.next();
    }
  }
  
  lector.nextLine();
  //3. Una vez hecho, ¿qué variable tiene el resultado? "enteroLeído"
  //4. Hay que hacer "returno" sobre él
  return enteroLeído;
  
  }
}