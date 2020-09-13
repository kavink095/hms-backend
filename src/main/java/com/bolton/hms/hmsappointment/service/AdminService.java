package com.bolton.hms.hmsappointment.service;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.entity.Admin;

import java.util.ArrayList;

public interface AdminService {
    public boolean saveAdmin(AdminDTO adminDTO);
    public ArrayList<AdminDTO> getAllAdmins();

    public boolean deleteAdmin(String nic);

    boolean canAuthenticate(String adminNIC, String password);
}
