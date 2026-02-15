public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("wassim", "Barcelona", 2500.0);
        Manager manager = new Manager("Doua", "Madrid", 3200.0, 8);
        Developer developer = new Developer("Marcos", "Valencia", 2800.0, "Java");

        programmer.debug();
        manager.gestionProyecto();
        developer.escribirCodigo();

        System.out.println(programmer.generarReporte());
        System.out.println(manager.generarReporte());
        System.out.println(developer.generarReporte());

        programmer.setDireccion("Sevilla");
        System.out.println("Nueva direccion Programmer: " + programmer.getDireccion());

    }
}