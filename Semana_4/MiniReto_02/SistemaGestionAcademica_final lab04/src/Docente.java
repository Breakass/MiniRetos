public class Docente {

    private String nombre;
    private String departamento;

    // Constructor vacío
    public Docente() {
    }

    // Constructor con datos
    public Docente(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void dictarCurso(Curso curso) {
        System.out.println(nombre + " dicta el curso " + curso.getNombre() + ".");
    }
}