package domain;

import data.DiagnosticoDao;

/**
 *
 * @author 7R0N1X
 */

public class Diagnostico {

    private String idHistorial, fechaDiagnostico, resultadoDiagnostico;

    public Diagnostico() {
    }

    public Diagnostico(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Diagnostico(String idHistorial, String fechaDiagnostico, String resultadoDiagnostico) {
        this.idHistorial = idHistorial;
        this.fechaDiagnostico = fechaDiagnostico;
        this.resultadoDiagnostico = resultadoDiagnostico;
    }

    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getResultadoDiagnostico() {
        return resultadoDiagnostico;
    }

    public void setResultadoDiagnostico(String resultadoDiagnostico) {
        this.resultadoDiagnostico = resultadoDiagnostico;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idHistorial=" + idHistorial + ", fechaDiagnostico=" + fechaDiagnostico + ", resultadoDiagnostico=" + resultadoDiagnostico + '}';
    }
    
    public void mostrarDiagnostico(String idHistorial){
        DiagnosticoDao diagnosticoDao = new DiagnosticoDao();
        String a = diagnosticoDao.registrarDiagnostico(idHistorial);
        views.ActualizarHistorial.JTA_Diagnostico.setText(a);
    }
}
