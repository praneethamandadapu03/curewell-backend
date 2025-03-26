package com.curewell.curewell.demo.api.repository;


import com.curewell.curewell.demo.api.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
    // Additional query methods can be defined here if needed
}