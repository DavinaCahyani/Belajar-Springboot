package com.example.demo.service;


import com.example.demo.model.SiswaModel;
import com.example.demo.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    public List<SiswaModel> getAllData() {
        return siswaRepository.findAll();
    }

    public Optional <SiswaModel> getById(long id) {
        return siswaRepository.findById(id);
    }

    public SiswaModel createData(SiswaModel siswaModel) {
        return siswaRepository.save(siswaModel);
    }

    public SiswaModel updateData(Long id, SiswaModel updateSiswa) {
        Optional<SiswaModel> exiting = siswaRepository.findById(id);
        if (exiting.isPresent()) {
            SiswaModel existingSiswa = exiting.get();
            existingSiswa.setNisn(updateSiswa.getNisn());
            existingSiswa.setNamaSiswa(updateSiswa.getNamaSiswa());
            existingSiswa.setUmur(updateSiswa.getUmur());
            existingSiswa.setAlamat((updateSiswa.getAlamat()));
            existingSiswa.setKelas(updateSiswa.getKelas());
            existingSiswa.setJurusan(updateSiswa.getJurusan());
            return siswaRepository.save(existingSiswa);
        } else {
            throw new IllegalArgumentException("Id siswa" + id + "not found");
        }
    }

    public void deleteData(Long id) {
        Optional<SiswaModel> hapusSiswa = siswaRepository.findById(id);
        if (hapusSiswa.isPresent()) {
            siswaRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Siswa dengan id = " + id + " tidak ada");
        }
    }
}
