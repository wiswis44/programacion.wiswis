public class Employee {
    private String nombre;
    private String direccion;
    private double salario;
    private String puestoTrabajo;

    public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double calcularBonus() {
        return 0.0;
    }

    public String generarReporte() {
        String reporte = "Nombre: " + nombre + "Direccion: " + direccion + " Puesto: " + puestoTrabajo+ " Salario: " + salario + " Bonus: " + calcularBonus();
        return reporte;
    }
}
