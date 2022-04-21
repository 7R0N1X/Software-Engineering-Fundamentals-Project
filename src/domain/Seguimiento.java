package domain;

/**
 *
 * @author 7R0N1X
 */

public class Seguimiento {

    private String idHistorial, fechaSeguimiento, descripciónSeguimiento;

    public Seguimiento() {
    }

    public Seguimiento(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Seguimiento(String idHistorial, String fechaSeguimiento, String descripciónSeguimiento) {
        this.idHistorial = idHistorial;
        this.fechaSeguimiento = fechaSeguimiento;
        this.descripciónSeguimiento = descripciónSeguimiento;
    }

    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getFechaSeguimiento() {
        return fechaSeguimiento;
    }

    public void setFechaSeguimiento(String fechaSeguimiento) {
        this.fechaSeguimiento = fechaSeguimiento;
    }

    public String getDescripciónSeguimiento() {
        return descripciónSeguimiento;
    }

    public void setDescripciónSeguimiento(String descripciónSeguimiento) {
        this.descripciónSeguimiento = descripciónSeguimiento;
    }

    @Override
    public String toString() {
        return "Seguimiento{" + "idHistorial=" + idHistorial + ", fechaSeguimiento=" + fechaSeguimiento + ", descripci\u00f3nSeguimiento=" + descripciónSeguimiento + '}';
    }
}
