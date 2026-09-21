
package Mi_propia_clase;

public class Producto {
        // Atributos privados (encapsulamiento)
    private String nombre;
    private double precio;
    private int stock;
 
    // Constructor que inicializa todos los atributos
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Método 1: muestra los datos
    public void mostrarDatos() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio original: S/ " + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
 
    // Método 2: realiza un cálculo (aplica un descuento en porcentaje)
    public double calcularPrecioConDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}
