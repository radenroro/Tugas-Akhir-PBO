package UasPbo;
import Coding.Buku;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

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

        Isbn = new javax.swing.JTextField();
        Sub = new javax.swing.JTextField();
        JudulBuku = new javax.swing.JTextField();
        Tulis = new javax.swing.JTextField();
        Terbit = new javax.swing.JTextField();
        Tahun = new javax.swing.JTextField();
        Jumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataBuku = new javax.swing.JTable();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Cari = new javax.swing.JButton();
        Sort = new javax.swing.JComboBox<>();
        Cetak = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));
        getContentPane().add(Sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 200, 30));
        getContentPane().add(JudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 200, 30));
        getContentPane().add(Tulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 30));
        getContentPane().add(Terbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 30));
        getContentPane().add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, 30));
        getContentPane().add(Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 200, 30));

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
        jScrollPane1.setViewportView(DataBuku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 340, 340));

        Simpan.setBackground(new java.awt.Color(0, 153, 102));
        Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        Ubah.setBackground(new java.awt.Color(0, 153, 102));
        Ubah.setForeground(new java.awt.Color(255, 255, 255));
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        Hapus.setBackground(new java.awt.Color(0, 153, 102));
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CARI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 40, 20));
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 200, 30));

        Cari.setBackground(new java.awt.Color(0, 153, 102));
        Cari.setForeground(new java.awt.Color(255, 255, 255));
        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        Sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul", "Subjudul", "Penulis", "Penerbit", "Tahun Terbit", " " }));
        getContentPane().add(Sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        Cetak.setBackground(new java.awt.Color(0, 153, 102));
        Cetak.setForeground(new java.awt.Color(255, 255, 255));
        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });
        getContentPane().add(Cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, 50));

        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UasPbo/Travalizer - Desktop (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
         Dashboard Back = new Dashboard();
            Back.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_BackMouseClicked

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

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
       String ISBN = Isbn.getText().trim();
    String Judul =JudulBuku.getText().trim();
    String Subjudul =Sub.getText().trim();
    String Penulis =Tulis.getText().trim();
    String Penerbit =Terbit.getText().trim();
     int TahunTerbit = Integer.parseInt(Tahun.getText());
     int JumlahHalaman = Integer.parseInt(Jumlah.getText());
     
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("PerpusPU");  
        EntityManager em=emf.createEntityManager();  
        Buku b = new Buku();
       b.setIsbn(ISBN);
       b.setJudul(Judul);
       b.setSubjudul(Subjudul);
       b.setPenulis(Penulis);
       b.setPenerbit(Penerbit);
       b.setTahunTerbit(TahunTerbit);
       b.setJumlahHalaman(JumlahHalaman);
        em.getTransaction().begin();
        em.merge(b);
        em.getTransaction().commit();
    
    Isbn.setText(" ");
    JudulBuku.setText(" ");
    Sub.setText(" ");
    Tulis.setText(" ");
    Terbit.setText(" ");
    Tahun.setText(" ");
    Jumlah.setText(" ");
    
    }//GEN-LAST:event_UbahActionPerformed

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

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        try {
            String selection = (String) Sort.getSelectedItem();
            String searchTerm = Search.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM Buku d WHERE ";

             switch (selection.toLowerCase()) {
                case "isbn":
                    queryString += "LOWER(d.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "judul":
                    queryString += "LOWER(d.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "subjudul":
                    queryString += "LOWER(d.subjudul) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case "penerbit":
                    queryString += "LOWER(d.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "tahun terbit":
                    queryString += "CAST(d.tahunTerbit AS text) LIKE LOWER(:searchTerm)";
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

            TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Buku> results = query.getResultList();

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
            for (Buku result : results) {
                Object[] rowData = {
                    result.getIsbn(),
                    result.getJudul(),
                    result.getSubjudul(),
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
    }//GEN-LAST:event_CariActionPerformed

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
         try {
            String selection = (String) Sort.getSelectedItem();
            String searchTerm = Cari.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM Buku d  WHERE ";
            
            switch (selection.toLowerCase()) {
                case "isbn":
                    queryString += "LOWER(d.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "judul":
                    queryString += "LOWER(d.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "subjudul":
                    queryString += "LOWER(d.subjudul) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case "penerbit":
                    queryString += "LOWER(d.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "tahun terbit":
                    queryString += "CAST(d.tahunTerbit AS text) LIKE LOWER(:searchTerm)";
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
            
            TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
            query.setParameter("searchTerm", "%"+searchTerm+"%");
         
            
            List<Buku> results = query.getResultList();
             Map<String,Object> parameter = new HashMap<>();
           parameter.put("querySearch", searchTerm);
           parameter.put("searchBy", selection);
           
           String jrxmlFile = new String("src/UasPbo/Buku.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, new JRBeanCollectionDataSource(results));
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_CetakActionPerformed

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
    private javax.swing.JLabel Back;
    private javax.swing.JButton Cari;
    private javax.swing.JButton Cetak;
    private javax.swing.JTable DataBuku;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Isbn;
    private javax.swing.JTextField JudulBuku;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField Search;
    private javax.swing.JButton Simpan;
    private javax.swing.JComboBox<String> Sort;
    private javax.swing.JTextField Sub;
    private javax.swing.JTextField Tahun;
    private javax.swing.JTextField Terbit;
    private javax.swing.JTextField Tulis;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
