/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniReto_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author herre
 */
public class EntradaValida {
        // Limite de reintentos permitidos
    private static final int MAX_INTENTOS = 3;
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        boolean edadCapturada = false;
 
        // El bucle corta por DOS razones: exito o intentos agotados
        while (intentos < MAX_INTENTOS && !edadCapturada) {
 
            intentos++;
 
            try {
                System.out.print("Intento " + intentos + " de " + MAX_INTENTOS
                        + " - Ingresa tu edad: ");
 
                // Si el usuario escribe texto, nextInt() lanza
                // InputMismatchException y el flujo salta al catch
                int edad = sc.nextInt();
 
                System.out.println("Edad registrada correctamente: " + edad + " anios.");
                edadCapturada = true;
 
            } catch (InputMismatchException e) {
 
                // Limpia el texto invalido que quedo en el buffer
                sc.nextLine();
 
                System.out.println("[ERROR] Eso no es un numero entero. "
                        + "Escribe solo digitos.");
 
                if (intentos < MAX_INTENTOS) {
                    System.out.println("        Te quedan " + (MAX_INTENTOS - intentos)
                            + " intento(s).");
                }
            }
        }
 
        // Mensaje final cuando se agotaron los tres intentos
        if (!edadCapturada) {
            System.out.println("Se agotaron los " + MAX_INTENTOS
                    + " intentos. Operacion cancelada.");
        }
 
        sc.close();
        System.out.println("El programa continua sin terminar abruptamente...");
    }

}
