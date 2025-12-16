package AEA3.Estrella;

public class Estrella{
    //variables globales : 
    public static void main(String[] args) {
        Estrella wis = new Estrella();
        wis.inici();
    }

    public void inici() {
        System.out.println("has demant dibuixar");
        impremir_estrella(6);
        impremir_estrella(3);
        System.out.println("aqui acaba el programa . ");
    }

    public void impremir_estrella(int num ){
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}


