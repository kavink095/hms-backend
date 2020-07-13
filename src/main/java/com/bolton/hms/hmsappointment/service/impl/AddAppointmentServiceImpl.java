package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.AppointmentDTO;
import com.bolton.hms.hmsappointment.entity.Appointment;
import com.bolton.hms.hmsappointment.entity.Doctor;
import com.bolton.hms.hmsappointment.entity.Patient;
import com.bolton.hms.hmsappointment.repositories.AppointmentRepository;
import com.bolton.hms.hmsappointment.service.AddAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AddAppointmentServiceImpl implements AddAppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean addAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment();

        appointment.setApCreaDate(appointmentDTO.getApCreaDate());
        appointment.setApForDate(appointmentDTO.getApForDate());
        appointment.setApTime(appointmentDTO.getApTime());
        appointment.setApDesc(appointmentDTO.getApDesc());

        return true;
    }
}
