package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame implements ActionListener {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar "
                + "El programa?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPas = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanelLogin.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 126, 41));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 37));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 34));

        txtPas.setText("123");
        txtPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasActionPerformed(evt);
            }
        });
        jPanelLogin.add(txtPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 160, -1));

        txtUser.setText("admin");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanelLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanelLogin.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 134, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fondo de login.jpg"))); // NOI18N
        jPanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed

        /*
        ingresar
         */
      

        String usr, password;
        usr = txtUser.getText();
        password = txtPas.getText();
        
        //Principal prin = new Principal();
        UsuarioView usar= new UsuarioView();
                 
        
        if (usr.equals("admin") && password.equals("123")) {
            usar.setVisible(true);
            jPanelLogin.setVisible(true);
           this.hide();
        } else {
            JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecta ");
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField txtPas;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if (evt.equals(ingresar)) {
            jPanelLogin.setVisible(false);
        }
    }
    
    
}
