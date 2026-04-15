package AEA4.entregas.invertir;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InvertirLinies {
    public static void main(String[] args) {

        try {
            Scanner lector = new Scanner(new File("C:\\Users\\HP\\Documents\\DAM1\\comp\\PRO.GEN\\PROGRAMACION\\AEA4\\entregas\\invertir\\archivo.txt"));
            FileWriter escritor = new FileWriter("C:\\Users\\HP\\Documents\\DAM1\\comp\\PRO.GEN\\PROGRAMACION\\AEA4\\entregas\\invertir\\archivo_inverso.txt");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String invertida = new StringBuilder(linea).reverse().toString();
                escritor.write(invertida + "\n");
            }

            lector.close();
            escritor.close();

        } catch (Exception e) {
            System.out.println("Error con el archivo");
        }

    System.out.println("Proceso terminado");
    }
}