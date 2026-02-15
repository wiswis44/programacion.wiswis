package AEA3.ejemplos.classepersona;

public class Estudiante extends Persona {

    private String curso ;
    private String asignatura ;
    private String escuela ;
    private int nota ;

    public Estudiante(
        int id, 
        int age ,
        String prénom ,
        String nom ,
        String localisation ,
        String curso , 
        String asignatura , 
        String escuela , 
        int nota){
        super(id, age, prénom, nom, localisation);
        this.curso = curso ;
        this.asignatura = asignatura ;
        this.escuela = escuela;
        this.nota = nota ;
    }
    public Estudiante(int id , int age, String curso){
        super(id, age);
        this.curso = curso;
    }
}
