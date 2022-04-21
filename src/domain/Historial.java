package domain;

import data.DiagnosticoDao;
import data.HistorialDao;
import data.TratamientoDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static views.ActualizarHistorial.JL_NúmeroHistorial;
import static views.ActualizarHistorial.JTF_Apellidos;
import static views.ActualizarHistorial.JTF_Nombres;

/**
 *
 * @author 7R0N1X
 */
public class Historial {

    private String idHistorial, idUsuario;

    public Historial() {
    }

    public Historial(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Historial(String idHistorial, String idUsuario) {
        this.idHistorial = idHistorial;
        this.idUsuario = idUsuario;
    }

    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistorial=" + idHistorial + ", idUsuario=" + idUsuario + '}';
    }

    public void consultarHistorial(String identificación) {
        HistorialDao historialDao = new HistorialDao();
        DiagnosticoDao diagnosticoDao = new DiagnosticoDao();
        TratamientoDao tratamientoDao = new TratamientoDao();
        String a = historialDao.consultarHistorial(identificación);
        if (a.isEmpty()) {
            // Crea historial
            JOptionPane.showMessageDialog(null, "El usuario: " + JTF_Nombres.getText() + " " + JTF_Apellidos.getText()
                    + " no tiene un historial registrado.\n"
                    + "El sistema automaticamente le asignará un número de historial.");
            Historial nuevoHistorial = new Historial(views.ActualizarHistorial.JTF_DocumentoIdentificación.getText().toString());
            historialDao.insert(nuevoHistorial);
            consultarHistorial(identificación);
        } else {
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            views.ActualizarHistorial.JL_NúmeroHistorial.setText(a);

            // Crea diagnostico
            Diagnostico diagnostico = new Diagnostico(JL_NúmeroHistorial.getText().toString(), fecha, " ");
            diagnosticoDao.insert(diagnostico);

            // Crea tratamiento
            Tratamiento tratamiento = new Tratamiento(JL_NúmeroHistorial.getText().toString(), fecha, " ");
            tratamientoDao.insert(tratamiento);

            // Muestra diagnostico
            Diagnostico mostrarDiagnostico = new Diagnostico();
            mostrarDiagnostico.mostrarDiagnostico(JL_NúmeroHistorial.getText().toString());

            // Muestra tratamiento
            Tratamiento mostrarTratamiento = new Tratamiento();
            mostrarTratamiento.mostrarTratamiento(JL_NúmeroHistorial.getText().toString());
        }
    }
}
