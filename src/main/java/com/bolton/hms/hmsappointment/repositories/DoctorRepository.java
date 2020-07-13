package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,String> {
}
