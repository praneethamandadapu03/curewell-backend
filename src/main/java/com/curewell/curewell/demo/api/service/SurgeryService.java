package com.curewell.curewell.demo.api.service;



import com.curewell.curewell.demo.api.entity.Surgery;
import com.curewell.curewell.demo.api.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class SurgeryService {

    @Autowired
    private SurgeryRepository surgeryRepository;

    public List<Surgery> getAllSurgeries() {
        return surgeryRepository.findAll();
    }

    public Optional<Surgery> getSurgeryById(Long id) {
        return surgeryRepository.findById(id);
    }

    public Surgery createSurgery(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }

    public Optional<Surgery> updateSurgery(Long id, Surgery surgery) {
        if (surgeryRepository.existsById(id)) {
            surgery.setId(id);
            return Optional.of(surgeryRepository.save(surgery));
        }
        return Optional.empty();
    }

    public abstract boolean deleteSurgery(Long id);
}