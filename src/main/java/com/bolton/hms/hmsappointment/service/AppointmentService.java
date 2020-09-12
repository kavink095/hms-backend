package com.bolton.hms.hmsappointment.service;

import com.bolton.hms.hmsappointment.entity.Appointment;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AppointmentService {

  List<Appointment> getAll(Pageable pageable) throws Exception;
}
