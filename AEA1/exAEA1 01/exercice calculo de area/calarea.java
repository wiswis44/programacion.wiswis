import java.util.Scanner;
class calarea {
    public static void main(String[] args) {
   Scanner w= new Scanner(System.in);
   System.out.print("escribe una figura (triángulo, círculo, trapecio, rombo, paralelogramo):" );
   String figura = w.nextLine();

   switch (figura) {
   case "trapecio":
    System.out.print("introduce la base mayor: ");
    double baseM = w.nextDouble();
    System.out.print("introduce la base menor: ");
    double basem = w.nextDouble();
    System.out.print("introduce la altura: ");
    double altura = w.nextDouble();
    System.out.print("Area del trapecio: " + (((basem + baseM)*altura)) / 2 );
    break;

   case "rombo":
    System.out.print("introduce la diagonal mayor: ");
    double dM = w.nextDouble();
    System.out.print("introduce la diagonal menor: ");
    double dm = w.nextDouble();
    System.out.print("Area del rombo: " + (dM * dm)/2);
    break;

   case "triangulo":
     System.out.print("introduce la base: ");
     double base = w.nextDouble();
     System.out.print("introduce la altura: ");
     double alturaT = w.nextDouble();
     System.out.print("Area del triangulo: " + (base * alturaT) / 2);
     break;

   case "circulo":
     System.out.print("introduce el radio: ");
     double radio = w.nextDouble();
     System.out.print("Area del circulo: " + (3.14 * radio * radio));
     break;

   case "paralelogramo":
        System.out.print("introduce la base: ");
        double baseP = w.nextDouble();
        System.out.print("introduce la altura: ");
        double alturaP = w.nextDouble();
        System.out.print("Area del paralelogramo: " + (baseP*alturaP));
        break;
   default:
            System.out.println("opcion no existe.");     
        }
   }
}   