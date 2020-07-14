package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.AppointmentDTO;
import com.bolton.hms.hmsappointment.service.AddAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AddAppointmentService appointmentService;

    @PostMapping("/saves")
    public boolean addPayent(@RequestBody AppointmentDTO appointmentDTO) {
        System.out.println("Con : - "+appointmentDTO.toString());
        appointmentService.addAppointment(appointmentDTO);
        return true;
    }
}
