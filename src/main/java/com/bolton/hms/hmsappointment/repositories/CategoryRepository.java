package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
