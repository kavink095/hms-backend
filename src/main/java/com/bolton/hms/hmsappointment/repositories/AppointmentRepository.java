package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {

}
