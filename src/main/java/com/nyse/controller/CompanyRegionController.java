package com.nyse.controller;

import com.nyse.model.Company;
import com.nyse.service.CompanyRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
//@ControllerAdvice
@RestController
public class CompanyRegionController {

    @Autowired
    private CompanyRegionService companyRegionService;

    @RequestMapping(value = "/fromAfrica",method = RequestMethod.GET)
    public List<Company> getCompanyFromAfrica(){
        return companyRegionService.getCompaniesInAfrica();
    }

    @RequestMapping(value = "/fromAsia",method = RequestMethod.GET)
    public List<Company> getCompanyFromAsia(){
        return companyRegionService.getCompaniesInAsia();
    }


    @RequestMapping(value = "/fromAustraliaAndSouthPacific",method = RequestMethod.GET)
    public List<Company> getCompanyFromAustraliaAndSouthPacific(){
        return companyRegionService.getCompaniesInAustraliaAndSouthPacific();
    }

    @RequestMapping(value = "/fromCentralAmericaAndCaribbean",method = RequestMethod.GET)
    public List<Company> getCompanyFromCentralAmericaAndCaribbean(){
        return companyRegionService.getCompaniesInCentralAmericaAndCaribbean();
    }

    @RequestMapping(value = "/fromEurope",method = RequestMethod.GET)
    public List<Company> getCompanyFromEurope(){
        return companyRegionService.getCompaniesInEurope();
    }

    @RequestMapping(value = "/fromSouthAmerica",method = RequestMethod.GET)
    public List<Company> getCompanyFromSouthAmerica(){
        return companyRegionService.getCompaniesInSouthAmerica();
    }

    @RequestMapping(value = "/fromMiddleEast",method = RequestMethod.GET)
    public List<Company> getCompanyFromMiddleEast(){
        return companyRegionService.getCompaniesInMiddleEast();
    }

    @RequestMapping(value = "/fromNortAmerica",method = RequestMethod.GET)
    public List<Company> getCompanyFromNorthAmerica(){
        return companyRegionService.getCompaniesInNorthAmerica();
    }
}
