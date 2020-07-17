package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.PatientDTO;
import com.bolton.hms.hmsappointment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/saves")
    public boolean savePatient(@RequestBody PatientDTO patientDTO) {
        patientService.savePatient(patientDTO);
        return true;
    }
}
