package AEA3.entregar.hotel;

public class Habitacio extends Allotjament {

    private int numLlits;

    public Habitacio(String nom, int capacitat, int numLlits) {
        super(nom, capacitat);
        this.numLlits = numLlits;
    }

    // GETTER / SETTER

    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }

    // PRECIO

    public double calcularPreuPerNit() {

        double preu = 50;

        if (numLlits > 2) {
            preu = preu + (numLlits - 2) * 20;
        }

        return preu;
    }

    // INFORMACIÓN

    public String mostrarInformacio() {
        String estat;
        if (disponible) {
            estat = "Disponible";
        } else {
            estat = "Reservat";
        }

        return "Habitació: " + nom + " | Cap.: " + capacitat + " | Llits: " + numLlits + " | Preu: " + calcularPreuPerNit() + "EUR" + " - " + estat;
}
}
