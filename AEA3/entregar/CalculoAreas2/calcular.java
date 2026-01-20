package AEA3.entregar.CalculoAreas2;

import java.util.Scanner;

public class calcular {

    public static void main(String[] args) {
        calcular programa = new calcular();
        programa.inici();
    }

    public void inici() {
        Scanner s = new Scanner(System.in);

        System.out.println("De quina figura vols calcular l'area?");
        System.out.println(">>>triangle--quadrat--rectangle--trapezi--rombo--paralelogram--cercle<<<");
        String figura = s.nextLine().toLowerCase(); 

        double area = gestioFigures(figura, s);

        if (area == -1) {
            System.out.println("Figura no vàlida");
        } else {
            System.out.println("L'area del " + figura + " es " + area);
        }
    }


    public double gestioFigures(String figura, Scanner s) {
        if (figura.equals("triangle")) {
            return areaTriangle(s);
        }
        else if (figura.equals("quadrat")) {
            return areaQuadrat(s);
        }
        else if (figura.equals("rectangle")) {
            return areaRectangle(s);
        }
        else if (figura.equals("cercle")) {
            return areaCercle(s);
        }
        else if (figura.equals("trapezi")) {
            return areaTrapezi(s);
        }
        else if (figura.equals("rombe")) {
            return areaRombe(s);
        }
        else if (figura.equals("paralelogram")) {
            return areaParalelogram(s);
        }
        else {
            return -1; 
        }
    }

   
    public double areaTriangle(Scanner s) {
        System.out.print("Base: ");
        double b = s.nextDouble();
        System.out.print("Altura: ");
        double h = s.nextDouble();
        return (b * h) / 2;
    }

    public double areaQuadrat(Scanner s) {
        System.out.print("Costat: ");
        double c = s.nextDouble();
        return c * c;
    }

    public double areaRectangle(Scanner s) {
        System.out.print("Base: ");
        double b = s.nextDouble();
        System.out.print("Altura: ");
        double h = s.nextDouble();
        return b * h;
    }

    public double areaCercle(Scanner s) {
        System.out.print("Radi: ");
        double r = s.nextDouble();
        return Math.PI * r * r;
    }

    public double areaTrapezi(Scanner s) {
        System.out.print("Base major: ");
        double B = s.nextDouble();
        System.out.print("Base menor: ");
        double b = s.nextDouble();
        System.out.print("Altura: ");
        double h = s.nextDouble();
        return ((B + b) * h) / 2;
    }

    public double areaRombe(Scanner s) {
        System.out.print("Diagonal major: ");
        double D = s.nextDouble();
        System.out.print("Diagonal menor: ");
        double d = s.nextDouble();
        return (D * d) / 2;
    }

    public double areaParalelogram(Scanner s) {
        System.out.print("Base: ");
        double b = s.nextDouble();
        System.out.print("Altura: ");
        double h = s.nextDouble();
        return b * h;
    }
}

