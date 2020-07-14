package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.PatientDTO;
import com.bolton.hms.hmsappointment.entity.Doctor;
import com.bolton.hms.hmsappointment.entity.Patient;
import com.bolton.hms.hmsappointment.repositories.PatientRepository;
import com.bolton.hms.hmsappointment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean savePatient(PatientDTO patientDTO) {
        Patient patient = new Patient();

        patient.setPatID(patientDTO.getPatID());
        patient.setPatName(patientDTO.getPatName());
        patient.setPatMail(patientDTO.getPatMail());
        patient.setPatPassword(patientDTO.getPatPassword());
        patient.setPatMobile(patientDTO.getPatMobile());
        patient.setPatAddress(patientDTO.getPatAddress());

        patient.setDoctor(new Doctor(patientDTO.getDoctorDto().getDocNIC(), patientDTO.getDoctorDto().getDocFirstName(), patientDTO.getDoctorDto().getDocLastName(),
                patientDTO.getDoctorDto().getDocMail(), patientDTO.getDoctorDto().getDocMobile()));

        patientRepository.save(patient);

        return true;
    }
}
