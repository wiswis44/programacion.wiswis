package AEA3.entregar.figuras10;
import java.util.Random;

public class MainProjecteFigura {

    public static void main(String[] args) {
        Random rand = new Random();
        int opcio = 0;

        while (opcio != 8) {
            
            System.out.println("Proper ID de figura a crear: " + Figura.seguentFigura());
            System.out.println("Quina figura vols crear?");
            System.out.println("1.Triangle 2.Quadrat 3.Rectangle 4.Trapezi 5.Rombe 6.Parallelogram 7.Cercle 8.Sortir");

            opcio = Figura.sc.nextInt();
            Figura.sc.nextLine();

            if (opcio == 8) {
                System.out.println("...");
            } else if (opcio >= 1 && opcio <= 7) {
                
                int tipusConstructor = rand.nextInt(2);
                
                Figura f; 

                if (opcio == 1) {
                    if (tipusConstructor == 0) { f = new Triangle(); } 
                    else { f = new Triangle(5, 10); }
                } else if (opcio == 2) {
                    if (tipusConstructor == 0) { f = new Quadrat(); } 
                    else { f = new Quadrat(5); }
                } else if (opcio == 3) {
                    if (tipusConstructor == 0) { f = new Rectangle(); } 
                    else { f = new Rectangle(4, 8); }
                } else if (opcio == 4) {
                    if (tipusConstructor == 0) { f = new Trapezi(); } 
                    else { f = new Trapezi(6, 4, 5); }
                } else if (opcio == 5) {
                    if (tipusConstructor == 0) { f = new Rombe(); } 
                    else { f = new Rombe(10, 8); }
                } else if (opcio == 6) {
                    if (tipusConstructor == 0) { f = new Parallelogram(); } 
                    else { f = new Parallelogram(10, 5); }
                } else {       //no hace falta escribir opcion 7 por el circulo porque ya está escrita en la linea 21
                    if (tipusConstructor == 0) { f = new Cercle(); } 
                    else { f = new Cercle(7); }
                }

                if (tipusConstructor == 0) {
                    f.llegirDades(); 
                } 

                f.imprimirDades();
                
            } else {
                System.out.println("Error: Opció no vàlida.");
            }
        }
    }
}