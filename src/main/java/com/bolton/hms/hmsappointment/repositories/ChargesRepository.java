package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Charges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargesRepository extends JpaRepository<Charges,String> {
}
