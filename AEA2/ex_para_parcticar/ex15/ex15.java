package AEA2.ex_para_parcticar.ex15;

public class ex15 {
    public static void main(String[] args) {
        //menu principal
        while () {
            
        }
        //while tiene dentro los cuatro opciones  
    }
}
/* 
📝 El Reto: "Gestor de Cine en Consola"
Tu programa debe iniciar mostrando un Menú Principal con 4 opciones. El programa no debe detenerse después de ejecutar una opción, debe volver a mostrar el menú.
Opciones del Menú:
1. Ver la Sala (El reto visual)
Debes recorrer la matriz e imprimir la sala en pantalla.
Condición: No imprimas 0 y 1.
Si es 0, imprime [ ] (vacío).
Si es 1, imprime [X] (ocupado).
Dificultad añadida: Debes imprimir los números de fila (0-11) al lado izquierdo de cada fila para que el usuario sepa qué coordenada elegir.
2. Reservar Asiento (El reto de validación)
El programa pedirá Fila y Columna.
Precio:
Si la fila es de la 0 a la 7: El precio es 8€.
Si la fila es de la 8 a la 11 (VIP): El precio es 12€.
Validaciones (Debes usar if):
Que las coordenadas estén dentro de los límites (no poner fila 200).
Que el asiento no esté ya ocupado (1).
Acción: Si todo es correcto, marca el asiento con 1, suma el precio a la recaudacion total e imprime un mensaje de éxito.
3. Cancelar Reserva (Lógica inversa)
Pide fila y columna.
Si el asiento está ocupado (1), lo conviertes en libre (0).
Importante: Debes restar el precio del boleto a la recaudacion (recuerda restar 8 o 12 dependiendo de la fila).
4. "Buscador de Parejas" (La pregunta difícil - Para nota)
El usuario solo introduce una fila. El programa debe buscar automáticamente si en esa fila existen 2 asientos libres que estén juntos (consecutivos).
Debes recorrer esa fila específica.
Si encuentras dos ceros seguidos (0, 0), el programa imprime: "¡Encontrados! Asientos sugeridos: Columna X y Columna Y".
Si recorres toda la fila y no hay parejas, imprime: "No hay asientos juntos en esta fila".*/