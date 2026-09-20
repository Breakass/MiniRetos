package menu_de_opciones;
import java.util.Scanner;
public class Menu_de_opciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.print("Elige una opcion (1-3): ");
        int opcion = sc.nextInt();
        System.out.print("Ingresa el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado de la multiplicacion: " + (a * b));
                break;
            default:
                System.out.println("Opción invalida. Elige un número del 1 al 3.");
        }
        sc.close();
    }
}