package AEA3.entregar.maxmin;

public class calculMedia {
    public static double calculaMitjana(double[] valors) {
        double suma = 0;

        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }

        return suma / valors.length;
    }
}
