/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniReto01;

/**
 *
 * @author herre
 */
public class ProcesadorPagos {
    
    // Descuento fijo del 10% usado por la tercera sobrecarga
    private static final double PORCENTAJE_DESCUENTO = 0.10;
 
    // Sobrecarga 1: recibe solo el monto -> se asume pago en EFECTIVO
    public void procesarCompra(double monto) {
        System.out.println("[Version 1: double] Procesando pago en efectivo");
        System.out.println("Medio de pago : Efectivo");
        System.out.printf("Monto cobrado : S/ %.2f%n", monto);
        System.out.println("----------------------------------------");
    }
 
    // Sobrecarga 2: monto + numero de tarjeta -> pago con TARJETA
    public void procesarCompra(double monto, String numeroTarjeta) {
        System.out.println("[Version 2: double, String] Procesando pago con tarjeta");
        System.out.println("Medio de pago : Tarjeta " + enmascararTarjeta(numeroTarjeta));
        System.out.printf("Monto cobrado : S/ %.2f%n", monto);
        System.out.println("----------------------------------------");
    }
 
    // Sobrecarga 3: monto + tarjeta + cupon -> aplica 10% de descuento antes de cobrar
    public void procesarCompra(double monto, String numeroTarjeta, String codigoDescuento) {
        double descuento = monto * PORCENTAJE_DESCUENTO;
        double montoFinal = monto - descuento;
 
        System.out.println("[Version 3: double, String, String] Pago con tarjeta y descuento");
        System.out.println("Medio de pago  : Tarjeta " + enmascararTarjeta(numeroTarjeta));
        System.out.println("Cupon aplicado : " + codigoDescuento);
        System.out.printf("Monto original : S/ %.2f%n", monto);
        System.out.printf("Descuento (10%%): -S/ %.2f%n", descuento);
        System.out.printf("Monto final    : S/ %.2f%n", montoFinal);
        System.out.println("----------------------------------------");
    }
 
    // Metodo auxiliar: deja visibles solo los ultimos 4 digitos
    private String enmascararTarjeta(String numeroTarjeta) {
        String digitos = numeroTarjeta.replaceAll("[^0-9]", "");
 
        if (digitos.length() < 4) {
            return "**** **** **** ????";
        }
 
        String ultimos4 = digitos.substring(digitos.length() - 4);
        return "**** **** **** " + ultimos4;
    }
 
    public static void main(String[] args) {
        ProcesadorPagos caja = new ProcesadorPagos();
 
        // El compilador elige la version de 1 parametro (double)
        caja.procesarCompra(45.90);
 
        // El compilador elige la version de 2 parametros (double, String)
        caja.procesarCompra(320.00, "4532 1122 9087 4521");
 
        // El compilador elige la version de 3 parametros (double, String, String)
        caja.procesarCompra(1200.00, "5411998877663310", "BLACKFRIDAY10");
 
        // Un literal 'int' (150) no calza exacto con double, pero Java lo PROMUEVE
        // automaticamente a double, asi que se ejecuta la version 1 sin error.
        caja.procesarCompra(150);
    }
}
