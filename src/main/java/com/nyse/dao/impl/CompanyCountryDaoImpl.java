package com.nyse.dao.impl;

import com.nyse.dao.AbstractDao;
import com.nyse.dao.CompanyCountryDao;
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
public class CompanyCountryDaoImpl extends AbstractDao implements CompanyCountryDao  {

    private final String GET_COMPANY_BY_COUNTRY = "from Company c where c.country = :country order by c.sector";

    @ExceptionHandler(Exception.class)
    @Override
    public List<Company> getCompanyByCountry(String country) {

        return getSession().createQuery(GET_COMPANY_BY_COUNTRY)
                .setParameter("country", country).list();
    }

}
