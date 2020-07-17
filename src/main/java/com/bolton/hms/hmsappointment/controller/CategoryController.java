package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.CategoryDTO;
import com.bolton.hms.hmsappointment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saves")
    public boolean saveCat(@RequestBody CategoryDTO categoryDTO){
        System.out.println("cat : - "+categoryDTO.toString());
        categoryService.saveCategory(categoryDTO);
        return true;
    }
}
