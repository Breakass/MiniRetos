package Mi_propia_clase;


public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 3500.0, 10);
        Producto p2 = new Producto("Mouse inalámbrico", 80.0, 50);
 
        p1.mostrarDatos();
        System.out.println("Precio con descuento: S/ " + p1.calcularPrecioConDescuento(10));
        System.out.println();
 
        p2.mostrarDatos();
        System.out.println("Precio con descuento: S/ " + p2.calcularPrecioConDescuento(15));
    }

}
