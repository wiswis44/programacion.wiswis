import java.util.Scanner;
class taula2 {
    public static void main(String[] args) {
   Scanner w = new Scanner(System.in);
   System.out.print("Quina taula de multiplicar vols ? :" );
   int taula = w.nextInt();
   int i = 0 ;

    while (i <= 10 ) { 
        System.out.println(i + taula );
        i++;
    }
    }
}