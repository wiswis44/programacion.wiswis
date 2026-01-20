package AEA3.entregar.CalculoAreas;
import java.util.Scanner;

public class GestioFigures {

  static double calcular(String figura, Scanner sc) {
if (figura.equals("triangle")) {
      System.out.print("Base: ");
      double b = sc.nextDouble();
      System.out.print("Altura: ");
      double h = sc.nextDouble();
      return Arees.areaTriangle(b, h);
    }
    else if (figura.equals("quadrat")) {
      System.out.print("Costat: ");
      double c = sc.nextDouble();
      return Arees.areaQuadrat(c);
    }
    else if (figura.equals("rectangle")) {
      System.out.print("Base: ");
      double b = sc.nextDouble();
      System.out.print("Altura: ");
      double h = sc.nextDouble();
      return Arees.areaRectangle(b, h);
    }
    else if (figura.equals("cercle")) {
      System.out.print("Radi: ");
      double r = sc.nextDouble();
      return Arees.areaCercle(r);
    }
    else if (figura.equals("trapezi")) {
      System.out.print("Base major: ");
      double B = sc.nextDouble();
      System.out.print("Base menor: ");
      double b = sc.nextDouble();
      System.out.print("Altura: ");
      double h = sc.nextDouble();
      return Arees.areaTrapezi(B, b, h);
    }
    else if (figura.equals("rombe")) {
      System.out.print("Diagonal major: ");
      double D = sc.nextDouble();
      System.out.print("Diagonal menor: ");
      double d = sc.nextDouble();
      return Arees.areaRombe(D, d);
    }
    else if (figura.equals("paralelogram")) {
      System.out.print("Base: ");
      double b = sc.nextDouble();
      System.out.print("Altura: ");
      double h = sc.nextDouble();
      return Arees.areaParalelogram(b, h);
    }

    return -1; 
  }
}