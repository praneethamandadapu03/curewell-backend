package com.curewell.curewell.demo.api.service;



import com.curewell.curewell.demo.api.entity.Doctor;
import com.curewell.curewell.demo.api.entity.Specialization;
import com.curewell.curewell.demo.api.payload.DoctorSpecializationDto;
import com.curewell.curewell.demo.api.entity.DoctorSpecialization;
import com.curewell.curewell.demo.api.repository.DoctorSpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorSpecializationService {

    @Autowired
    private DoctorSpecializationRepository doctorSpecializationRepository;

    public List<DoctorSpecialization> getAllDoctorSpecializations() {
        return doctorSpecializationRepository.findAll();
    }

    public DoctorSpecialization createDoctorSpecialization(DoctorSpecializationDto dto) {
        DoctorSpecialization doctorSpecialization = new DoctorSpecialization();
        doctorSpecialization.setDoctor(new Doctor(dto.getDoctorId()));
        doctorSpecialization.setSpecialization(new Specialization(dto.getSpecializationId()));
        return doctorSpecializationRepository.save(doctorSpecialization);
    }

    public boolean deleteDoctorSpecialization(Long id) {
        if (doctorSpecializationRepository.existsById(id)) {
            doctorSpecializationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
