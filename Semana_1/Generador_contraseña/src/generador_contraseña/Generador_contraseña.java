package generador_contraseña;
import java.util.Random;
import java.util.Scanner;

public class Generador_contraseña {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
 
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine().trim();
 
        // Si el nombre tiene menos de 3 letras, se usa completo
        int limite = Math.min(3, nombre.length());
        String prefijo = nombre.substring(0, limite).toUpperCase();
        int numero = rand.nextInt(9000) + 1000; // 1000 a 9999 (siempre 4 dígitos)
        String contrasena = prefijo + numero;
        System.out.println("Contraseña generada: " + contrasena);
        sc.close();
    }
}
