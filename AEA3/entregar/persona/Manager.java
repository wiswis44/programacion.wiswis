public class Manager extends Employee {
    private int numTrabajadores;

    public Manager(String nombre, String direccion, double salario, int numTrabajadores) {
        super(nombre, direccion, salario, "Manager");
        this.numTrabajadores = numTrabajadores;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public double calcularBonus() {
        double bonus = getSalario() * 0.12;
        return bonus;
    }

    public void gestionProyecto() {
        System.out.println(getNombre() + " esta gestionando un proyecto con " + numTrabajadores + " trabajadores.");
    }
}