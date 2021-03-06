/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.view;

import appguibd.control.UsuarioControl;
import appguibd.dao.UsuarioJDBCDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import appguibd.model.Usuario;
import javax.swing.JFrame;

/**
 *
 * @author Augusto
 */
public class TelaLogin extends javax.swing.JFrame {

    private UsuarioControl uc; //Controlador de Usuário

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        this(null);
    }

    public TelaLogin(String titulo) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.uc = new UsuarioControl(new UsuarioJDBCDAO());
        if (titulo != null) {
            this.setTitle(titulo);
        }
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtextUsuario = new javax.swing.JTextField();
        jbtoLogin = new javax.swing.JButton();
        jbtoCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblErro = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        jbtoLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtoLogin.setText("Login");
        jbtoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtoLoginActionPerformed(evt);
            }
        });

        jbtoCadastrar.setText("Cadastrar");
        jbtoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtoCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Augusto\\Documents\\IFAL\\logo-ifal.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Login");

        jlblErro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErro.setForeground(new java.awt.Color(255, 51, 0));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtoCadastrar)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtoLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtextUsuario)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jlblErro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jlblErro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtoCadastrar)
                    .addComponent(jbtoLogin))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtoLoginActionPerformed
        Usuario user = null;
        try {

            user = uc.login(jtextUsuario.getText(), String.valueOf(jPasswordField1.getPassword()));

            if (user == null) {
                mensagemTela("Usuário não encontrado. Verifique o nome e senha.", true);
            } else {
                mensagemTela("Usuário " + user.getNomeUsuario() + " autenticado.", false);
            }
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            mensagemTela(ex.getMessage(), true);
        }

    }//GEN-LAST:event_jbtoLoginActionPerformed

    private void jbtoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtoCadastrarActionPerformed

        try {
            Usuario user = new Usuario(jtextUsuario.getText(), String.valueOf(jPasswordField1.getPassword()));
            uc.salvar(user);
            mensagemTela("Usuário " + user.getNomeUsuario() + " cadastrado.", false);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            mensagemTela(ex.getMessage(), true);
        }
    }//GEN-LAST:event_jbtoCadastrarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    private void mensagemTela(String m, boolean erro) {
        int tipoMsg;
        if (erro) {
            jlblErro.setForeground(Color.RED);
            tipoMsg = JOptionPane.ERROR_MESSAGE;
        } else {
            jlblErro.setForeground(Color.GREEN);
            tipoMsg = JOptionPane.INFORMATION_MESSAGE;
        }
        jlblErro.setText(m);
        System.out.println(m);
        JOptionPane.showMessageDialog(this.getContentPane(), m, "AppGUIBD - Mensagem", tipoMsg);

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtoCadastrar;
    private javax.swing.JButton jbtoLogin;
    private javax.swing.JLabel jlblErro;
    private javax.swing.JTextField jtextUsuario;
    // End of variables declaration//GEN-END:variables
}
