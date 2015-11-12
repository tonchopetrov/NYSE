package com.nyse.controller;

import com.nyse.model.Company;
import com.nyse.service.CompanyIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by TT on 6.11.2015 г..
 */
@RestController
public class CompanyIndustryController {

    @Autowired
    private CompanyIndustryService companyIndustryService;


    @RequestMapping(value = "/loadSectorTechnology",method = RequestMethod.GET)
    public ArrayBlockingQueue<Company> loadTechnologyCompanies(){

        return companyIndustryService.getTechnologyCompaniesArray();
    }

    @RequestMapping(value = "/loadBasicIndustry",method = RequestMethod.GET)
    public List<Company> loadBasicIndustryCompanies(){
        return companyIndustryService.getCompaniesInBasicIndustry();
    }

    @RequestMapping(value = "/loadTransportation",method = RequestMethod.GET)
    public List<Company> getTransportationCompanies(){
        return companyIndustryService.getCompaniesInTransportationIndustry();
    }

    @RequestMapping(value = "/loadPublicUtilities",method = RequestMethod.GET)
    public List<Company> getPublicUtilityCompanies(){
        return companyIndustryService.getCompaniesInPublicUtilitiesIndustry();
    }

    @RequestMapping(value = "/loadMiscellaneous",method = RequestMethod.GET)
    public List<Company> getMiscellaneousCompanies(){
        return companyIndustryService.getCompaniesInMiscellandeousIndustry();
    }

    @RequestMapping(value = "/loadHealthCare",method = RequestMethod.GET)
    public List<Company> getHealthCareCompanies(){

        return companyIndustryService.getCompaniesInHealthIndustry();
    }

    @RequestMapping(value = "/loadFinance",method = RequestMethod.GET)
    public List<Company> getFinanceCompanies(){
        return companyIndustryService.getCompaniesInFinanceIndustry();
    }

    @RequestMapping(value = "/loadEnergy",method = RequestMethod.GET)
    public List<Company> getEnergyCompanies(){
        return companyIndustryService.getCompaniesInEnergyIndustry();
    }

    @RequestMapping(value = "/loadConsumerService",method = RequestMethod.GET)
    public List<Company> getConsumerServicesCompanies(){
        return companyIndustryService.getCompaniesInConsumerServiceIndurstry();
    }

    @RequestMapping(value = "/loadConsumerDurables",method = RequestMethod.GET)
    public List<Company> getConsumerDurablesCompanies(){
        return companyIndustryService.getCompaniesInConsumerDurablesIndustry();
    }

    @RequestMapping(value = "/loadConsumerNonDur",method = RequestMethod.GET)
    public List<Company> getConsumerNonDurCompanies(){
        return companyIndustryService.getCompaniesInConsumerNonDurIndustry();
    }

    @RequestMapping(value = "/loadCapitalGoods",method = RequestMethod.GET)
    public List<Company> getConsumerCapitalGoodsCompanies(){
        return companyIndustryService.getCompaniesInCapitalGoodsIndustry();
    }



}
