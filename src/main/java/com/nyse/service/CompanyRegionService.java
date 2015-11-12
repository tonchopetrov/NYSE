package com.nyse.service;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
public interface CompanyRegionService {

    List<Company> getCompaniesInAfrica();
    List<Company> getCompaniesInAsia();
    List<Company> getCompaniesInAustraliaAndSouthPacific();
    List<Company> getCompaniesInCentralAmericaAndCaribbean();
    List<Company> getCompaniesInEurope();
    List<Company> getCompaniesInSouthAmerica();
    List<Company> getCompaniesInMiddleEast();
    List<Company> getCompaniesInNorthAmerica();

}
