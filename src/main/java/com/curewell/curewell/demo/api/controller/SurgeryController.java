package com.curewell.curewell.demo.api.controller;

import com.curewell.curewell.demo.api.entity.Doctor;
import com.curewell.curewell.demo.api.entity.Surgery;
import com.curewell.curewell.demo.api.payload.SurgeryDto;
import com.curewell.curewell.demo.api.service.SurgeryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surgeries")
public class SurgeryController {

    @Autowired
    private SurgeryService surgeryService;

    @GetMapping
    public List<Surgery> getAllSurgeries() {
        return surgeryService.getAllSurgeries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Surgery> getSurgeryById(@PathVariable Long id) {
        return surgeryService.getSurgeryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Surgery createSurgery(@Valid @RequestBody SurgeryDto surgeryDto) {
        Surgery surgery = new Surgery();
        surgery.setDoctor(new Doctor(surgeryDto.getDoctorId()));
        surgery.setSurgeryDate(surgeryDto.getSurgeryDate());
        surgery.setPatientName(surgeryDto.getPatientName());
        surgery.setSurgeryType(surgeryDto.getSurgeryType());
        surgery.setStatus(surgeryDto.getStatus());
        return surgeryService.createSurgery(surgery);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Surgery> updateSurgery(@PathVariable Long id, @Valid @RequestBody SurgeryDto surgeryDto) {
        Surgery surgery = new Surgery();
        surgery.setId(id);
        surgery.setDoctor(new Doctor(surgeryDto.getDoctorId()));
        surgery.setSurgeryDate(surgeryDto.getSurgeryDate());
        surgery.setPatientName(surgeryDto.getPatientName());
        surgery.setSurgeryType(surgeryDto.getSurgeryType());
        surgery.setStatus(surgeryDto.getStatus());

        return surgeryService.updateSurgery(id, surgery)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurgery(@PathVariable Long id) {
        if (surgeryService.deleteSurgery(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}