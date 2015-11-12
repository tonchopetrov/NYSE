package com.nyse.service.impl;

import com.nyse.dao.CompanyCountryDao;
import com.nyse.model.Company;
import com.nyse.service.CompanyCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
@Service
public class CompanyCountryServiceImpl implements CompanyCountryService {



    @Autowired
    private CompanyCountryDao companyCountryDao;

    @Override
    public List<Company> getCompanyByCountry(String country) {
        return companyCountryDao.getCompanyByCountry(country);
    }


}
