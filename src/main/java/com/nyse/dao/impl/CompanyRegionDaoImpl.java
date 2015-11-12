package com.nyse.dao.impl;

import com.nyse.dao.AbstractDao;
import com.nyse.dao.CompanyRegionDao;
import com.nyse.model.Company;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

/**
 * Created by TT on 9.11.2015 г..
 */

@SuppressWarnings("all")
@Repository
@Transactional
public class CompanyRegionDaoImpl extends AbstractDao implements CompanyRegionDao {


    private final String GET_COMPANIES_IN_REGION = "from Company  where region = :region";


    @Override
    public List<Company> getCompaniesInAfrica() {

        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "Africa").list();
    }

    @Override
    public List<Company> getCompaniesInAsia() {

        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "Asia").list();
    }

    @Override
    public List<Company> getCompaniesInAustraliaAndSouthPacific() {
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "Australia and South Pacific").list();
    }

    @Override
    public List<Company> getCompaniesInCentralAmericaAndCaribbean() {
        System.out.println(" CARIBBEAN !!!!!!!!!!!!!!!!");
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region","Caribbean").list();
//                .setParameter("region","Central America and Caribbean").list();

    }

    @Override
    public List<Company> getCompaniesInEurope() {
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "Europe").list();
    }

    @Override
    public List<Company> getCompaniesInSouthAmerica() {
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "South America").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInMiddleEast() {
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "Middle East").list();
    }

    @Override
    public List<Company> getCompaniesInNortAmerica() {
        return getSession().createQuery(GET_COMPANIES_IN_REGION)
                .setParameter("region", "North America").list();
    }
}
