package com.curewell.curewell.demo.api.service.impl;

import com.curewell.curewell.demo.api.entity.Specialization;
import com.curewell.curewell.demo.api.repository.SpecializationRepository;
import com.curewell.curewell.demo.api.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationServiceImpl extends SpecializationService {

    @Autowired
    private SpecializationRepository specializationRepository;

    @Override
    public List<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }

    @Override
    public Optional<Specialization> getSpecializationById(Long id) {
        return specializationRepository.findById(id);
    }

    @Override
    public Specialization createSpecialization(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    @Override
    public Optional<Specialization> updateSpecialization(Long id, Specialization specialization) {
        if (specializationRepository.existsById(id)) {
            specialization.setId(id);
            return Optional.of(specializationRepository.save(specialization));
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteSpecialization(Long id) {
        if (specializationRepository.existsById(id)) {
            specializationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
