package com.curewell.curewell.demo.api.entity;

import java.io.Serializable;
import java.util.Objects;

public class DoctorSpecializationId implements Serializable {

    private Long doctorId;
    private Long specializationId;

    // Default constructor
    public DoctorSpecializationId() {}

    public DoctorSpecializationId(Long doctorId, Long specializationId) {
        this.doctorId = doctorId;
        this.specializationId = specializationId;
    }

    // Getters and Setters
    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(Long specializationId) {
        this.specializationId = specializationId;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoctorSpecializationId)) return false;
        DoctorSpecializationId that = (DoctorSpecializationId) o;
        return Objects.equals(doctorId, that.doctorId) &&
                Objects.equals(specializationId, that.specializationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, specializationId);
    }
}