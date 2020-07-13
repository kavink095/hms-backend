package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.entity.Admin;
import com.bolton.hms.hmsappointment.repositories.AdminRepository;
import com.bolton.hms.hmsappointment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public boolean saveAdmin(AdminDTO adminDTO) {
        Admin admin = new Admin(adminDTO.getAdNIC(), adminDTO.getAdName(), adminDTO.getAdMobile(), adminDTO.getAdMail(), adminDTO.getAdPassword());
        adminRepository.save(admin);
        return true;
    }

    @Override
    public boolean deleteAdmin(String nic) {
        adminRepository.deleteById(nic);
        return true;
    }
}
