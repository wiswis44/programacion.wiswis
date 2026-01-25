package AEA3.entregar.maxmin;

public class CalculMAX {
     public static double calculaMax(double[] valors) {
        double max = valors[0];

        for (int i = 1; i < valors.length; i++) {
            if (valors[i] > max) {
                max = valors[i];
            }
        }

        return max;
    }
}
