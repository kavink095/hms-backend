package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.PatientDTO;
import com.bolton.hms.hmsappointment.repositories.PatientRepository;
import com.bolton.hms.hmsappointment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public boolean savePatient(PatientDTO patientDTO) {

        return false;
    }
}
