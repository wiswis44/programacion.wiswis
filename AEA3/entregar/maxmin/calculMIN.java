package AEA3.entregar.maxmin;

public class calculMIN {
     public static double calculaMin(double[] valors) {
        double min = valors[0];

        for (int i = 1; i < valors.length; i++) {
            if (valors[i] < min) {
                min = valors[i];
            }
        }

        return min;
    }
}