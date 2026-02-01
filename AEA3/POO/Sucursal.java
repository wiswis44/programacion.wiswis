public class Sucursal {

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    // Constructor
    public Sucursal(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos
    public void ponerTrabajar(Transportista t) {}
    public void ponerDescansar(Transportista t) {}
    public void altaCliente(Client c) {}
    public void bajaCliente(Client c) {}
    public void asignarEncargo(Client c, Transportista t, Encarrec e) {}
    public void anularEncargo(Encarrec e) {}
}