package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.CategoryDTO;
import com.bolton.hms.hmsappointment.entity.Category;
import com.bolton.hms.hmsappointment.repositories.CategoryRepository;
import com.bolton.hms.hmsappointment.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public boolean saveCategory(CategoryDTO categoryDTO) {
        Category category =  new Category(categoryDTO.getCatID(),categoryDTO.getCatDesc(),categoryDTO.getCreaDate(),categoryDTO.getCreaBy());
        categoryRepository.save(category);
        return true;
    }

    @Override
    public List<Category> getAll(Pageable pageable) throws Exception {
        try {
            return categoryRepository.findAll(pageable).toList();
        }catch (Exception e){
            logger.debug(e.getMessage(),e);
            throw e;
        }
    }
}
