public class TipusProducte {

    private String nombre;
    private int codigo;
    private double precio;
    private int stock;
    private boolean aLaVenta;

    public TipusProducte(String nombre, int codigo, double precio, int stock, boolean aLaVenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.aLaVenta = aLaVenta;
    }
}