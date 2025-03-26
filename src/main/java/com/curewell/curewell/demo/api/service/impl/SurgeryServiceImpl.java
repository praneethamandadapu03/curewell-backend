package com.curewell.curewell.demo.api.service.impl;


import com.curewell.curewell.demo.api.entity.Surgery;
import com.curewell.curewell.demo.api.repository.SurgeryRepository;
import com.curewell.curewell.demo.api.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurgeryServiceImpl extends SurgeryService {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @Override
    public boolean deleteSurgery(Long id) {
        return false;
    }
}