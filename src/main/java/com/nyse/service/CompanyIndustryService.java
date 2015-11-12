package com.nyse.service;

import com.nyse.model.Company;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by TT on 8.11.2015 г..
 */
public interface CompanyIndustryService {

    List<Company> getTechnologyCompanies();
    List<Company> getCompaniesInBasicIndustry();
    List<Company> getCompaniesInCapitalGoodsIndustry();
    List<Company> getCompaniesInConsumerDurablesIndustry();
    List<Company> getCompaniesInConsumerNonDurIndustry();
    List<Company> getCompaniesInConsumerServiceIndurstry();
    List<Company> getCompaniesInEnergyIndustry();
    List<Company> getCompaniesInFinanceIndustry();
    List<Company> getCompaniesInHealthIndustry();
    List<Company> getCompaniesInMiscellandeousIndustry();
    List<Company> getCompaniesInPublicUtilitiesIndustry();
    List<Company> getCompaniesInTransportationIndustry();

    ArrayBlockingQueue<Company> getTechnologyCompaniesArray();
}
