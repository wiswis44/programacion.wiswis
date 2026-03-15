package AEA3.entregar.hotel;

public class CasaRural extends Allotjament {

    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    // GETTERS / SETTERS

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    // PRECIO

    public double calcularPreuPerNit() {

        double preu = 150;

        if (tePiscina) {
            preu = preu + 50;
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

    String jardi;
    if (teJardi) {
        jardi = "Sí";
    } else {
        jardi = "No";
    }

    String piscina;
    if (tePiscina) {
        piscina = "Sí";
    } else {
        piscina = "No";
    }

    return "Casa Rural: " + nom + " | Cap.: " + capacitat + " | Jardí: " + jardi + " | Piscina: " + piscina + " | Preu: " + calcularPreuPerNit() + "EUR" +" - " + estat;
}
}