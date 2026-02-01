public class Transportista {

    private String nombre;
    private String telefono;
    private int numeroLicencia;

    public Transportista(String nombre, String telefono, int numeroLicencia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numeroLicencia = numeroLicencia;
    }

    public void asignarEncargo(Encarrec e) {}
    public void anularEncargo(Encarrec e) {}
}