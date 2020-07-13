package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/saves")
    public boolean saveAdmnin(@RequestBody AdminDTO adminDTO){
        adminService.saveAdmin(adminDTO);
        return true;
    }
}
