package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.CategoryDTO;
import com.bolton.hms.hmsappointment.entity.Category;
import com.bolton.hms.hmsappointment.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    private static Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saves")
    public boolean saveCat(@RequestBody CategoryDTO categoryDTO){
        System.out.println("cat : - "+categoryDTO.toString());
        categoryService.saveCategory(categoryDTO);
        return true;
    }

    @GetMapping("/list")
    public List<Category> getAll(@RequestParam("size") int size,
                                 @RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page, size);
        List<Category> all = null;
        try {
            all = categoryService.getAll(pageable);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return all;
    }
}
