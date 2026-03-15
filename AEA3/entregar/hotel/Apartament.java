package AEA3.entregar.hotel;

public class Apartament extends Allotjament {

    private int habitacions;
    private boolean teCuina;

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina) {
        super(nom, capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    // GETTERS / SETTERS

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }

    // PRECIO

    public double calcularPreuPerNit() {
        return 100 + habitacions * 10;
    }

    // INFORMACIÓN

   public String mostrarInformacio() {
    String estat;
    if (disponible) {
        estat = "Disponible";
    } else {
        estat = "Reservat";
    }

    String cuina;
    if (teCuina) {
        cuina = "Sí";
    } else {
        cuina = "No";
    }

    return "Apartament: " + nom + " | Cap.: " + capacitat + " | Hab.: " + habitacions + " | Cuina: " + cuina + " | Preu: " + calcularPreuPerNit() + "EUR" + " - " + estat;
}
}
