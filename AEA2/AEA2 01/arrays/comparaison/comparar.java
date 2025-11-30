
public class comparar {
  public static void main(String[] args  ) {
    int[] Arraynum = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
    int max = Arraynum[0];
    int min = Arraynum[0];
    
    for (int i = 0; i < Arraynum.length; i++) {
      if (max < Arraynum[i]) {
        max = Arraynum[i];
      }
      else if (min > Arraynum[i]) {
        min = Arraynum[i];  
      }
    }
    System.out.println("el numero mas grande es : "+ max );
    System.out.println("el numero mas pequiño es :" + min );
  }
}
