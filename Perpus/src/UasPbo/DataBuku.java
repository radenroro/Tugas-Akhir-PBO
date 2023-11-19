/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UasPbo;

import Coding.Buku;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class DataBuku extends javax.swing.JFrame {
    ArrayList<Buku> Buku;
    private int id=0;
    /**
     * Creates new form DataBuku
     */
    public DataBuku() {
    try{
        Buku = new ArrayList<>();
        initComponents();
        tampil();
    } catch (Exception e) {
        Logger.getLogger(DataBuku.class.getName()).log(Level.SEVERE,null,e);
    }
}
    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    private void resetField(){
    Isbn.setText(" ");
    JudulBuku.setText(" ");
    Sub.setText(" ");
    Tulis.setText(" ");
    Terbit.setText(" ");
    Tahun.setText(" ");
    Jumlah.setText(" ");    
    }
    private void tampil() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Buku> querySelectAll = entityManager.createNamedQuery("Buku.findAll", Buku.class);
        List<Buku> results = querySelectAll.getResultList();
        
         DefaultTableModel model = (DefaultTableModel) DataBuku.getModel();
        model.setRowCount(0);
        for (Buku data : results) {
            Object[] baris = new Object[7];
            baris[0] = data.getIsbn();
            baris[1] = data.getJudul();
            baris[2] = data.getSubjudul();
            baris[3] = data.getPenulis();
            baris[4] = data.getPenerbit();
            baris[5] = data.getTahunTerbit();
            baris[6] = data.getJumlahHalaman();
           
            model.addRow(baris);
        }
        entityManager.getTransaction().commit();
          entityManager.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Isbn = new javax.swing.JTextField();
        JudulBuku = new javax.swing.JTextField();
        Tulis = new javax.swing.JTextField();
        Terbit = new javax.swing.JTextField();
        Tahun = new javax.swing.JTextField();
        Jumlah = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Sub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataBuku = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        Sort = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        Cetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 250, 30));
        getContentPane().add(JudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 30));
        getContentPane().add(Tulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 250, 30));
        getContentPane().add(Terbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, 30));
        getContentPane().add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 250, 30));
        getContentPane().add(Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 240, 30));

        Simpan.setBackground(new java.awt.Color(153, 255, 153));
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        Hapus.setBackground(new java.awt.Color(153, 255, 153));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        Ubah.setBackground(new java.awt.Color(153, 255, 153));
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));
        getContentPane().add(Sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        DataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Subjudul", "Penulis", "Penerbit", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        DataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DataBuku);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 420, 300));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cari");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 120, 30));

        Sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul Buku", "Subjudul", "Penulis", "Penerbit", "Tahun Terbit" }));
        getContentPane().add(Sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        Search.setBackground(new java.awt.Color(153, 255, 153));
        Search.setText("Cari");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        Cetak.setBackground(new java.awt.Color(153, 255, 153));
        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });
        getContentPane().add(Cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (9).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
    String ISBN = Isbn.getText().trim();
    String Judul =JudulBuku.getText().trim();
    String Subjudul =Sub.getText().trim();
    String Penulis =Tulis.getText().trim();
    String Penerbit =Terbit.getText().trim();
     int TahunTerbit = Integer.parseInt(Tahun.getText());
     int JumlahHalaman = Integer.parseInt(Jumlah.getText());
   

    EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
    entityManager.getTransaction().begin();
    Buku b = new Buku();
    b.setIsbn(ISBN);
    b.setJudul(Judul);
    b.setSubjudul(Subjudul);
    b.setPenulis(Penulis);
    b.setPenerbit(Penerbit);
    b.setTahunTerbit(TahunTerbit);
    b.setJumlahHalaman(JumlahHalaman);
    entityManager.persist(b);
    entityManager.getTransaction().commit();


    Isbn.setText(" ");
    JudulBuku.setText(" ");
    Sub.setText(" ");
    Tulis.setText(" ");
    Terbit.setText(" ");
    Tahun.setText(" ");
    Jumlah.setText(" ");
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        String ISBN = Isbn.getText().trim();

    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, ISBN);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        // akhir persistence
        
    Isbn.setText(" ");
    JudulBuku.setText(" ");
    Sub.setText(" ");
    Tulis.setText(" ");
    Terbit.setText(" ");
    Tahun.setText(" ");
    Jumlah.setText(" ");
    }//GEN-LAST:event_HapusActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
    String ISBN = Isbn.getText().trim();
    String Judul =JudulBuku.getText().trim();
    String Subjudul =Sub.getText().trim();
    String Penulis =Tulis.getText().trim();
    String Penerbit =Terbit.getText().trim();
     int TahunTerbit = Integer.parseInt(Tahun.getText());
     int JumlahHalaman = Integer.parseInt(Jumlah.getText());
     
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
    entityManager.getTransaction().begin();
    Buku b = new Buku();
    b.setIsbn(ISBN);
    b.setJudul(Judul);
    b.setSubjudul(Subjudul);
    b.setPenulis(Penulis);
    b.setPenerbit(Penerbit);
    b.setTahunTerbit(TahunTerbit);
    b.setJumlahHalaman(JumlahHalaman);
    entityManager.persist(b);
    entityManager.getTransaction().commit();
    
    Isbn.setText(" ");
    JudulBuku.setText(" ");
    Sub.setText(" ");
    Tulis.setText(" ");
    Terbit.setText(" ");
    Tahun.setText(" ");
    Jumlah.setText(" ");
    }//GEN-LAST:event_UbahActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
            String selection = (String) Sort.getSelectedItem();
            String searchTerm = Cari.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM DataBuku d WHERE ";

            switch (selection.toLowerCase()) {
                case "isbn":
                    queryString += "LOWER(d.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "judul":
                    queryString += "LOWER(d.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "sub judul":
                    queryString += "LOWER(d.subJudul) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case "penerbit":
                    queryString += "LOWER(d.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "tahun terbit":
                    queryString += "LOWER(d.tahunTerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "jumlah halaman":
                    queryString += "LOWER(d.jumlahHalaman) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PerpusPU");
            EntityManager em = emf.createEntityManager();

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<DataBuku> query = em.createQuery(queryString, DataBuku.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<DataBuku> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ISBN");
            dataModel.addColumn("Judul");
            dataModel.addColumn("Subjudul");
            dataModel.addColumn("Penulis");
            dataModel.addColumn("Penerbit");
            dataModel.addColumn("Tahun Terbit");
            dataModel.addColumn("Jumlah Halaman");
            // ... add other columns as needed

            // Add rows to the model
            for (DataBuku result : results) {
                Object[] rowData = {
                    result.getIsbn(),
                    result.getJudul(),
                    result.getSubJudul(),
                    result.getPenulis(),
                    result.getPenerbit(),
                    result.getTahunTerbit(),
                    result.getJumlahHalaman(),
                // ... add other data fields as needed
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            DataBuku.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void DataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBukuMouseClicked
       int row = DataBuku.getSelectedRow();
       Isbn.setText(DataBuku.getModel().getValueAt(row,0).toString());
       JudulBuku.setText(DataBuku.getModel().getValueAt(row,1).toString());
       Sub.setText(DataBuku.getModel().getValueAt(row,2).toString());
       Tulis.setText(DataBuku.getModel().getValueAt(row,3).toString());
       Terbit.setText(DataBuku.getModel().getValueAt(row,4).toString());
       Tahun.setText(DataBuku.getModel().getValueAt(row,5).toString());
       Jumlah.setText(DataBuku.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_DataBukuMouseClicked

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CetakActionPerformed
 
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
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari;
    private javax.swing.JButton Cetak;
    private javax.swing.JTable DataBuku;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Isbn;
    private javax.swing.JTextField JudulBuku;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JButton Search;
    private javax.swing.JButton Simpan;
    private javax.swing.JComboBox<String> Sort;
    private javax.swing.JTextField Sub;
    private javax.swing.JTextField Tahun;
    private javax.swing.JTextField Terbit;
    private javax.swing.JTextField Tulis;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}