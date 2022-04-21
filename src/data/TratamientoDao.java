package data;

import domain.Tratamiento;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 7R0N1X
 */

public class TratamientoDao {

    private static final String SQL_SELECT = "SELECT * FROM tratamiento";
    private static final String SQL_INSERT = "INSERT INTO tratamiento(historial_id, fecha_tratamiento, descripcion_tratamiento) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tratamiento SET fecha_tratamiento = ?, descripcion_tratamiento = ? WHERE historial_id = ?";
    private static final String SQL_DELETE = "DELETE FROM tratamiento WHERE historial_id = ?";

    public List<Tratamiento> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Tratamiento tratamiento = null;
        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idHistorial = rs.getString(1);
                String fechaTratamiento = rs.getString(2);
                String descripcionTratamiento = rs.getString(3);
                tratamiento = new Tratamiento(idHistorial, fechaTratamiento, descripcionTratamiento);
                tratamientos.add(tratamiento);
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
        return tratamientos;
    }

    public int insert(Tratamiento tratamiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, tratamiento.getIdHistorial());
            stmt.setString(2, tratamiento.getFechaTratamiento());
            stmt.setString(3, tratamiento.getDescipciónTratamiento());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
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

    public int update(Tratamiento tratamiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, tratamiento.getFechaTratamiento());
            stmt.setString(2, tratamiento.getDescipciónTratamiento());
            stmt.setString(3, tratamiento.getIdHistorial());
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

    public int delete(Tratamiento tratamiento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, tratamiento.getIdHistorial());
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
    
    public String mostrarTratamiento(String idHistorial) {
        String tratamiento = "";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT CONCAT(fecha_tratamiento, \" \", descripcion_tratamiento) AS diagnostico FROM tratamiento WHERE historial_id LIKE '%" + idHistorial + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                tratamiento = rs.getString(1);
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
        return tratamiento;
    }
}
