package com.example.hairboard.models.dao;

import com.example.hairboard.models.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyDao extends JpaRepository<Company, Long> {

}
