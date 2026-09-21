package calculadora_categoria_nota;

import java.util.Scanner;

public class Calculadora_categoria_nota {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nota: ");
        double nota = sc.nextDouble();
        if (nota < 0 || nota > 20) {
            System.out.println("Error: la nota debe estar entre 0 y 20.");
        } else if (nota < 11) {
            System.out.println("Categoría: Desaprobado");
        } else if (nota < 14) {
            System.out.println("Categoria: Regular");
        } else if (nota < 17) {
            System.out.println("Categoria: Bueno");
        } else {
            System.out.println("Categoria: Excelente");
        }
        sc.close();
    }   
}
