package com.nyse.controller;

import com.nyse.model.Company;
import com.nyse.service.CompanyCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */
@RestController
public class CompanyCountryController {

    @Autowired
    private CompanyCountryService companyCountryService;


    @RequestMapping(value = "/companiesInCountry{country}", method = RequestMethod.POST)
    public List<Company> getCompanyInCountry(@PathVariable String country) {

        if(country.equalsIgnoreCase("united states")){
            country = "USA";
        }

        return  companyCountryService.getCompanyByCountry(country);
    }
}
