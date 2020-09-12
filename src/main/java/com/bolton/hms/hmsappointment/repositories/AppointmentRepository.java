package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {

  @Override
  Page<Appointment> findAll(Pageable pageable);
}
