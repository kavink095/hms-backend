package com.bolton.hms.hmsappointment.service;

import com.bolton.hms.hmsappointment.dto.CategoryDTO;
import com.bolton.hms.hmsappointment.entity.Category;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    public boolean saveCategory(CategoryDTO categoryDTO);

    List<Category> getAll(Pageable pageable) throws Exception;
}
