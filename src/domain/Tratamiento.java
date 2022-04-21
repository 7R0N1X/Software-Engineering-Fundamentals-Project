package domain;

import data.TratamientoDao;

/**
 *
 * @author 7R0N1X
 */

public class Tratamiento {

    private String idHistorial, fechaTratamiento, descipciónTratamiento;

    public Tratamiento() {
    }

    public Tratamiento(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Tratamiento(String idHistorial, String fechaTratamiento, String descipciónTratamiento) {
        this.idHistorial = idHistorial;
        this.fechaTratamiento = fechaTratamiento;
        this.descipciónTratamiento = descipciónTratamiento;
    }

    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getFechaTratamiento() {
        return fechaTratamiento;
    }

    public void setFechaTratamiento(String fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    public String getDescipciónTratamiento() {
        return descipciónTratamiento;
    }

    public void setDescipciónTratamiento(String descipciónTratamiento) {
        this.descipciónTratamiento = descipciónTratamiento;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "idHistorial=" + idHistorial + ", fechaTratamiento=" + fechaTratamiento + ", descipci\u00f3nTratamiento=" + descipciónTratamiento + '}';
    }
    
    public void mostrarTratamiento(String idHistorial){
        TratamientoDao tratamientoDao = new TratamientoDao();
        String a = tratamientoDao.mostrarTratamiento(idHistorial);
        views.ActualizarHistorial.JTA_Tratamiento.setText(a);
    }
}
