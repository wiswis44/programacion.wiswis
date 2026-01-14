package AEA3.ImpChars;

public class charint {
    public static void main(String[] args) {
        charint programa = new charint();
        programa.inici();
    }
    public void inici(){        
        System.out.println("has demant dibuixar");
            impremir_char(5 , '*');
            impremir_char(3 , '#');
            impremir_char(4 , 'A');
        System.out.println("aqui acaba el programa . ");
    }
    public void impremir_char(int num , char Char ){
        for (int i = 0; i < num; i++) {
            System.out.print(Char);
        }
        System.out.println();
    }
}