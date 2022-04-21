package domain;

import data.UsuarioDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 7R0N1X
 */

public class Usuario {

    private String idUsuario, apellidos, nombres, email, fechaNacimiento, telefono, roll;

    public Usuario() {
    }

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String idUsuario, String apellidos, String nombres, String email, String fechaNacimiento, String telefono, String roll) {
        this.idUsuario = idUsuario;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.roll = roll;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", apellidos=" + apellidos + ", nombres=" + nombres + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", roll=" + roll + '}';
    }
    
    public void consultarUsuario(String identificación) {
        UsuarioDao usuarioDao = new UsuarioDao();
        DefaultTableModel modelo = usuarioDao.consultarUsuario(identificación);
        views.ActualizarHistorial.JT_Registros.setModel(modelo);
        modelo.fireTableDataChanged();
    }
}
