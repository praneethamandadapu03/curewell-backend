package com.curewell.curewell.demo.api.repository;



import com.curewell.curewell.demo.api.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Additional query methods can be defined here if needed
}