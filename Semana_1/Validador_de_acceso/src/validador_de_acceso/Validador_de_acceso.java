
package validador_de_acceso;
import java.util.Scanner;
public class Validador_de_acceso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
 
        if (edad < 0) {
            System.out.println("Resultado: La edad ingresada no es válida.");
        } else if (edad < 18) {
            System.out.println("Resultado: Eres menor de edad.");
        } else if (edad <= 29) {
            System.out.println("Resultado: Eres un joven adulto.");
        } else {
            System.out.println("Resultado: Eres un adulto.");
        }
 
        sc.close();
    }
    
}
