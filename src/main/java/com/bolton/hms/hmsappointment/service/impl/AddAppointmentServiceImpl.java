package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.AppointmentDTO;
import com.bolton.hms.hmsappointment.entity.*;
import com.bolton.hms.hmsappointment.repositories.AppointmentRepository;
import com.bolton.hms.hmsappointment.repositories.ChargesRepository;
import com.bolton.hms.hmsappointment.repositories.DoctorRepository;
import com.bolton.hms.hmsappointment.repositories.PatientRepository;
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

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private ChargesRepository chargesRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean addAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment();

        appointment.setApCreaDate(appointmentDTO.getApCreaDate());
        appointment.setApForDate(appointmentDTO.getApForDate());
        appointment.setApTime(appointmentDTO.getApTime());
        appointment.setApDesc(appointmentDTO.getApDesc());

        appointment.setPatient(patientRepository.getOne(String.valueOf(appointmentDTO.getPatientDto().getPatID())));

        appointment.setDoctor(doctorRepository.getOne(String.valueOf(appointmentDTO.getDoctorDTO().getDocNIC())));

        appointment.setCharges(chargesRepository.getOne(String.valueOf(appointmentDTO.getChargesDto().getcID())));

        System.out.println("app :- " + appointment.toString());
        appointmentRepository.save(appointment);

        return true;
    }
}
