package com.nyse.service;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
public interface CompanyCountryService {

    List<Company> getCompanyByCountry(String country);
}
