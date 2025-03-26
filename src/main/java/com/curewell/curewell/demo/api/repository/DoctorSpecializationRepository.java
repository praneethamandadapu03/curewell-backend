package com.curewell.curewell.demo.api.repository;



import com.curewell.curewell.demo.api.entity.DoctorSpecialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorSpecializationRepository extends JpaRepository<DoctorSpecialization, Long> {
    // Additional query methods can be defined here if needed
}