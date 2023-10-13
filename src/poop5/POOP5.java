/*
 * Clase POOP5: Clase principal que contiene el método main para probar la funcionalidad de las clases Alumno y Fecha.
 */
package poop5;

/**
 * La clase POOP5 es la clase principal que contiene el método main para probar la funcionalidad de las clases Alumno y Fecha.
 */
public class POOP5 {
    
    /**
     * Método principal (main) para probar las clases Alumno y Fecha.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Creación de un objeto Alumno llamado alumno1 y configuración de sus atributos.
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Pedro");
        alumno1.setApellido("Torres");

        // Creación de un objeto Fecha llamado fecha y configuración de la fecha.
        Fecha fecha;
        fecha = new Fecha(29, 9, 2023);

        // Creación de un objeto Alumno llamado alumno2 con argumentos y una instancia de Fecha.
        Alumno alumno2 = new Alumno("Pedro", "Torres", "Computación", "Facultad de Ingeniería", 4, fecha);

        // Obtención de una representación de cadena de alumno1 y su impresión.
        String var = alumno1.toString();
        System.out.println(var);

        // Impresión de la representación de cadena de alumno1 y alumno2.
        System.out.println(alumno1.toString());
        System.out.println(alumno2);
        // TODO code application logic here
    }
}
