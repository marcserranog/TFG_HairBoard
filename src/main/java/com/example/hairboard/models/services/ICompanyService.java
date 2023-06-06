package com.example.hairboard.models.services;

import com.example.hairboard.models.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICompanyService {
    List<Company> findAll();
    Page<Company> findAll(Pageable pageable);
    Company findById(Long id);
    Company save(Company company);
    void delete(Long id);
}
