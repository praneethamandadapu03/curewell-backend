package com.curewell.curewell.demo.api.payload;



import java.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class SurgeryDto {

    private Long id;

    @NotNull(message = "Doctor ID cannot be null")
    private Long doctorId;

    @NotNull(message = "Surgery date cannot be null")
    private LocalDateTime surgeryDate;

    @NotNull(message = "Patient name cannot be null")
    private String patientName;

    @NotNull(message = "Surgery type cannot be null")
    private String surgeryType;

    private String status;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(LocalDateTime surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
