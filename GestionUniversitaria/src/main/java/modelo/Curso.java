package modelo;


/**
 *
 * @author paula
 */
public class Curso {
    
    private String nombreCurso;
    private String docenteEncargado;
    private int estudiantesMatriculados;
    private String materia;
    private int horarios;

    public Curso(String nombre, String docenteEncargado, int estudiantesMatriculados, String materia, int horarios) {
        this.nombreCurso = nombre;
        this.docenteEncargado = docenteEncargado;
        this.estudiantesMatriculados = estudiantesMatriculados;
        this.materia = materia;
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombreCurso;
    }

    public void setNombre(String nombre) {
        this.nombreCurso = nombre;
    }

    public String getDocenteEncargado() {
        return docenteEncargado;
    }

    public void setDocenteEncargado(String docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }

    public int getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public void setEstudiantesMatriculados(int estudiantesMatriculados) {
        this.estudiantesMatriculados = estudiantesMatriculados;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHorarios() {
        return horarios;
    }

    public void setHorarios(int horarios) {
        this.horarios = horarios;
    }
    
    
   
}
