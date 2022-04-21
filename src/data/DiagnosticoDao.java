package data;

import domain.Diagnostico;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 7R0N1X
 */

public class DiagnosticoDao {

    private static final String SQL_SELECT = "SELECT * FROM diagnostico";
    private static final String SQL_INSERT = "INSERT INTO diagnostico(historial_id, fecha_diagnostico, resultado_diagnostico) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE diagnostico SET fecha_diagnostico = ?, resultado_diagnostico = ? WHERE historial_id = ?";
    private static final String SQL_DELETE = "DELETE FROM diagnostico WHERE historial_id = ?";

    public List<Diagnostico> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Diagnostico diagnostico = null;
        List<Diagnostico> diagnosticos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idHistorial = rs.getString(1);
                String fechaDiagnostico = rs.getString(2);
                String resultadoDiagnostico = rs.getString(3);
                diagnostico = new Diagnostico(idHistorial, fechaDiagnostico, resultadoDiagnostico);
                diagnosticos.add(diagnostico);
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
        return diagnosticos;
    }

    public int insert(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, diagnostico.getIdHistorial());
            stmt.setString(2, diagnostico.getFechaDiagnostico());
            stmt.setString(3, diagnostico.getResultadoDiagnostico());
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

    public int update(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, diagnostico.getFechaDiagnostico());
            stmt.setString(2, diagnostico.getResultadoDiagnostico());
            stmt.setInt(3, Integer.parseInt(diagnostico.getIdHistorial()));
            System.out.println("Actualizo entro al try");
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

    public int delete(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, diagnostico.getIdHistorial());
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

    public String registrarDiagnostico(String idHistorial) {
        String diagnostico = "";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT CONCAT(fecha_diagnostico, \" \", resultado_diagnostico) AS diagnostico FROM diagnostico WHERE historial_id LIKE '%" + idHistorial + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                diagnostico = rs.getString(1);
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
        return diagnostico;
    }
}
