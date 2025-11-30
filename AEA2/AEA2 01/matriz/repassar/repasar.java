public class repasar {
    public static void main(String[] args) {
    int[][] matriu = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

        for (int i = 0; i < matriu.length; i++) {
            double suma = 0  ;
            for (int j = 0; j < matriu[i].length; j++){
                suma = suma + matriu[i][j];
            }
            System.out.println("el resultado de la suma de los elementos de la fila con indice "+ i + " es : " +  suma );
        }
    }
}  
/*
Reutilizad la matriz que creamos en el ejemplo anterior, pero ahora haced que en 
todas las filas y columnas pares el valor cambie a -1.

A partir de una matriz de 3 × 3 de números enteros:
a. Calculad la suma de los elementos de cada fila.
b. Mostrad el resultado fila por fila.

errores: 
Lo que hacía mal antes era que la variable suma estaba fuera del bucle de las filas.
Al ponerla dentro del for de las filas, empieza siempre en 0 para cada fila.
Después, dentro del bucle de las columnas, voy sumando cada elemento de esa fila y guardándolo en la variable suma.
Cuando termina la primera fila (i = 0) y pasa a la siguiente (i = 1), la variable vuelve a valer 0, 
así puedo calcular correctamente la suma de la segunda fila, y después de la tercera.
*/