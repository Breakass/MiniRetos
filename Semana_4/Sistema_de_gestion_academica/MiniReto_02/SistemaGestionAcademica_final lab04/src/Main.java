public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTION ACADEMICA ===");
        System.out.println();

        // Crear objetos
        Estudiante estudiante = new Estudiante("EST001","Luis","Ingenieria");
    
        Curso curso = new Curso("POO101", "Programacion Orientada a Objetos", 4, 2);
        Curso prerrequisito = new Curso("PRO100", "Fundamentos de Programacion", 3, 1);
        Docente docente = new Docente("DOCENTE01","Sistemas");
        Mentor mentor = new Mentor();
        Coordinador coordinador = new Coordinador();
        PlanEstudio plan = new PlanEstudio();

        System.out.println("Objetos creados correctamente.");
        System.out.println();

        // Relaciones del diagrama UML
        docente.dictarCurso(curso);
        estudiante.matricularse(curso);
        mentor.asesorarEstudiante(estudiante);
        coordinador.supervisarDocente(docente);
        plan.agruparCurso(curso);
        curso.agregarPrerequisito(prerrequisito);

        System.out.println();

        // Otras operaciones
        estudiante.consultarProgreso();
        curso.verificarPrerequisitos();
        plan.controlarTransicion();

        System.out.println();
        System.out.println("=== SISTEMA INICIADO CORRECTAMENTE ===");
    }
}