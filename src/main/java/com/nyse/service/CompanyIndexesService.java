package com.nyse.service;

import com.nyse.model.CompanyIndexes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by TT on 6.11.2015 г..
 */
@Service
@Transactional
public interface CompanyIndexesService {

    CompanyIndexes getCompanyByName(String name);
    CompanyIndexes getCompanyById(Long companyId);
    void save(CompanyIndexes companyIndexes);
}
