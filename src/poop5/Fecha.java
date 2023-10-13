/*
 * Clase Fecha: Representa una fecha con atributos de día, mes y año.
 */

package poop5;

/**
 * La clase Fecha representa una fecha con atributos de día, mes y año.
 * Se pueden establecer y obtener los valores de día, mes y año, y proporciona una representación de cadena.
 */
public class Fecha {
    private int dia, mes, año;

    // Constructor por defecto
    public Fecha() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param año El año de la fecha.
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Métodos de configuración
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Métodos de obtención
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    /**
     * Devuelve una representación de cadena de la fecha en el formato "Fecha{dia, mes, año}".
     *
     * @return Representación de cadena de la fecha.
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + año + '}';
    }
}
