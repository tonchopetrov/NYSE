package com.nyse.service;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 6.11.2015 г..
 */
public interface CompanyService {


    void saveCompany(Company company);
    List<Company> getAllCompanies();
    List<Company> getCompanyByCountry(String country);
    Company getCompanyBySymbol(String symbol);

}
