package data;

import domain.Cita;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 7R0N1X
 */

public class CitaDao {

    private static final String SQL_SELECT = "SELECT * FROM cita";
    private static final String SQL_INSERT = "INSERT INTO cita(id_cita, fecha_hora, usuario_id, motivo_cita) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE cita SET fecha_hora = ?, usuario_id= ?, motivo_cita = ? WHERE id_cita = ?";
    private static final String SQL_DELETE = "DELETE FROM cita WHERE id_cita = ?";

    public List<Cita> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cita cita = null;
        List<Cita> citas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idCita = rs.getString(1);
                String fechaHora = rs.getString(2);
                String idUsuario = rs.getString(3);
                String motivoCita = rs.getString(4);
//                cita = new Cita(idCita, fechaHora, idUsuario, motivoCita);
//                citas.add(cita);
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
        return citas;
    }

    public int insert(Cita cita) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cita.getIdCita());
            stmt.setString(2, cita.getFechaHora());
            stmt.setString(3, cita.getIdUsuario());
            stmt.setString(4, cita.getMotivo());
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

    public int update(Cita cita) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cita.getFechaHora());
            stmt.setString(2, cita.getIdUsuario());
            stmt.setString(3, cita.getMotivo());
            stmt.setString(4, cita.getIdCita());
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

    public int delete(Cita cita) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, cita.getIdCita());
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

    public List<String> consultarCita(String identificación) {
        List<String> datosCita = new ArrayList<String>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT fecha_hora, motivo_cita FROM cita WHERE usuario_id LIKE '%" + identificación + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                datosCita.add(rs.getString(1));
                datosCita.add(rs.getString(2));
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
        return datosCita;
    }
}
