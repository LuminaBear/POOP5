/*
 * Clase Alumno: Representa un estudiante con atributos de nombre, apellido, carrera, escuela, semestre, fecha de nacimiento y métodos relacionados.
 */
package poop5;

/**
 * La clase Alumno representa a un estudiante con atributos como nombre, apellido, carrera, escuela, semestre, fecha de nacimiento y métodos relacionados.
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fNacimiento;

    // Constructor por defecto
    public Alumno() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param nombre     El nombre del estudiante.
     * @param apellido   El apellido del estudiante.
     * @param carrera    La carrera del estudiante.
     * @param escuela    La escuela a la que pertenece el estudiante.
     * @param semestre   El semestre en el que está el estudiante.
     * @param fNacimiento La fecha de nacimiento del estudiante (objeto de la clase Fecha).
     */
    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }

    // Métodos de obtención
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    // Métodos de configuración
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    // Métodos de acción
    public void dormir() {
        System.out.println("zzzzzzz");
    }

    public void comer() {
        System.out.println("niam niam");
    }

    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    public void trabajar() {
        System.out.println("Estoy chambeando");
    }

    public void jugar() {
        System.out.println("Estoy jugando minecraft");
    }

    /**
     * Devuelve una representación de cadena del estudiante en un formato específico.
     *
     * @return Representación de cadena del estudiante.
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
}