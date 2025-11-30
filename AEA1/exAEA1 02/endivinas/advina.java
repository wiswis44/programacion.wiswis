import java.util.Scanner;
import java.util.Random;

public class advina {
  public static void main(String[] args) {
  Random rnd = new Random(); 
  Scanner sc = new Scanner(System.in);

    int incognito = rnd.nextInt(100);
    int intentos = 0;
    int maxIntentos = 3;
    

  System.out.println("¡Adivina el número secreto! Tienes "+maxIntentos+" intentos.");

    while (intentos < maxIntentos) {
      System.out.print("Introduce un número: ");
      if (sc.hasNextInt()) {
        int intentoUsuario = sc.nextInt();
        intentos++;

            if (intentoUsuario == incognito) {
              System.out.println("¡Muy bien! Has adivinado el número secreto: " + incognito);
              break;
            } 
            else {
                int resto = maxIntentos - intentos;
                  if (resto > 0) {
                    System.out.println("¡Incorrecto! Intentos restantes: " + resto);
                  }  else {
                      System.out.println("Has superado el límite de intentos. El número era: " + incognito);
                  }
            }
      }
      else{System.out.println("Por favor, introduce solo números.");
      sc.next();
      }
    }
  }
}