package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "data_sekolah")
public class SekolahModel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nama_sekolah")
    private String namaSekolah;

      @Column(name = "alamat_sekolah")
    private String alamatSekolah;

      @Column(name = "nomor_telepon")
    private String nomorTelepon;

      @Column(name = "email_sekolah")
    private String emailSekolah;

      @Column(name = "motto")
    private String motto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmailSekolah() {
        return emailSekolah;
    }

    public void setEmailSekolah(String emailSekolah) {
        this.emailSekolah = emailSekolah;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
