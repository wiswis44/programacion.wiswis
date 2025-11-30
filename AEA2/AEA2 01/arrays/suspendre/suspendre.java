import java.util.Scanner; 
public class suspendre {
  public static void main(String[] args  ) {

    Scanner sc = new Scanner(System.in);
    int numvez ;
    boolean nohasus = true ;
    
    System.out.print("¿ cuantas notas quire introducir ? :"); 

    // intoroducir el numero :
   
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
            if (nota < 5) {
                System.out.println("un alumno ha suspendido ");
                nohasus = false ;
                break ;
            }else{
            notas[i] = nota ;
            }
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
    }//for
    if (nohasus){
      System.out.println("nadie ha suspendido ");
    }
  }
}