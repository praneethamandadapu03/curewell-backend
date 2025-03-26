package com.curewell.curewell.demo.api.repository;


import com.curewell.curewell.demo.api.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    // Additional query methods can be defined here if needed
}
