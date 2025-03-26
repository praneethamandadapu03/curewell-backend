package com.curewell.curewell.demo.api.controller;



import com.curewell.curewell.demo.api.entity.DoctorSpecialization;
import com.curewell.curewell.demo.api.service.DoctorSpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor-specializations")
public class DoctorSpecializationController {

    @Autowired
    private DoctorSpecializationService doctorSpecializationService;

    @GetMapping
    public List<DoctorSpecialization> getAllDoctorSpecializations() {
        return doctorSpecializationService.getAllDoctorSpecializations();
    }

    @PostMapping
    public DoctorSpecialization createDoctorSpecialization(@RequestBody DoctorSpecialization doctorSpecialization) {
        return doctorSpecializationService.createDoctorSpecialization(doctorSpecialization);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctorSpecialization(@PathVariable Long id) {
        if (doctorSpecializationService.deleteDoctorSpecialization(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}