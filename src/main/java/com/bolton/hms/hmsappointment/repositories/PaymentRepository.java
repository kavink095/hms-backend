package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments,String> {
}
