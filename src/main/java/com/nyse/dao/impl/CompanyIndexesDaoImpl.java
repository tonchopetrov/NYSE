package com.nyse.dao.impl;

import com.nyse.dao.AbstractDao;
import com.nyse.dao.CompanyIndexesDao;
import com.nyse.model.CompanyIndexes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by TT on 6.11.2015 г..
 */

@SuppressWarnings("all")
@Repository
@Transactional
public class CompanyIndexesDaoImpl extends AbstractDao implements CompanyIndexesDao {

    private final String GET_COMPANY_BY_NAME = "from CompanyIndexes where name like ':name'";
    private final String GET_COMPANY_BY_ID = "from CompanyIndexes where companyId = ':companyId'";
    private final String GET_ALL_COMPANY = " from CompanyIndexes";
    private CompanyIndexes companyIndexes = null;
    private Query query = null;


    @ExceptionHandler(Exception.class)
    @Override
    public CompanyIndexes getCompanyByName(String name) {

        try {
//            query = sessionFactory.getCurrentSession().createQuery(GET_COMPANY_BY_NAME);
//            query.setParameter("name",name);
//            companyIndexes =(CompanyIndexes)query.list().get(0);
            System.out.println(companyIndexes.toString());
        }catch (HibernateException he){
            System.out.println("ByName he: "+he.getMessage());
        }catch (NullPointerException npe){
            System.out.println("ByName npe: " + npe.getMessage());
        }catch (Exception e){
            System.out.println("ByName e: "+e.getMessage());
        }
        return companyIndexes;
    }

    @ExceptionHandler(Exception.class)
    @Override
    public CompanyIndexes getCompanyId(Long companyId) {
        try {
            query = getSession().createQuery(GET_COMPANY_BY_ID);
            query.setParameter("companyId",companyId);
            companyIndexes =(CompanyIndexes)query.list().get(0);
        }catch (HibernateException he){
            System.out.println("ById he: "+he.getMessage());
        }catch (NullPointerException npe){
            System.out.println("ById npe: " + npe.getMessage());
        }catch (Exception e){
            System.out.println("ById e: "+e.getMessage());
        }
        return companyIndexes;
    }

    @ExceptionHandler(Exception.class)
    @Override
    public void save(CompanyIndexes companyIndexes) {

//            List<CompanyIndexes> list = sessionFactory.getCurrentSession().createQuery(GET_ALL_COMPANY).list();
//            for(int i = 0; i < list.size();i++){
//                companyIndexes = list.get(i);
//                if(companyIndexes.getCompanyIndexId() == 0){
//                    companyIndexes.setCompanyIndexId(companyIndexes.getCompanyId());
//                }
//                sessionFactory.getCurrentSession().saveOrUpdate(companyIndexes);
//            }
         getSession().save(companyIndexes);
    }

}
