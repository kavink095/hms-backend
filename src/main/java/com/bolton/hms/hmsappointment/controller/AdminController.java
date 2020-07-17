package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/saves")
    public boolean saveAdmnin(@RequestBody AdminDTO adminDTO){
        System.out.println("Admin Controller :- "+adminDTO.toString());
        adminService.saveAdmin(adminDTO);
        return true;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<AdminDTO> getAllAdmins() {
        return adminService.getAllAdmins();
    }


}
