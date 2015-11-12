package com.nyse.dao;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
public interface CompanyCountryDao {

    List<Company> getCompanyByCountry(String country);
}
