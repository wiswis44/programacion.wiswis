import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) { 
            System.out.println("\n--- MENÚ INTERACTIVO ---");
            System.out.println("1. Mostrar mensaje de bienvenida");
            System.out.println("2. Mostrar la fecha actual");
            System.out.println("3. Realizar una suma");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¡Bienvenido al programa! 😊");
                        break;
                    case 2:
                        System.out.println(" La fecha actual es:  15/10/2025");
                        break;
                    case 3:
                        System.out.print("Introduce el primer número: ");
                        int num1 = sc.nextInt();
                        System.out.print("Introduce el segundo número: ");
                        int num2 = sc.nextInt();
                        System.out.println("El resultado de la suma es: " + (num1 + num2));
                        break;
                    case 4:
                        System.out.println("¡Gracias por usar el programa! Hasta pronto 😊");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige entre 1 y 4.");
                }
            } else {
                System.out.println("Por favor, introduce solo números.");
                sc.next(); 
            }
        }
    }
}