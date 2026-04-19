package AEA4.entregas.pares;

public class numeros100 {
    public static void main(String[] args) {
        int pares = 100;

        try {
            System.out.println("Array con los " + pares + " primeros números pares.");
            int[] arrayPares = new int[pares];

            for (int i = 0; i <= arrayPares.length; i++) { // para producir el error
                /* for (int i = 0; i < arrayPares.length; i++) { */ // no produce el error
                arrayPares[i] = i * 2;
            }

            System.out.println("Los " + pares + " primeros números pares son:");

            for (int i = 0; i < arrayPares.length; i++) {
                System.out.print(arrayPares[i] + " ");
            }
            System.out.println();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Se ha intentado acceder a una posición fuera del array.");

        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error.");

        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}