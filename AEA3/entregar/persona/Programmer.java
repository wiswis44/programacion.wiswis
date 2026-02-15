public class Programmer extends Employee {

    public Programmer(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario, "Programmer");
    }

    public double calcularBonus() {
        double bonus = getSalario() * 0.12;
        return bonus;
    }

    public void debug() {
        System.out.println(getNombre() + " esta haciendo debug.");
    }
}
