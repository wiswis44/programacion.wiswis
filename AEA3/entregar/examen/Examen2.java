package AEA3.entregar.examen;



import java.util.Scanner;

public class Examen2 {

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1; 
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;

    Scanner sc = new Scanner(System.in);


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        //Desenvolupeu el vostre codi aquí

        PreguntarNotes();
        ImprimirArrayNotes();
        MostrarMenu();
        TractarOpcio();
        


    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí
        notes [1] = 1; 
        notes [2] = 4 ;
        notes [3] = 7 ;
        notes [4] = 8; 
        notes [5] = 0 ;
        notes [6] = 9 ;
        notes [7] = 10 ;
        notes [8] = -1 ; 
        // -----------------------

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        //System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        //System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr: no tiene 
    //Param. sort: no tiene 
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        //Desenvolupeu el vostre codi aquí
        for (int i = 0; i < notes.length; i++) {
            System.out.println("las notas introducidas son :");
            System.out.print(notes[i]);

        }
    }

    //Param. entr: no tiene 
    //Param. sort: no tiene
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr:no tiene
    //Param. sort:no tiene
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
            int mida = 8 ; 
            //Desenvolupeu el vostre codi aquí
            while(!fi){
                MostrarMenu();
                String opcio = sc.nextLine();

                if (opcio.equalsIgnoreCase("MAX")) {
                max = calculador.calcularMaxim(notes);

                }
                else if (opcio.equalsIgnoreCase("MIN")) {
                min = calculador.calcularMinim(notes);
                }
                else if (opcio.equalsIgnoreCase("MIT")) {
                    calculador.calcularMitjana(notes, mida );
                }
                else if (opcio.equalsIgnoreCase("FI")) {
                    fi = true;
                    System.out.println("salirr de la programa...");
                }
                else {
                    System.out.println("O.");
                }
            }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    /*private String PrepararSortida(double valor) {
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr: no tiene 
    //Param. sort:un boolean
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    private boolean MirarSiAlgu8() {
        //Desenvolupeu el vostre codi aquí
    }*/

    //Param. entr:double valornota, String text, String opcio
    //Param. sort: no tiene
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
