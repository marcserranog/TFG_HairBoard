package com.example.hairboard.models.services;

import com.example.hairboard.models.dao.ICompanyDao;
import com.example.hairboard.models.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private ICompanyDao companyDao;

    @Override
    public List<Company> findAll() {
        return (List<Company>) companyDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Company> findAll(Pageable pageable) {
        return companyDao.findAll(pageable);
    }

    @Override
    public Company findById(Long id) {
        return companyDao.findById(id).orElse(null);
    }

    @Override
    public Company save(Company company) {
        return companyDao.save(company);
    }

    @Override
    public void delete(Long id) {
        companyDao.deleteById(id);
    }
}
