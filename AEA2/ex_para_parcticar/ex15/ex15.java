package AEA2.ex_para_parcticar.ex15;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //los varibles :
        int opcion = 0 ;
        int num_fila =0 ; 
        int num_columna = 0 ; 
        int [][] sala = new int [11][9];
        while (true ) {
                //menu principal
            System.out.println("---------MENU PRINCIPAL -----------");
            System.out.println("1. mostrar los asientos del cine .");
            System.out.println("2. Reservar un asiento ");
            System.out.println("3. cancelar reserva ");
            System.out.println("4. sortir del programa ");
            System.out.println("elige una opcion  : ");
//----------------------------------------------------
            opcion = sc.nextInt();
            switch (opcion ) {
                case 1:
                    System.out.println("eso es el plano de los asientos en nuestra sala :");
                    for (int i = 0; i < sala.length; i++) {
                        System.out.print("FILA NUM : "+ i+ " :" );
                        for (int j = 0; j < sala[i].length; j++) {
                            if (sala[i][j]==0 ) {
                                System.out.print("[ ]");
                            }
                            if (sala[i][j]== 1) {
                                System.out.print("[x]");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("reserva tu asiento . ");
                    System.out.println("introduce el numero de la fila porfavor . ");
                        while (true ) {
                            if (sc.hasNextInt()){
                                num_fila = sc.nextInt();
                                    if (num_fila>0 && num_fila<11)break;
                                    else System.out.println("¡ERROR! FUERA DEL INTERVALO ");
                            }else{
                                System.out.println("¡ERROR! SOLO NUMEROS INTENTA DE NUEVO .");
                                sc.next();
                            }
                        }
                    
                    System.out.println("introduce el numero de columnas porfa : ");
                    while (true ) {
                            if (sc.hasNextInt()){
                                num_columna = sc.nextInt();
                                    if (num_columna>0 && num_columna<11)break;
                                    else System.out.println("¡ERROR! FUERA DEL INTERVALO ");
                            }else{
                                System.out.println("¡ERROR! SOLO NUMEROS INTENTA DE NUEVO .");
                                sc.next();
                            }
                        }
                    
                    int asiento_actual = sala[num_fila][num_columna];
                    if (asiento_actual== 0 ) {
                        sala[num_fila][num_columna]= 1; 
                        System.out.println("has reservado el asiento ");
                    }
                    if (asiento_actual!=0 ) {
                        System.out.println("el asiento ya esta reservado");
                    }
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("¡ERROR! OPCION NO EXISTE . INTENTA DE NUEVO LOCO .");
                    break;
            }
        }
        
    }
}
/* 
📝 El Reto: "Gestor de Cine en Consola"
Tu programa debe iniciar mostrando un Menú Principal con 4 opciones. 
    unos  sys.out para mostrar los opciones 
El programa no debe detenerse después de ejecutar una opción, debe volver a mostrar el menú.
    usar while que tiene dentro los swtich 
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