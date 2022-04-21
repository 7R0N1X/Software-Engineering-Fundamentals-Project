package views;

import data.DiagnosticoDao;
import data.TratamientoDao;
import data.UsuarioDao;
import domain.Cita;
import domain.Diagnostico;
import domain.Historial;
import domain.Tratamiento;
import domain.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 7R0N1X
 */

public class ActualizarHistorial extends javax.swing.JFrame {

    public static Login ventanaLogin;
    Usuario usuario = new Usuario();

    public ActualizarHistorial() {
        initComponents();
        this.setTitle("Medical Center");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JP_Datos.setVisible(false);
        JP_Registros.setVisible(false);
        JP_Historial.setVisible(false);
        mostrarRegistros();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("views/img/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Registros = new javax.swing.JPanel();
        JSP_Files = new javax.swing.JScrollPane();
        JT_Registros = new javax.swing.JTable();
        JP_Datos = new javax.swing.JPanel();
        JL_DocumentoIdentificación = new javax.swing.JLabel();
        JTF_DocumentoIdentificación = new javax.swing.JTextField();
        JL_Nombres = new javax.swing.JLabel();
        JTF_Nombres = new javax.swing.JTextField();
        JL_Apellidos = new javax.swing.JLabel();
        JTF_Apellidos = new javax.swing.JTextField();
        JL_Nacimiento = new javax.swing.JLabel();
        JTF_Nacimiento = new javax.swing.JTextField();
        JL_Telefono = new javax.swing.JLabel();
        JTF_Telefono = new javax.swing.JTextField();
        JL_Email = new javax.swing.JLabel();
        JTF_Email = new javax.swing.JTextField();
        JP_Historial = new javax.swing.JPanel();
        JL_Diagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_Diagnostico = new javax.swing.JTextArea();
        JL_Tratamiento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTA_Tratamiento = new javax.swing.JTextArea();
        JB_RegistrarDiagnostico = new javax.swing.JButton();
        JB_RegistrarTratamiento = new javax.swing.JButton();
        JL_NúmeroHistorialText = new javax.swing.JLabel();
        JL_NúmeroHistorial = new javax.swing.JLabel();
        JB_Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        JMB_Menu = new javax.swing.JMenuBar();
        JM_ActualizarHistorial = new javax.swing.JMenu();
        JMI_ConsultarUsuario = new javax.swing.JMenuItem();
        JMI_ConsultarHistorial = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        JT_Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Apellidos", "Nacimiento", "Teléfono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_RegistrosMouseClicked(evt);
            }
        });
        JSP_Files.setViewportView(JT_Registros);
        if (JT_Registros.getColumnModel().getColumnCount() > 0) {
            JT_Registros.getColumnModel().getColumn(0).setPreferredWidth(30);
            JT_Registros.getColumnModel().getColumn(1).setPreferredWidth(30);
            JT_Registros.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout JP_RegistrosLayout = new javax.swing.GroupLayout(JP_Registros);
        JP_Registros.setLayout(JP_RegistrosLayout);
        JP_RegistrosLayout.setHorizontalGroup(
            JP_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSP_Files, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        JP_RegistrosLayout.setVerticalGroup(
            JP_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSP_Files)
        );

        JP_Datos.setBackground(new java.awt.Color(230, 230, 230));

        JL_DocumentoIdentificación.setText("Documento de identificación:");

        JTF_DocumentoIdentificación.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTF_DocumentoIdentificaciónKeyReleased(evt);
            }
        });

        JL_Nombres.setText("Nombres:");

        JTF_Nombres.setEditable(false);

        JL_Apellidos.setText("Apellidos:");

        JTF_Apellidos.setEditable(false);

        JL_Nacimiento.setText("Fecha de nacimiento:");

        JTF_Nacimiento.setEditable(false);

        JL_Telefono.setText("Teléfono:");

        JTF_Telefono.setEditable(false);

        JL_Email.setText("Email:");

        JTF_Email.setEditable(false);

        JP_Historial.setBackground(new java.awt.Color(230, 230, 230));

        JL_Diagnostico.setText("Diagnóstico:");

        JTA_Diagnostico.setColumns(20);
        JTA_Diagnostico.setRows(5);
        jScrollPane1.setViewportView(JTA_Diagnostico);

        JL_Tratamiento.setText("Tratamiento:");

        JTA_Tratamiento.setColumns(20);
        JTA_Tratamiento.setRows(5);
        jScrollPane2.setViewportView(JTA_Tratamiento);

        JB_RegistrarDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/registrar-diagnostico.png"))); // NOI18N
        JB_RegistrarDiagnostico.setText("Registrar diagnostico");
        JB_RegistrarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarDiagnosticoActionPerformed(evt);
            }
        });

        JB_RegistrarTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/registrar-tratamiento.png"))); // NOI18N
        JB_RegistrarTratamiento.setText("Registrar tratamiento");
        JB_RegistrarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarTratamientoActionPerformed(evt);
            }
        });

        JL_NúmeroHistorialText.setText("Número de historial:");

        JB_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/salir.png"))); // NOI18N
        JB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_HistorialLayout = new javax.swing.GroupLayout(JP_Historial);
        JP_Historial.setLayout(JP_HistorialLayout);
        JP_HistorialLayout.setHorizontalGroup(
            JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(JP_HistorialLayout.createSequentialGroup()
                .addComponent(JB_RegistrarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_RegistrarTratamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP_HistorialLayout.createSequentialGroup()
                .addGroup(JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_HistorialLayout.createSequentialGroup()
                        .addComponent(JL_NúmeroHistorialText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_NúmeroHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JP_HistorialLayout.setVerticalGroup(
            JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_HistorialLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_NúmeroHistorialText)
                    .addComponent(JL_NúmeroHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(JL_Diagnostico)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JL_Tratamiento)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JB_RegistrarDiagnostico)
                        .addComponent(JB_RegistrarTratamiento)))
                .addContainerGap())
        );

        javax.swing.GroupLayout JP_DatosLayout = new javax.swing.GroupLayout(JP_Datos);
        JP_Datos.setLayout(JP_DatosLayout);
        JP_DatosLayout.setHorizontalGroup(
            JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_DocumentoIdentificación)
                    .addComponent(JTF_Nombres)
                    .addComponent(JTF_Apellidos)
                    .addComponent(JTF_Email)
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                .addComponent(JL_Nacimiento)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JTF_Nacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Telefono)))
                    .addComponent(jSeparator1)
                    .addComponent(JP_Historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_Apellidos)
                    .addComponent(JL_Email)
                    .addComponent(JL_DocumentoIdentificación)
                    .addComponent(JL_Nombres))
                .addContainerGap())
        );
        JP_DatosLayout.setVerticalGroup(
            JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_DocumentoIdentificación)
                .addGap(1, 1, 1)
                .addComponent(JTF_DocumentoIdentificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_Nombres)
                .addGap(1, 1, 1)
                .addComponent(JTF_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(JL_Apellidos)
                .addGap(1, 1, 1)
                .addComponent(JTF_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_Nacimiento)
                            .addComponent(JL_Telefono))
                        .addGap(1, 1, 1)
                        .addComponent(JTF_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_Email)
                .addGap(1, 1, 1)
                .addComponent(JTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JP_Historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        JM_ActualizarHistorial.setText("Actualizar Historial");

        JMI_ConsultarUsuario.setText("Consultar Usuario");
        JMI_ConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ConsultarUsuarioActionPerformed(evt);
            }
        });
        JM_ActualizarHistorial.add(JMI_ConsultarUsuario);

        JMI_ConsultarHistorial.setText("Consultar Historial");
        JMI_ConsultarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ConsultarHistorialActionPerformed(evt);
            }
        });
        JM_ActualizarHistorial.add(JMI_ConsultarHistorial);

        JMB_Menu.add(JM_ActualizarHistorial);

        setJMenuBar(JMB_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JP_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_Registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JP_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_ConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ConsultarUsuarioActionPerformed
        if (JMI_ConsultarUsuario.isEnabled() == true) {
            JP_Datos.setVisible(true);
            JP_Registros.setVisible(true);
        } else if (JMI_ConsultarUsuario.isEnabled() == false) {
            JP_Datos.setVisible(false);
            JP_Registros.setVisible(false);
        }
    }//GEN-LAST:event_JMI_ConsultarUsuarioActionPerformed

    private void JMI_ConsultarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ConsultarHistorialActionPerformed
        if (JTF_DocumentoIdentificación.getText().trim().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Primeramente consulte la información del usuario.");
        } else if (JP_Datos.isVisible() && JP_Registros.isVisible() && JMI_ConsultarHistorial.isEnabled() == true) {
            JP_Historial.setVisible(true);
            Historial historial = new Historial();
            historial.consultarHistorial(JTF_DocumentoIdentificación.getText().toString());
        } else {
            JP_Historial.setVisible(false);
        }
    }//GEN-LAST:event_JMI_ConsultarHistorialActionPerformed

    private void JTF_DocumentoIdentificaciónKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_DocumentoIdentificaciónKeyReleased
        if (JTF_DocumentoIdentificación.getText().equals("")) {
            limpiarCampos();
            JP_Historial.setVisible(false);
        } else {
            usuario.consultarUsuario(JTF_DocumentoIdentificación.getText());
        }
    }//GEN-LAST:event_JTF_DocumentoIdentificaciónKeyReleased

    private void JT_RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_RegistrosMouseClicked
        int selección = JT_Registros.rowAtPoint(evt.getPoint());
        JTF_DocumentoIdentificación.setText((String) JT_Registros.getValueAt(selección, 0));
        JTF_Nombres.setText((String) JT_Registros.getValueAt(selección, 1));
        JTF_Apellidos.setText((String) JT_Registros.getValueAt(selección, 2));
        JTF_Nacimiento.setText((String) JT_Registros.getValueAt(selección, 3));
        JTF_Telefono.setText((String) JT_Registros.getValueAt(selección, 4));
        JTF_Email.setText((String) JT_Registros.getValueAt(selección, 5));
        Cita cita = new Cita();
        cita.consultarCita((String) JTF_DocumentoIdentificación.getText());
    }//GEN-LAST:event_JT_RegistrosMouseClicked

    private void JB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SalirActionPerformed
        JP_Datos.setVisible(false);
        JP_Historial.setVisible(false);
        JP_Registros.setVisible(false);
        limpiarCampos();
    }//GEN-LAST:event_JB_SalirActionPerformed

    private void JB_RegistrarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarDiagnosticoActionPerformed
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        DiagnosticoDao diagnisticoDao = new DiagnosticoDao();
        Diagnostico diagnosticoUpdate = new Diagnostico(JL_NúmeroHistorial.getText().toString(), fecha, JTA_Diagnostico.getText().toString());
        int n = diagnisticoDao.update(diagnosticoUpdate);
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Diagnostico registrado satisfactoriamente al paciente \n"
                    + JTF_Nombres.getText().toString() + " " + JTF_Apellidos.getText().toString() + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al querer registrar el diagnostico"
                    + " al paciente \n" + JTF_Nombres.getText().toString() + " " + JTF_Apellidos.getText().toString() + ".");
        }
    }//GEN-LAST:event_JB_RegistrarDiagnosticoActionPerformed

    private void JB_RegistrarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarTratamientoActionPerformed
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        TratamientoDao tratamientoDao = new TratamientoDao();
        Tratamiento tratamientoUpdate = new Tratamiento(JL_NúmeroHistorial.getText().toString(), fecha, JTA_Tratamiento.getText().toString());
        int n = tratamientoDao.update(tratamientoUpdate);
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Tratamiento registrado satisfactoriamente al paciente \n"
                    + JTF_Nombres.getText().toString() + " " + JTF_Apellidos.getText().toString() + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al querer registrar el tratamiento"
                    + " al paciente \n" + JTF_Nombres.getText().toString() + " " + JTF_Apellidos.getText().toString() + ".");
        }
    }//GEN-LAST:event_JB_RegistrarTratamientoActionPerformed

    public void limpiarCampos() {
        JTF_DocumentoIdentificación.setText("");
        JTF_Nombres.setText("");
        JTF_Apellidos.setText("");
        JTF_Nacimiento.setText("");
        JTF_Telefono.setText("");
        JTF_Email.setText("");
        JL_NúmeroHistorial.setText("");
        JTA_Diagnostico.setText("");
        JTA_Tratamiento.setText("");
        JT_Registros.clearSelection();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActualizarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new ActualizarHistorial().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ActualizarHistorial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ActualizarHistorial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ActualizarHistorial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ActualizarHistorial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    public void mostrarRegistros() {
        UsuarioDao usuarioDao = new UsuarioDao();
        DefaultTableModel modelo = usuarioDao.mostrarRegistros();
        JT_Registros.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_RegistrarDiagnostico;
    private javax.swing.JButton JB_RegistrarTratamiento;
    private javax.swing.JButton JB_Salir;
    private javax.swing.JLabel JL_Apellidos;
    private javax.swing.JLabel JL_Diagnostico;
    private javax.swing.JLabel JL_DocumentoIdentificación;
    private javax.swing.JLabel JL_Email;
    private javax.swing.JLabel JL_Nacimiento;
    private javax.swing.JLabel JL_Nombres;
    public static javax.swing.JLabel JL_NúmeroHistorial;
    public static javax.swing.JLabel JL_NúmeroHistorialText;
    private javax.swing.JLabel JL_Telefono;
    private javax.swing.JLabel JL_Tratamiento;
    private javax.swing.JMenuBar JMB_Menu;
    private javax.swing.JMenuItem JMI_ConsultarHistorial;
    private javax.swing.JMenuItem JMI_ConsultarUsuario;
    private javax.swing.JMenu JM_ActualizarHistorial;
    private javax.swing.JPanel JP_Datos;
    private javax.swing.JPanel JP_Historial;
    private javax.swing.JPanel JP_Registros;
    private javax.swing.JScrollPane JSP_Files;
    public static javax.swing.JTextArea JTA_Diagnostico;
    public static javax.swing.JTextArea JTA_Tratamiento;
    public static javax.swing.JTextField JTF_Apellidos;
    public static javax.swing.JTextField JTF_DocumentoIdentificación;
    private javax.swing.JTextField JTF_Email;
    private javax.swing.JTextField JTF_Nacimiento;
    public static javax.swing.JTextField JTF_Nombres;
    private javax.swing.JTextField JTF_Telefono;
    public static javax.swing.JTable JT_Registros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
