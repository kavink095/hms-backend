package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,String> {
}
