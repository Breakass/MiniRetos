/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniReto02;

/**
 *
 * @author herre
 */
public class ConversorUnidades {
    // Constantes STATIC: una sola copia compartida, no cambian nunca
    private static final double FACTOR_KM_A_MILLAS = 0.621371;
 
    // Constructor PRIVATE: bloquea "new ConversorUnidades()" desde fuera.
    // La excepcion protege incluso contra un new hecho dentro de esta misma clase.
    private ConversorUnidades() {
        throw new UnsupportedOperationException(
                "ConversorUnidades es una clase utilitaria y no debe instanciarse.");
    }
 
    // Metodo STATIC: pertenece a la clase, no a un objeto.
    // Se invoca como ConversorUnidades.kilometrosAMillas(10)
    public static double kilometrosAMillas(double km) {
        return km * FACTOR_KM_A_MILLAS;
    }
 
    // Metodo STATIC: formula (celsius * 9/5) + 32.
    // Ojo: se escribe 9.0/5.0 para forzar division decimal.
    // Si se escribiera 9/5, Java haria division entera y daria 1.
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
