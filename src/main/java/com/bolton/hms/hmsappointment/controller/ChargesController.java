package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.ChargesDTO;
import com.bolton.hms.hmsappointment.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/charges")
public class ChargesController {

    @Autowired
    private ChargesService chargesService;

    @PostMapping("/saves")
    public boolean saveCharge(@RequestBody ChargesDTO chargesDTO) {
        System.out.println("Controller : - " +chargesDTO.toString());
        chargesService.addChrages(chargesDTO);
        return true;
    }
}
