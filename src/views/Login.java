package views;

import data.UsuarioDao;
import domain.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author 7R0N1X
 */

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setTitle("Medical Center");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("views/img/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTF_Usuario = new RSMaterialComponent.RSTextFieldMaterial();
        JPF_Contraseña = new RSMaterialComponent.RSPasswordMaterial();
        JB_Entrar = new RSMaterialComponent.RSButtonMaterialOne();
        JCB_MostrarContraseña = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JL_NoRecuerdasTusCredenciales = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(2, 144, 203));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 144, 203));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEDICAL CENTER");

        JTF_Usuario.setForeground(new java.awt.Color(2, 144, 203));
        JTF_Usuario.setColorMaterial(new java.awt.Color(2, 144, 203));
        JTF_Usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JTF_Usuario.setPhColor(new java.awt.Color(2, 144, 203));
        JTF_Usuario.setPlaceholder("Usuario");
        JTF_Usuario.setSelectionColor(new java.awt.Color(2, 144, 203));

        JPF_Contraseña.setForeground(new java.awt.Color(2, 144, 203));
        JPF_Contraseña.setColorMaterial(new java.awt.Color(2, 144, 203));
        JPF_Contraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JPF_Contraseña.setPhColor(new java.awt.Color(2, 144, 203));
        JPF_Contraseña.setPlaceholder("Contraseña");
        JPF_Contraseña.setSelectionColor(new java.awt.Color(2, 144, 203));

        JB_Entrar.setBackground(new java.awt.Color(2, 144, 203));
        JB_Entrar.setText("ENTRAR");
        JB_Entrar.setBackgroundHover(new java.awt.Color(2, 144, 203));
        JB_Entrar.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        JB_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EntrarActionPerformed(evt);
            }
        });

        JCB_MostrarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        JCB_MostrarContraseña.setText("Mostrar contraseña");
        JCB_MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_MostrarContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Tu salud mi desafio, tu bienestar");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("mi compromiso.");

        JL_NoRecuerdasTusCredenciales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JL_NoRecuerdasTusCredenciales.setText("¿No recuerdas tus credenciales?");
        JL_NoRecuerdasTusCredenciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_NoRecuerdasTusCredenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_NoRecuerdasTusCredencialesMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright © Medical Center | Todos los derechos reservados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(JCB_MostrarContraseña)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JL_NoRecuerdasTusCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JTF_Usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                .addComponent(JPF_Contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(JB_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(JTF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JPF_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_MostrarContraseña)
                    .addComponent(JL_NoRecuerdasTusCredenciales))
                .addGap(30, 30, 30)
                .addComponent(JB_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCB_MostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_MostrarContraseñaActionPerformed
        char i = JPF_Contraseña.getEchoChar();
        if (JCB_MostrarContraseña.isSelected() == true) {
            JPF_Contraseña.setEchoChar((char) 0);
        } else if (JCB_MostrarContraseña.isSelected() == false) {
            JPF_Contraseña.setEchoChar('•');
        }
    }//GEN-LAST:event_JCB_MostrarContraseñaActionPerformed

    private void JB_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EntrarActionPerformed
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = new Usuario();
        String pass = new String(JPF_Contraseña.getPassword());
        if (!JTF_Usuario.getText().equals("") && !JPF_Contraseña.equals("")) {
            usuario.setEmail(JTF_Usuario.getText());
            usuario.setIdUsuario(JPF_Contraseña.getText());
            if (usuarioDao.login(usuario)) {
                ActualizarHistorial actualizarHistorial = new ActualizarHistorial();
                ActualizarHistorial.ventanaLogin = null;
                this.dispose();
                actualizarHistorial.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Las credenciales ingresadas son incorrectas.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus credenciales de acceso para continuar.");
        }
    }//GEN-LAST:event_JB_EntrarActionPerformed

    private void JL_NoRecuerdasTusCredencialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_NoRecuerdasTusCredencialesMouseClicked
        JOptionPane.showMessageDialog(null, "Para recuperar sus credenciales de acceso pongase en contacto"
                + "\ncon el equipo de soporte rmolina3147@utm.edu.ec");
    }//GEN-LAST:event_JL_NoRecuerdasTusCredencialesMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Login.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialOne JB_Entrar;
    private javax.swing.JCheckBox JCB_MostrarContraseña;
    private javax.swing.JLabel JL_NoRecuerdasTusCredenciales;
    private RSMaterialComponent.RSPasswordMaterial JPF_Contraseña;
    private RSMaterialComponent.RSTextFieldMaterial JTF_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
