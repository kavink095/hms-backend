package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
}
