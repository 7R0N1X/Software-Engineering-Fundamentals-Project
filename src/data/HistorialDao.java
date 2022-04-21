package data;

import domain.Historial;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 7R0N1X
 */

public class HistorialDao {

    private static final String SQL_SELECT = "SELECT * FROM historial";
    private static final String SQL_INSERT = "INSERT INTO historial(usuario_id) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE historial SET usuario_id = ? WHERE id_historial";
    private static final String SQL_DELETE = "DELETE FROM historial WHERE id_historial = ?";

    public List<Historial> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Historial historial = null;
        List<Historial> historiales = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idHistorial = rs.getString(1);
                String idUsuario = rs.getString(2);
                historial = new Historial(idHistorial, idUsuario);
                historiales.add(historial);
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
        return historiales;
    }

    public int insert(Historial historial) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, historial.getIdUsuario());
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

    public int update(Historial historial) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, historial.getIdUsuario());
            stmt.setString(2, historial.getIdHistorial());
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

    public int delete(Historial historial) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, historial.getIdHistorial());
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

    public String consultarHistorial(String identificación) {
        String historial = "";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT id_historial FROM historial WHERE usuario_id LIKE '%" + identificación + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                historial = rs.getString(1);
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
        return historial;
    }
}
