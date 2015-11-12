package com.nyse.dao.impl;

import com.nyse.dao.AbstractDao;
import com.nyse.dao.CompanyDao;
import com.nyse.model.Company;
import org.hibernate.Query;
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
public class CompanyDaoImpl extends AbstractDao implements CompanyDao {

    private final String GET_ALL_COMPANIES = " from Company where companyId >= 555";
    private final String GET_COMPANIES_BY_COUNTRY = "from Company where name = :country";
    private final String GET_COMPANIES_IN_REGION = "from Company where region = :region";
    private final String GET_COMPANY_BY_SYMBOL = "from Company where symbol = :symbol";
    private Query query = null;


    @ExceptionHandler(Exception.class)
    @Override
    public void saveCompany(Company company) {

        getSession().saveOrUpdate(company);
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getAllCompanies() {
        return getSession().createQuery(GET_ALL_COMPANIES).list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompanyByCountry(String country) {

        return getSession().createQuery(GET_COMPANIES_BY_COUNTRY)
                .setParameter("country",country).list();
    }

    @ExceptionHandler(Exception.class)
    @Override
    public Company getCompanyBySymbol(String symbol) {

        return (Company)getSession().createQuery(GET_COMPANY_BY_SYMBOL)
                .setParameter("symbol", symbol).list().get(0);
    }


}
