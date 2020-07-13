package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.CategoryDTO;
import com.bolton.hms.hmsappointment.entity.Category;
import com.bolton.hms.hmsappointment.repositories.CategoryRepository;
import com.bolton.hms.hmsappointment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public boolean saveCategory(CategoryDTO categoryDTO) {
        Category category =  new Category(categoryDTO.getCatID(),categoryDTO.getCatDesc(),categoryDTO.getCreaDate(),categoryDTO.getCreaBy());
        categoryRepository.save(category);
        return true;
    }
}
