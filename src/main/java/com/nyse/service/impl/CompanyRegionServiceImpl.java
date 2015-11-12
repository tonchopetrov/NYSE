package com.nyse.service.impl;

import com.nyse.dao.CompanyRegionDao;
import com.nyse.model.Company;
import com.nyse.service.CompanyRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by TT on 9.11.2015 г..
 */
@Service
public class CompanyRegionServiceImpl implements CompanyRegionService {

    private ArrayBlockingQueue<Company> africaCompanies = null;
    private ArrayBlockingQueue<Company> asiaCompanies = null;
    private ArrayBlockingQueue<Company> australiaAndSouthPacificCompanies = null;
    private ArrayBlockingQueue<Company> europeCompanies = null;
    private ArrayBlockingQueue<Company> southAmericaCompanies = null;
    private ArrayBlockingQueue<Company> middleEastCompanies = null;
    private ArrayBlockingQueue<Company> nortAmericaCompanies = null;

    @Autowired
    private CompanyRegionDao companyRegionDao;

    @Override
    public List<Company> getCompaniesInAfrica() {
        return companyRegionDao.getCompaniesInAfrica();
    }

    @Override
    public List<Company> getCompaniesInAsia() {
        return companyRegionDao.getCompaniesInAsia();
    }

    @Override
    public List<Company> getCompaniesInAustraliaAndSouthPacific() {
        return companyRegionDao.getCompaniesInAustraliaAndSouthPacific();
    }

    @Override
    public List<Company> getCompaniesInCentralAmericaAndCaribbean() {
        return companyRegionDao.getCompaniesInCentralAmericaAndCaribbean();
    }

    @Override
    public List<Company> getCompaniesInEurope() {
        return companyRegionDao.getCompaniesInEurope();
    }

    @Override
    public List<Company> getCompaniesInSouthAmerica() {
        return companyRegionDao.getCompaniesInSouthAmerica();
    }

    @Override
    public List<Company> getCompaniesInMiddleEast() {
        return companyRegionDao.getCompaniesInMiddleEast();
    }

    @Override
    public List<Company> getCompaniesInNorthAmerica() {
        return companyRegionDao.getCompaniesInNortAmerica();
    }

}
