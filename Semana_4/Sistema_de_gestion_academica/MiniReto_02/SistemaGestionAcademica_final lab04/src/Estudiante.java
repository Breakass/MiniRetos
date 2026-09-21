import java.util.Date;

public class Estudiante {

    private String codigo;
    private String nombre;
    private Date fechaNacimiento;
    private String carrera;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con datos principales
    public Estudiante(String codigo, String nombre, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void matricularse(Curso curso) {
        System.out.println(nombre + " se matricula en " + curso.getNombre() + ".");
    }

    public void consultarProgreso() {
        System.out.println(nombre + " consulta su progreso academico.");
    }
}