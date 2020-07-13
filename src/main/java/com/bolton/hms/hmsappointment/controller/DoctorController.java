package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.dto.ChargesDTO;
import com.bolton.hms.hmsappointment.dto.DoctorDTO;
import com.bolton.hms.hmsappointment.service.AddDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @Autowired
    private AddDoctorService doctorService;

    @PostMapping("/saves")
    public boolean saveDoctor(@RequestBody DoctorDTO doctorDTO){
        System.out.println("Doc Con ss:- "+ doctorDTO.toString());
        doctorService.register(doctorDTO);
        return true;
    }
}
