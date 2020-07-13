package com.bolton.hms.hmsappointment.service;

import com.bolton.hms.hmsappointment.dto.AdminDTO;

public interface AdminService {
    public boolean saveAdmin(AdminDTO adminDTO);
    public boolean deleteAdmin(String nic);
}
