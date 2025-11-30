import java.util.Scanner ;

public class exemple3 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5] ;
         

        for (int i = 0; i < a.length ; i++) {
            System.out.println("" + i + " : ") ;
            a[i] = sc.nextInt();
            
        }
    }
}