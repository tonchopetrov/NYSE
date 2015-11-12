package com.nyse.service.impl;

import com.nyse.dao.CompanyDao;
import com.nyse.model.Company;
import com.nyse.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TT on 6.11.2015 г..
 */
@Service
//@Transactional
public class CompanyServiceImpl implements CompanyService {


    @Autowired
    private CompanyDao companyDao;

    @Override
    public void saveCompany(Company company) {
        companyDao.saveCompany(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    public List<Company> getCompanyByCountry(String country) {

        return companyDao.getCompanyByCountry(country);
    }

    @Override
    public Company getCompanyBySymbol(String symbol) {

        return companyDao.getCompanyBySymbol(symbol);
    }



}
