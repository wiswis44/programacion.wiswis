public class numeros100 {
	public static void main (String[] args) {
	int pares = 100 ;
	
	System.out.println(" Array con los" + pares + " primeros números pares. ") ;
	int[] array = new int [pares] ;
		for ( int i = 0 ; i < array.length ; i++ ) {
			array[i] = i * 2 ;
		}  

		System.out.println(" los " + pares + " primeros números pares son: ") ;

		for ( int i = 0 ; i < array.length ; i++ ) {
			System.out.print( array[i] + " ") ;
		}
	}
}