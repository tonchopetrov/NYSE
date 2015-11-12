package com.nyse.dao.impl;

import com.nyse.dao.AbstractDao;
import com.nyse.dao.CompanyIndustryDao;
import com.nyse.model.Company;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

/**
 * Created by TT on 6.11.2015 г..
 */
@SuppressWarnings("all")
@Repository
@Transactional
public class CompanyIndustryDaoImpl extends AbstractDao implements CompanyIndustryDao {


    private final String GET_COMPANIES_IN_SECTOR = "from Company where sector = :sector";

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getTechnologyCompanies() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Technology").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInBasicIndustry() {

        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Basic Industries").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInCapitalGoodsIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Capital Goods").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInConsumerDurablesIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Consumer Durables").list();
    }

    @Override
    public List<Company> getCompaniesInConsumerNonDurIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Consumer Non-Durables").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInConsumerServiceIndurstry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Consumer Services").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInEnergyIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Energy").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInFinanceIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Finance").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInHealthIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Health Care").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInMiscellandeousIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Miscellaneous").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInPublicUtilitiesIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Public Utilities").list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompaniesInTransportationIndustry() {
        return getSession().createQuery(GET_COMPANIES_IN_SECTOR)
                .setParameter("sector", "Transportation").list();
    }

}
