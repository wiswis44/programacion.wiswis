package AEA4.entregas.leerplabras;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeerPalabras {
    public static void main(String[] args) {
          int contador = 0;

        // LECTURA DEL ARCHIVO entrada.txt
        try {
            File archivo = new File("C:\\Users\\HP\\Documents\\DAM1\\comp\\PRO.GEN\\PROGRAMACION\\AEA4\\entregas\\leerplabras\\entrada.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNext()) {
                lector.next(); 
                contador++;    
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo entrada.txt");
            return;
        }

        // ESCRITURA DEL ARCHIVOo
        try {
            FileWriter escritor = new FileWriter("C:\\\\Users\\\\HP\\\\Documents\\\\DAM1\\\\comp\\\\PRO.GEN\\\\PROGRAMACION\\\\AEA4\\\\entregas\\\\leerplabras\\\\sortida.txt"); 
            escritor.write("Numero de palabras: " + contador);
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }

        System.out.println("Proceso terminado");
    }
}
