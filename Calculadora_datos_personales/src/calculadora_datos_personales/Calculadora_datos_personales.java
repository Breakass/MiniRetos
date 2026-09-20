package calculadora_datos_personales;

public class Calculadora_datos_personales {

    public static void main(String[] args) {
        
    
        String nombre = "Julio";
        int edad = 20;
        double calificacion = 14.5;
 
        int edadEnCincoAnios = edad + 5;
        double nuevaCalificacion = calificacion + 2;
 
        System.out.println("Nombre: " + nombre);
        System.out.println("En 5 años tendre: " + edadEnCincoAnios + " años");
        System.out.println("Nueva calificacion: " + nuevaCalificacion);
    }    
}
