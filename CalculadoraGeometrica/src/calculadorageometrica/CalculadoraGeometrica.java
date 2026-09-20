package calculadorageometrica;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraGeometrica {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // acepta decimales con punto (2.5)
        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();
        if (radio <= 0) {
            System.out.println("Error: el radio debe ser mayor que 0.");
        } else {
            double area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;
            // Redondeo a 2 decimales con Math.round
            double areaRedondeada = Math.round(area * 100.0) / 100.0;
            double perimetroRedondeado = Math.round(perimetro * 100.0) / 100.0;
            System.out.println("Área: " + areaRedondeada);
            System.out.println("Perímetro: " + perimetroRedondeado);
        }
        sc.close();
    }
}
