package com.nyse.dao;

import com.nyse.model.Company;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
public interface CompanyRegionDao  {

    List<Company> getCompaniesInAfrica();
    List<Company> getCompaniesInAsia();
    List<Company> getCompaniesInAustraliaAndSouthPacific();
    List<Company> getCompaniesInCentralAmericaAndCaribbean();
    List<Company> getCompaniesInEurope();
    List<Company> getCompaniesInSouthAmerica();
    List<Company> getCompaniesInMiddleEast();
    List<Company> getCompaniesInNortAmerica();
}
