package com.bolton.hms.hmsappointment.repositories;

import com.bolton.hms.hmsappointment.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {

  @Override
  Page<Category> findAll(Pageable pageable);
}
