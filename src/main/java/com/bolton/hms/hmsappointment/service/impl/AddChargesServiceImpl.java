package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.ChargesDTO;
import com.bolton.hms.hmsappointment.entity.Charges;
import com.bolton.hms.hmsappointment.repositories.ChargesRepository;
import com.bolton.hms.hmsappointment.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddChargesServiceImpl implements ChargesService {

    @Autowired
    private ChargesRepository chargesRepository;

    @Override
    public boolean addChrages(ChargesDTO chargesDTO) {
        Charges charges = new Charges(chargesDTO.getcID(),chargesDTO.getcValue(), chargesDTO.getcDesc());
        System.out.println("Service Charges :- "+charges.toString());
        chargesRepository.save(charges);
        return true;
    }
}
