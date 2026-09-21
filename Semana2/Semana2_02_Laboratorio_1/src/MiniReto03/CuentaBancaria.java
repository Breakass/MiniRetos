/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniReto03;

/**
 *
 * @author herre
 */
import java.util.ArrayList;
 
public class CuentaBancaria {
 
    private String titular;
    private double saldo;
 
    // Historial interno: cada movimiento queda guardado como una Transaccion
    private ArrayList<Transaccion> historial;
 
    // Atributo STATIC: una sola copia compartida por TODAS las cuentas.
    // Sirve para numerar los movimientos del banco completo.
    private static int totalMovimientosBanco = 0;
 
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }
 
    // ====================================================================
    // CLASE ANIDADA NO ESTATICA (inner class)
    //
    // Justificacion de la eleccion:
    // Una Transaccion no tiene sentido por si sola: siempre pertenece a la
    // cuenta que la genero. Al ser NO estatica, cada Transaccion queda
    // ligada a la instancia de CuentaBancaria que la creo y puede leer
    // directamente sus atributos de instancia (saldo, titular) sin que se
    // los pasemos por parametro. Eso se aprovecha abajo en
    // saldoResultante y en describir().
    //
    // Si la hicieramos static, tendriamos que pasarle el saldo y el
    // titular explicitamente en el constructor, porque una clase anidada
    // estatica no conoce ninguna instancia de la clase externa.
    // ====================================================================
    public class Transaccion {
 
        private String tipo;              // "DEPOSITO" o "RETIRO"
        private double monto;
        private double saldoResultante;
        private int numeroMovimiento;
 
        public Transaccion(String tipo, double monto) {
            this.tipo = tipo;
            this.monto = monto;
 
            // Acceso directo al atributo de la instancia externa:
            // esto es lo que permite ser una clase anidada NO estatica
            this.saldoResultante = saldo;
 
            totalMovimientosBanco++;
            this.numeroMovimiento = totalMovimientosBanco;
        }
 
        public String describir() {
            return String.format("#%d | %-9s | Monto: S/ %8.2f | Saldo: S/ %8.2f | Titular: %s",
                    numeroMovimiento, tipo, monto, saldoResultante, titular);
        }
    }
 
    // ====================================================================
 
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("[AVISO] El monto a depositar debe ser mayor que cero.");
            return;
        }
 
        saldo += monto;
 
        // Se instancia la clase anidada DESDE dentro de la clase externa,
        // por eso basta con "new Transaccion(...)"
        historial.add(new Transaccion("DEPOSITO", monto));
 
        System.out.printf("Deposito realizado: S/ %.2f | Saldo actual: S/ %.2f%n", monto, saldo);
    }
 
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("[AVISO] El monto a retirar debe ser mayor que cero.");
            return;
        }
 
        // Validacion: se informa el problema sin lanzar excepcion,
        // asi la aplicacion sigue corriendo
        if (monto > saldo) {
            System.out.printf("[RECHAZADO] Saldo insuficiente. Solicitado: S/ %.2f | Disponible: S/ %.2f%n",
                    monto, saldo);
            return;
        }
 
        saldo -= monto;
        historial.add(new Transaccion("RETIRO", monto));
 
        System.out.printf("Retiro realizado: S/ %.2f | Saldo actual: S/ %.2f%n", monto, saldo);
    }
 
    public void mostrarHistorial() {
        System.out.println();
        System.out.println("=== HISTORIAL DE " + titular + " ===");
 
        if (historial.isEmpty()) {
            System.out.println("(sin movimientos registrados)");
            return;
        }
 
        for (Transaccion t : historial) {
            System.out.println(t.describir());
        }
 
        System.out.printf("Saldo final: S/ %.2f | Movimientos en esta cuenta: %d%n",
                saldo, historial.size());
        System.out.println();
    }
 
    public static void main(String[] args) {
 
        CuentaBancaria cuenta1 = new CuentaBancaria("Joan Herrera", 500.00);
 
        cuenta1.depositar(250.50);
        cuenta1.retirar(100.00);
        cuenta1.retirar(5000.00);   // caso rechazado: saldo insuficiente
        cuenta1.depositar(75.25);
        cuenta1.mostrarHistorial();
 
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 0.00);
        cuenta2.retirar(10.00);     // caso rechazado: cuenta en cero
        cuenta2.depositar(1200.00);
        cuenta2.mostrarHistorial();
 
        // El contador es static: se accede via la CLASE, no via un objeto,
        // y acumula los movimientos de las DOS cuentas
        System.out.println("Total de movimientos en el banco: " + totalMovimientosBanco);
    }
}
 
