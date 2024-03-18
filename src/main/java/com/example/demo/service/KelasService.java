package com.example.demo.service;

import com.example.demo.model.KelasModel;
import com.example.demo.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasService {

    @Autowired
    private KelasRepository kelasRepository;

    public List<KelasModel> getAllData() {
        return kelasRepository.findAll();
    }

    public Optional<KelasModel> getById(long id) {
        return kelasRepository.findById(id);
    }

    public KelasModel createData(KelasModel kelasModel) {
        return kelasRepository.save(kelasModel);
    }

    public KelasModel updateData(Long id, KelasModel updateKelas) {
        Optional<KelasModel> exiting = kelasRepository.findById(id);
        if (exiting.isPresent()) {
            KelasModel existingKelas = exiting.get();
            existingKelas.setNamaKelas(updateKelas.getNamaKelas());
            existingKelas.setWaliKelas(updateKelas.getWaliKelas());
            existingKelas.setNamaJurusan(updateKelas.getNamaJurusan());

            return kelasRepository.save(existingKelas);
        } else {
            throw new IllegalArgumentException("Id kelas" + id + "not found");
        }
    }

    public void deleteData(Long id) {
        Optional<KelasModel> hapusKelas = kelasRepository.findById(id);
        if (hapusKelas.isPresent()) {
            kelasRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Kelas dengan id = " + id + " tidak ada");
        }
    }
}
