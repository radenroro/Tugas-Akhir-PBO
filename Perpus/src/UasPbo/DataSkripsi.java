/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UasPbo;

import Coding.Buku;
import Coding.Skripsi;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DataSkripsi extends javax.swing.JFrame {
    ArrayList<Skripsi> Skripsi;
    private int id=0;
    /**
     * Creates new form DataBuku
     */
    public DataSkripsi() {
    try{
        Skripsi = new ArrayList<>();
        initComponents();
        tampil();
    } catch (Exception e) {
        Logger.getLogger(DataSkripsi.class.getName()).log(Level.SEVERE,null,e);
    }
}
    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    private void resetField(){
    IDSkripsi.setText(" ");
    judul.setText(" ");
    Tulis.setText(" ");
    Tahun.setText(" ");
    Halaman.setText(" ");
    }
    private void tampil() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Skripsi> querySelectAll = entityManager.createNamedQuery("Skripsi.findAll", Skripsi.class);
        List<Skripsi> results = querySelectAll.getResultList();
        
         DefaultTableModel model = (DefaultTableModel) DataSkripsi.getModel();
        model.setRowCount(0);
        for (Skripsi data : results) {
            Object[] baris = new Object[5];
            baris[0] = data.getIdSkripsi();
            baris[1] = data.getJudul();
            baris[2] = data.getPenulis();
            baris[3] = data.getTahunTerbit();
            baris[4] = data.getJumlahHalaman();
           
            model.addRow(baris);
        }
        entityManager.getTransaction().commit();
          entityManager.close();
    }
    /**
     * Creates new form DataSkripsi
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JTextField();
        Tulis = new javax.swing.JTextField();
        Halaman = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        IDSkripsi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataSkripsi = new javax.swing.JTable();
        Cari = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Pencarian = new javax.swing.JButton();
        Sort = new javax.swing.JComboBox<>();
        Cetak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Tahun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 250, 40));
        getContentPane().add(Tulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 250, 40));
        getContentPane().add(Halaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 240, 40));

        Simpan.setBackground(new java.awt.Color(153, 255, 153));
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        Hapus.setBackground(new java.awt.Color(153, 255, 153));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        Ubah.setBackground(new java.awt.Color(153, 255, 153));
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));
        getContentPane().add(IDSkripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 250, 40));

        DataSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Skripsi", "Judul", "Penulis", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        DataSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataSkripsiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DataSkripsi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 410, 310));

        Cari.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Cari.setForeground(new java.awt.Color(255, 255, 255));
        Cari.setText("CARI");
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 150, 30));

        Pencarian.setBackground(new java.awt.Color(153, 255, 153));
        Pencarian.setText("Cari");
        Pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PencarianActionPerformed(evt);
            }
        });
        getContentPane().add(Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 60, -1));

        Sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Skripsi", "Judul", "Penulis", "Tahun Terbit", "Jumlah Halaman" }));
        getContentPane().add(Sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 90, -1));

        Cetak.setBackground(new java.awt.Color(153, 255, 153));
        Cetak.setText("Cetak");
        getContentPane().add(Cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (9).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, -1));
        getContentPane().add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (10).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
    String IdSkripsi = IDSkripsi.getText().trim();
    String Judul =judul.getText().trim();
    String Penulis =Tulis.getText().trim();
     int TahunTerbit = Integer.parseInt(Tahun.getText());
     int JumlahHalaman = Integer.parseInt(Halaman.getText());
   

    EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
    entityManager.getTransaction().begin();
    Skripsi b = new Skripsi();
    b.setIdSkripsi(idSkripsi);
    b.setJudul(Judul);
    b.setPenulis(Penulis);
    b.setTahunTerbit(TahunTerbit);
    b.setJumlahHalaman(JumlahHalaman);
    entityManager.persist(b);
    entityManager.getTransaction().commit();


    IDSkripsi.setText(" ");
    judul.setText(" ");
    Tulis.setText(" ");
    Tahun.setText(" ");
    Halaman.setText(" ");
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        String IdSkripsi = IDSkripsi.getText().trim();

    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
        entityManager.getTransaction().begin();
        Skripsi b = entityManager.find(Skripsi.class, IdSkripsi);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        // akhir persistence
        
    IDSkripsi.setText(" ");
    judul.setText(" ");
    Tulis.setText(" ");
    Tahun.setText(" ");
    Halaman.setText(" ");
    }//GEN-LAST:event_HapusActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
    String IdSkripsi = IDSkripsi.getText().trim();
    String Judul =judul.getText().trim();
    String Penulis =Tulis.getText().trim();
     int TahunTerbit = Integer.parseInt(Tahun.getText());
     int JumlahHalaman = Integer.parseInt(Halaman.getText());
   
     
    EntityManager entityManager = Persistence.createEntityManagerFactory("PerpusPU").createEntityManager();
    entityManager.getTransaction().begin();
    Skripsi b = new Skripsi();
    b.setIdSkripsi(IdSkripsi);
    b.setJudul(Judul);
    b.setPenulis(Penulis);
    b.setTahunTerbit(TahunTerbit);
    b.setJumlahHalaman(JumlahHalaman);
    entityManager.persist(b);
    entityManager.getTransaction().commit();
    
    IDSkripsi.setText(" ");
    judul.setText(" ");
    Tulis.setText(" ");
    Tahun.setText(" ");
    Halaman.setText(" ");
    }//GEN-LAST:event_UbahActionPerformed

    private void PencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PencarianActionPerformed
        try {
            String selection = (String) Sort.getSelectedItem();
            String searchTerm = Search.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM DataSkripsi d WHERE ";

            switch (selection.toLowerCase()) {
                case "idskripsi":
                    queryString += "LOWER(d.idskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case "judul":
                    queryString += "LOWER(d.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
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

            TypedQuery<DataSkripsi> query = em.createQuery(queryString, DataSkripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<DataSkripsi> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("IDSkripsi");
            dataModel.addColumn("Judul");
            dataModel.addColumn("Penulis");
            dataModel.addColumn("Tahun Terbit");
            dataModel.addColumn("Jumlah Halaman");
            // ... add other columns as needed

            // Add rows to the model
            for (DataSkripsi result : results) {
                Object[] rowData = {
                    result.getidSkripsi(),
                    result.getJudul(),
                    result.getPenulis(),
                    result.getTahunTerbit(),
                    result.getJumlahHalaman(),
                // ... add other data fields as needed
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            DataSkripsi.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PencarianActionPerformed

    private void DataSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataSkripsiMouseClicked
       int row = DataSkripsi.getSelectedRow();
       IDSkripsi.setText(DataSkripsi.getModel().getValueAt(row,0).toString());
       judul.setText(DataSkripsi.getModel().getValueAt(row,1).toString());
       Tulis.setText(DataSkripsi.getModel().getValueAt(row,2).toString());
       Tahun.setText(DataSkripsi.getModel().getValueAt(row,3).toString());
       Halaman.setText(DataSkripsi.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_DataSkripsiMouseClicked

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
            java.util.logging.Logger.getLogger(DataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSkripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cari;
    private javax.swing.JButton Cetak;
    private javax.swing.JTable DataSkripsi;
    private javax.swing.JTextField Halaman;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField IDSkripsi;
    private javax.swing.JButton Pencarian;
    private javax.swing.JTextField Search;
    private javax.swing.JButton Simpan;
    private javax.swing.JComboBox<String> Sort;
    private javax.swing.JTextField Tahun;
    private javax.swing.JTextField Tulis;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField judul;
    // End of variables declaration//GEN-END:variables
}