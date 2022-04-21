package data;

import domain.Usuario;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 7R0N1X
 */

public class UsuarioDao {

    private static final String SQL_SELECT = "SELECT * FROM usuario WHERE roll = 'PACIENTE'";
    private static final String SQL_INSERT = "INSERT INTO usuario(id_usuario, apellidos, nombres, email, fecha_nacimiento, telefono, roll) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET apellidos = ?, nombres = ?, email = ?, fecha_nacimiento = ?, telefono = ?, roll = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    private static final String SQL_LOGIN = "SELECT id_usuario, apellidos, nombres, email, roll FROM usuario WHERE email = ? AND id_usuario = ? AND roll = 'MEDICO'";

    public List<Usuario> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idUsuario = rs.getString(1);
                String apellidos = rs.getString(2);
                String nombres = rs.getString(3);
                String email = rs.getString(4);
                String fechaNacimiento = rs.getString(5);
                String telefono = rs.getString(6);
                String roll = rs.getString(7);
                usuario = new Usuario(idUsuario, apellidos, nombres, email, fechaNacimiento, telefono, roll);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insert(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getApellidos());
            stmt.setString(3, usuario.getNombres());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getFechaNacimiento());
            stmt.setString(6, usuario.getTelefono());
            stmt.setString(7, usuario.getRoll());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int update(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getApellidos());
            stmt.setString(2, usuario.getNombres());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getFechaNacimiento());
            stmt.setString(5, usuario.getTelefono());
            stmt.setString(6, usuario.getRoll());
            stmt.setString(7, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public boolean login(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_LOGIN);
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getIdUsuario());
            rs = stmt.executeQuery();
            if (rs.next()) {
                if (usuario.getEmail().equals(rs.getString(4))) {
                    usuario.setIdUsuario(rs.getString(1));
                    usuario.setApellidos(rs.getString(2));
                    usuario.setNombres(rs.getString(3));
                    usuario.setRoll(rs.getString(5));
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return false;
    }

    public DefaultTableModel mostrarRegistros() {
        String[] nombresColumnas = {"Identificación", "Nombres", "Apellidos", "Nacimiento", "Teléfono", "Email"};
        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(3);
                registros[2] = rs.getString(2);
                registros[3] = rs.getString(5);
                registros[4] = rs.getString(6);
                registros[5] = rs.getString(4);
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return modelo;
    }

    public DefaultTableModel consultarUsuario(String identificación) {
        String[] nombresColumnas = {"Identificación", "Nombres", "Apellidos", "Nacimiento", "Teléfono", "Email"};
        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE roll = 'PACIENTE' and id_usuario LIKE '%" + identificación + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(3);
                registros[2] = rs.getString(2);
                registros[3] = rs.getString(5);
                registros[4] = rs.getString(6);
                registros[5] = rs.getString(4);
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return modelo;
    }
}
