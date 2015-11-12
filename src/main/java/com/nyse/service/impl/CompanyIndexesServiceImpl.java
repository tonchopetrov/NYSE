package com.nyse.service.impl;

import com.nyse.dao.CompanyIndexesDao;
import com.nyse.model.CompanyIndexes;
import com.nyse.service.CompanyIndexesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TT on 6.11.2015 г..
 */
@Service
public class CompanyIndexesServiceImpl implements CompanyIndexesService {

    @Autowired
    private CompanyIndexesDao companyDao;

    @Override
    public CompanyIndexes getCompanyByName(String name) {
        return companyDao.getCompanyByName(name);
    }

    @Override
    public CompanyIndexes getCompanyById(Long companyId) {
        return companyDao.getCompanyId(companyId);
    }

    @Override
    public void save(CompanyIndexes companyIndexes) {
        companyDao.save(companyIndexes);
    }


}
