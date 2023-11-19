/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UasPbo;
import Coding.Login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Masuk extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Masuk() {
        initComponents();
    }
     public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setBorder(null);
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 256, 170, 20));

        Password.setBorder(null);
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 160, 20));

        Login.setBackground(new java.awt.Color(0, 204, 0));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (4).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU"). createEntityManager();
       entityManager.getTransaction().begin();
       Query query = entityManager.createQuery("SELECT l FROM Login l");
        List<Login> results = query.getResultList();

        for (Login data : results) {
            if (Password.getText().equals(data.getPassword())){
                System.out.println("login sukses");
                this.peringatan("login sukses");
            } else {
                System.out.println("login gagal");
                 this.peringatan("Input Data Gagal");
            }
            entityManager.getTransaction().commit();
        entityManager.close();
        }
        new Dashboard().setVisible(true);
                this.dispose();
                Masuk Dashboard;
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
