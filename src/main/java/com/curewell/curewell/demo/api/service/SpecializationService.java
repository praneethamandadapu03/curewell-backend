package com.curewell.curewell.demo.api.service;

import com.curewell.curewell.demo.api.entity.Specialization;
import com.curewell.curewell.demo.api.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationService {

    @Autowired
    private SpecializationRepository specializationRepository;

    public List<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }

    public Optional<Specialization> getSpecializationById(Long id) {
        return specializationRepository.findById(id);
    }

    public Specialization createSpecialization(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    public Optional<Specialization> updateSpecialization(Long id, Specialization specialization) {
        if (specializationRepository.existsById(id)) {
            specialization.setId(id);
            return Optional.of(specializationRepository.save(specialization));
        }
        return Optional.empty();
    }

    public boolean deleteSpecialization(Long id) {
        if (specializationRepository.existsById(id)) {
            specializationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
