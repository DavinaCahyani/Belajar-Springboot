package com.example.demo.service;

import com.example.demo.model.SekolahModel;
import com.example.demo.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SekolahService {

    @Autowired
    private SekolahRepository sekolahRepository;

    public List<SekolahModel> getAllData() {
        return sekolahRepository.findAll();
    }

    public Optional<SekolahModel> getById(long id) {
        return sekolahRepository.findById(id);
    }

    public SekolahModel createData(SekolahModel sekolahModel) {
        return sekolahRepository.save(sekolahModel);
    }

    public SekolahModel updateData(Long id, SekolahModel updateSekolah) {
        Optional<SekolahModel> exiting = sekolahRepository.findById(id);
        if (exiting.isPresent()) {
            SekolahModel existingSekolah = exiting.get();
            existingSekolah.setAlamatSekolah(updateSekolah.getAlamatSekolah());
            existingSekolah.setEmailSekolah(updateSekolah.getEmailSekolah());
            existingSekolah.setNamaSekolah(updateSekolah.getNamaSekolah());
            existingSekolah.setMotto((updateSekolah.getMotto()));
            existingSekolah.setNomorTelepon(updateSekolah.getNomorTelepon());
            return sekolahRepository.save(existingSekolah);
        } else {
            throw new IllegalArgumentException("Id sekolah" + id + "not found");
        }
    }

    public void deleteData(Long id) {
        Optional<SekolahModel> hapusSekolah = sekolahRepository.findById(id);
        if (hapusSekolah.isPresent()) {
            sekolahRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Sekolah dengan id = " + id + " tidak ada");
        }
    }
}
