package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.DoctorDTO;
import com.bolton.hms.hmsappointment.entity.Admin;
import com.bolton.hms.hmsappointment.entity.Category;
import com.bolton.hms.hmsappointment.entity.Charges;
import com.bolton.hms.hmsappointment.entity.Doctor;
import com.bolton.hms.hmsappointment.repositories.AdminRepository;
import com.bolton.hms.hmsappointment.repositories.CategoryRepository;
import com.bolton.hms.hmsappointment.repositories.ChargesRepository;
import com.bolton.hms.hmsappointment.repositories.DoctorRepository;
import com.bolton.hms.hmsappointment.service.AddDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AddDoctorServiceImpl implements AddDoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private ChargesRepository chargesRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void register(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();

        doctor.setDocNIC(doctorDTO.getDocNIC());
        doctor.setDocFirstName(doctorDTO.getDocFirstName());
        doctor.setDocLastName(doctorDTO.getDocLastName());
        doctor.setDocMobile(doctorDTO.getDocMobile());
        doctor.setDocMail(doctorDTO.getDocMobile());

        doctor.setAdmin(adminRepository.getOne(doctorDTO.getAdminDto().getAdNIC()));

            doctor.setCharges(chargesRepository.getOne(String.valueOf(doctorDTO.getChargesDto().getcID())));

        doctor.setCategory(categoryRepository.getOne(doctorDTO.getCategoryDto().getCatID()));

        System.out.println("DoctorRepo :- " + doctor.toString());
        doctorRepository.save(doctor);

    }
}
