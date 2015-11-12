package com.nyse.dao;

import com.nyse.model.CompanyIndexes;

/**
 * Created by TT on 6.11.2015 г..
 */
public interface CompanyIndexesDao {

    CompanyIndexes getCompanyByName(String name);
    CompanyIndexes getCompanyId(Long companyId);
    void save(CompanyIndexes companyIndexes);

}
