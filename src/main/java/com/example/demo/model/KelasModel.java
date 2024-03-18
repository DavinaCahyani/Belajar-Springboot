package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "data_kelas")
public class KelasModel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nama_kelas")
    private String namaKelas;

    @Column(name = "nama_jurusan")
    private String namaJurusan;

    @Column(name = "wali_kelas")
    private String waliKelas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getWaliKelas() {
        return waliKelas;
    }

    public void setWaliKelas(String waliKelas) {
        this.waliKelas = waliKelas;
    }
}
