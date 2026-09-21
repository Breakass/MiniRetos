public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private int nivelDificultad;

    // Constructor vacío
    public Curso() {
    }

    // Constructor con datos
    public Curso(String codigo, String nombre, int creditos, int nivelDificultad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.nivelDificultad = nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean verificarPrerequisitos() {
        System.out.println("Verificando prerrequisitos del curso " + nombre);
        return true;
    }

    public void agregarPrerequisito(Curso curso) {
        System.out.println(curso.getNombre() + " es prerrequisito de " + nombre);
    }
}