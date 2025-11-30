import java.util.Scanner ; 
public class exemple2 {
	public static void main (String[] args) {

	int [] a= new int[6];
	int [] b={7,10,25,40,50,-50};

		for (int i = 0 ; i< b.length ; i++) {
			System.out.println("dsd"+ i + "err" + b[i]);
		}
		for(int i = 0 ; i < a.length; i++){
			a[i] = i+ 11;
			/* if ( a[i] % 2 != 0 ){
			a[i]= 0 ;
			}*/
			if(i % 2 == 0){
				a[i] = -1 ;
			}
			System.out.println(a[i]); 
		}
	}
}