/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdPengguna", query = "SELECT p FROM Peminjaman p WHERE p.idPengguna = :idPengguna"),
    @NamedQuery(name = "Peminjaman.findByNama", query = "SELECT p FROM Peminjaman p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjaman.findBySemester", query = "SELECT p FROM Peminjaman p WHERE p.semester = :semester"),
    @NamedQuery(name = "Peminjaman.findByJurusan", query = "SELECT p FROM Peminjaman p WHERE p.jurusan = :jurusan"),
    @NamedQuery(name = "Peminjaman.findByAngkatan", query = "SELECT p FROM Peminjaman p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjaman.findByStatus", query = "SELECT p FROM Peminjaman p WHERE p.status = :status"),
    @NamedQuery(name = "Peminjaman.findByTanggalPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPengembalian", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPengembalian = :tanggalPengembalian"),
    @NamedQuery(name = "Peminjaman.findByJumlahBuku", query = "SELECT p FROM Peminjaman p WHERE p.jumlahBuku = :jumlahBuku")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengguna")
    private Integer idPengguna;
    @Column(name = "nama")
    private String nama;
    @Column(name = "semester")
    private Integer semester;
    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "angkatan")
    private Integer angkatan;
    @Column(name = "status")
    private String status;
    @Column(name = "tanggal_peminjaman")
    @Temporal(TemporalType.DATE)
    private Date tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalPengembalian;
    @Column(name = "jumlah_buku")
    private Integer jumlahBuku;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private Buku isbn;

    public Peminjaman() {
    }

    public Peminjaman(Integer idPengguna) {
        this.idPengguna = idPengguna;
    }

    public Integer getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(Integer idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Integer getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(Integer angkatan) {
        this.angkatan = angkatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Integer getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(Integer jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public Buku getIsbn() {
        return isbn;
    }

    public void setIsbn(Buku isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPengguna != null ? idPengguna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.idPengguna == null && other.idPengguna != null) || (this.idPengguna != null && !this.idPengguna.equals(other.idPengguna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coding.Peminjaman[ idPengguna=" + idPengguna + " ]";
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
