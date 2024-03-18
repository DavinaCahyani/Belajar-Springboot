package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "data_siswa")
public class SiswaModel {

        @Id
        @GeneratedValue
        private Long id;

        @Column(name = "nisn")
        private Long nisn;

        @Column(name = "nama_siswa")
        private String namaSiswa;

        @Column(name = "umur")
        private int umur;

        @Column(name = "alamat")
        private String alamat;

        @Column(name = "kelas")
        private String kelas;

        @Column(name = "jurusan")
        private String jurusan;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Long getNisn() {
                return nisn;
        }

        public void setNisn(Long nisn) {
                this.nisn = nisn;
        }

        public String getNamaSiswa() {
                return namaSiswa;
        }

        public void setNamaSiswa(String namaSiswa) {
                this.namaSiswa = namaSiswa;
        }

        public int getUmur() {
                return umur;
        }

        public void setUmur(int umur) {
                this.umur = umur;
        }

        public String getAlamat() {
                return alamat;
        }

        public void setAlamat(String alamat) {
                this.alamat = alamat;
        }

        public String getKelas() {
                return kelas;
        }

        public void setKelas(String kelas) {
                this.kelas = kelas;
        }

        public String getJurusan() {
                return jurusan;
        }

        public void setJurusan(String jurusan) {
                this.jurusan = jurusan;
        }


}
