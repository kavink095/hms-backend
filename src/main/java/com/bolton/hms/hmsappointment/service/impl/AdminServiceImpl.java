package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.AdminDTO;
import com.bolton.hms.hmsappointment.entity.Admin;
import com.bolton.hms.hmsappointment.repositories.AdminRepository;
import com.bolton.hms.hmsappointment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public ArrayList<AdminDTO> getAllAdmins() {
        List<Admin> admins = adminRepository.findAll();
        ArrayList<AdminDTO> allAdmin = new ArrayList<>();
        for (Admin admin : admins) {
            AdminDTO adminDTO = new AdminDTO(admin.getAdNIC(), admin.getAdName(), admin.getAdMobile(), admin.getAdMail(), admin.getAdPassword());
            allAdmin.add(adminDTO);
        }
        return allAdmin;
    }

    @Override
    public boolean deleteAdmin(String nic) {
        adminRepository.deleteById(nic);
        return true;
    }
}
