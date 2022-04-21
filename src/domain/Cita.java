package domain;

import data.CitaDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 7R0N1X
 */

public class Cita {

    private String idCita, fechaHora, idUsuario, motivo;

    public Cita() {
    }

    public Cita(String idCita) {
        this.idCita = idCita;
    }

    public Cita(String fechaHora, String idUsuario, String motivo) {
        this.fechaHora = fechaHora;
        this.idUsuario = idUsuario;
        this.motivo = motivo;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + idCita + ", fechaHora=" + fechaHora + ", idUsuario=" + idUsuario + ", motivo=" + motivo + '}';
    }

    public void consultarCita(String identificación) {
        CitaDao citaDao = new CitaDao();
        List<String> a = citaDao.consultarCita(identificación);
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario " + views.ActualizarHistorial.JTF_Nombres.getText()
                    + " " + views.ActualizarHistorial.JTF_Apellidos.getText() + " no tiene cita agendada en el sistema.");
            a = null;
        } else {
            String fechaHora = a.get(0).toString();
            String motivo = a.get(1).toString();
            JOptionPane.showMessageDialog(null, "El usuario " + views.ActualizarHistorial.JTF_Nombres.getText()
                    + " " + views.ActualizarHistorial.JTF_Apellidos.getText() + " tiene cita agendada en el sistema.\n"
                    + "Fecha y hora: " + fechaHora
                    + "\nMotivo: " + motivo);
            a = null;
        }
    }
}
