package AEA3.entregar.examen;

public class NotaAText {

    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text
        public String notaAText(double nota) {
            //Desenvolupeu el vostre codi aquí
        

        if (nota < 5) {
            return "Suspenso";
        }
        else if (nota < 6) {
            return "Aprobado";
        }
        else if (nota < 8) {
            return "Bien";
        }
        else  {
            return "Excelente";
        }
        

    }
}
