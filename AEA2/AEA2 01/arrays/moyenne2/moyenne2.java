import java.util.Scanner; 
public class moyenne2 {
  public static void main(String[] args  ) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print(" ¿ cuantas notas quiere introducir ?: "); 

    
    // intoroducir el numero 
    int numvez ;
    if (sc.hasNextInt()){
      numvez = sc.nextInt();
      if (numvez < 0 ){
        System.out.println("números enteros positivos, por favor. ");
        return;
      }
    }else{
      System.out.println("solo numeros ");
      return;
    }
    //leer las notas :

    double[] notas = new double[numvez];

    for ( int i = 0 ; i< notas.length ;i++){
      System.out.println("introduce la nota" + (i+1) +":");

      if (sc.hasNextDouble()) {
        double nota = sc.nextDouble();    
        if (nota <=10 && nota >=0) {
          notas[i] = nota ;
        } else {
          System.out.println("ERROR : Solo entre 0 y 10 , intenta de nuevo ");
          //sc.next();
          --i;
        }
      } else {
        System.out.println("ERROR : Solo numeros , intenta de nuevo.");
        sc.next();
        --i;   
      }
    }
 //comprobar si hay un diez:
    boolean il_y_a_une = false;
    for (int j=0 ; j<notas.length ; j++){
      if(notas[j] == 10){
        il_y_a_une = true ;
      }
    }
    if(il_y_a_une){
      System.out.println("hay un 10 ");
    }else{
      System.out.println("no hay un 10 ");
    }
  }
}