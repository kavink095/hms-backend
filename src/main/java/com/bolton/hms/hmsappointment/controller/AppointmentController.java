package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.AppointmentDTO;
import com.bolton.hms.hmsappointment.entity.Appointment;
import com.bolton.hms.hmsappointment.service.AddAppointmentService;
import com.bolton.hms.hmsappointment.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AbstractPageRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/appointment")
public class AppointmentController {

    Logger logger = LoggerFactory.getLogger(AppointmentController.class);

    @Autowired
    private AddAppointmentService appointmentService;

    @Autowired
    private AppointmentService appointmentServiceAll;

    @PostMapping("/saves")
    public boolean addPayent(@RequestBody AppointmentDTO appointmentDTO) {
        System.out.println("Con : - "+appointmentDTO.toString());
        appointmentService.addAppointment(appointmentDTO);
        return true;
    }

    @GetMapping("/list")
    public List<Appointment> getAll(@RequestParam("size") int size,
                                    @RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page,size);
        List<Appointment> all = null;
        try {
            all = appointmentServiceAll.getAll(pageable);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return all;

    }
}
