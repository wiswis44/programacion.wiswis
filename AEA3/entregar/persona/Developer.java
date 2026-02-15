public class Developer extends Employee {
    private String lenguajeProgramacion;

    public Developer(String nombre, String direccion, double salario, String lenguajeProgramacion) {
        super(nombre, direccion, salario, "Developer");
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public double calcularBonus() {
        double bonus = getSalario() * 0.10;
        return bonus;
    }

    public void escribirCodigo() {
        System.out.println(getNombre() + " esta escribiendo codigo en " + lenguajeProgramacion + ".");
    }
}
