package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.DoctorDTO;
import com.bolton.hms.hmsappointment.entity.Admin;
import com.bolton.hms.hmsappointment.entity.Category;
import com.bolton.hms.hmsappointment.entity.Charges;
import com.bolton.hms.hmsappointment.entity.Doctor;
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

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void register(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();

        doctor.setDocNIC(doctorDTO.getDocNIC());
        doctor.setDocFirstName(doctorDTO.getDocFirstName());
        doctor.setDocLastName(doctorDTO.getDocLastName());
        doctor.setDocMobile(doctorDTO.getDocMobile());
        doctor.setDocMail(doctorDTO.getDocMobile());

        doctor.setAdmin(new Admin(doctorDTO.getAdminDto().getAdNIC(), doctorDTO.getAdminDto().getAdName(), doctorDTO.getAdminDto().getAdMail(),
                doctorDTO.getAdminDto().getAdMobile(), doctorDTO.getAdminDto().getAdPassword()));

        doctor.setCharges(new Charges(doctorDTO.getChargesDto().getcID(),doctorDTO.getChargesDto().getcValue(), doctorDTO.getChargesDto().getcDesc()));

        doctor.setCategory(new Category(doctorDTO.getCategoryDto().getCatID(),doctorDTO.getCategoryDto().getCatDesc(),doctorDTO.getCategoryDto().getCreaDate(),
                doctorDTO.getCategoryDto().getCreaBy()));

        System.out.println("DoctorRepo :- " + doctor.toString());
        doctorRepository.save(doctor);

    }
}
