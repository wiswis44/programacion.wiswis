package AEA3.entregar.figuras;

public class MainProjecteFigura {

    public static void main(String[] args) {

        Triangle t = new Triangle(44, 23);
        Quadrat q = new Quadrat(9);

        Rectangle r = new Rectangle();
        r.setCostat1(6);
        r.setCostat2(3);

        Trapezi tr = new Trapezi(23, 25, 18);
        Rombe ro = new Rombe(7, 6);
        Parallelogram p = new Parallelogram(4, 4);
        Cercle c = new Cercle(9);

        t.imprimirDades();
        q.imprimirDades();
        r.imprimirDades();
        tr.imprimirDades();
        ro.imprimirDades();
        p.imprimirDades();
        c.imprimirDades();
    }
}