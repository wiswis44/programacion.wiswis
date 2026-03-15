package AEA3.entregar.hotel;

public class Allotjament {

    protected String nom;
    protected int capacitat;
    protected boolean disponible;

    public Allotjament(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = true;
    }

    // GETTERS

    public String getNom() {
        return nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // SETTERS

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // MÉTODOS GENERALES

    public boolean reservar() {

        if (disponible) {
            disponible = false;
            return true;
        }

        return false;
    }

    public void alliberar() {
        disponible = true;
    }

    // Métodos que las clases hijas las utilizaran

    public double calcularPreuPerNit() {
        return 0;
    }

    public String mostrarInformacio() {
        return nom;
    }
}
