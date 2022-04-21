package data;

import domain.Seguimiento;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 7R0N1X
 */

public class SeguimientoDao {

    private static final String SQL_SELECT = "SELECT * FROM seguimiento";
    private static final String SQL_INSERT = "INSERT INTO seguimiento(historial_id, fecha_seguimiento, descripcion) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE seguimiento SET fecha_seguimiento = ?, descripcion = ? WHERE historial_id = ?";
    private static final String SQL_DELETE = "DELETE FROM seguimiento WHERE historial_id = ?";

    public List<Seguimiento> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Seguimiento seguimiento = null;
        List<Seguimiento> seguimientos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idHistorial = rs.getString(1);
                String fechaSeguimiento = rs.getString(2);
                String descripcionSeguimiento = rs.getString(3);
                seguimiento = new Seguimiento(idHistorial, fechaSeguimiento, descripcionSeguimiento);
                seguimientos.add(seguimiento);
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
        return seguimientos;
    }

    public int insert(Seguimiento seguimiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, seguimiento.getIdHistorial());
            stmt.setString(2, seguimiento.getFechaSeguimiento());
            stmt.setString(3, seguimiento.getDescripciónSeguimiento());
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

    public int update(Seguimiento seguimiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, seguimiento.getFechaSeguimiento());
            stmt.setString(2, seguimiento.getDescripciónSeguimiento());
            stmt.setString(3, seguimiento.getIdHistorial());
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

    public int delete(Seguimiento seguimiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, seguimiento.getIdHistorial());
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
}
