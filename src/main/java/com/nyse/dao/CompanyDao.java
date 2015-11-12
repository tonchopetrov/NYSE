package com.nyse.dao;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 6.11.2015 г..
 */
public interface CompanyDao {

    void saveCompany(Company company);
    List<Company> getAllCompanies();
    List<Company> getCompanyByCountry(String country);
    Company getCompanyBySymbol(String companyName);

}
