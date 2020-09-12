package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.entity.Appointment;
import com.bolton.hms.hmsappointment.repositories.AppointmentRepository;
import com.bolton.hms.hmsappointment.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
  private final static Logger logger=LoggerFactory.getLogger(AppointmentServiceImpl.class);
  @Autowired
  private AppointmentRepository appointmentRepository;

  @Override
  public List<Appointment> getAll(Pageable pageable) throws Exception{
    try {
      Page<Appointment> all = appointmentRepository.findAll(pageable);
      return all.toList();
    } catch (Exception e){
      logger.debug(e.getMessage(),e);
      throw new Exception(e);
    }
  }
}
