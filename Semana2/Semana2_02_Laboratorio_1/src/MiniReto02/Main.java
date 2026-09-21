/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniReto02;

/**
 *
 * @author herre
 */
public class Main {
    
 
    public static void main(String[] args) {
 
        double km = 42.195;
        double celsius = 36.5;
 
        // Se accede via la CLASE, nunca via un objeto
        double millas = ConversorUnidades.kilometrosAMillas(km);
        double fahrenheit = ConversorUnidades.celsiusAFahrenheit(celsius);
 
        System.out.println("--- Conversor de unidades ---");
        System.out.printf("%.3f km = %.3f millas%n", km, millas);
        System.out.printf("%.1f C  = %.1f F%n", celsius, fahrenheit);
 
        // Segunda tanda de pruebas
        System.out.printf("%.1f km = %.4f millas%n", 100.0, ConversorUnidades.kilometrosAMillas(100));
        System.out.printf("%.1f C  = %.1f F%n", 0.0, ConversorUnidades.celsiusAFahrenheit(0));
        System.out.printf("%.1f C  = %.1f F%n", -40.0, ConversorUnidades.celsiusAFahrenheit(-40));
 
        // EVIDENCIA PEDAGOGICA: descomenta la siguiente linea y el proyecto
        // NO compilara. NetBeans marcara: "ConversorUnidades() tiene acceso
        // privado en ConversorUnidades". Eso prueba que el constructor
        // private cumplio su proposito.
        //
        // ConversorUnidades conv = new ConversorUnidades();
    }
}
 

