package com.nyse.service.impl;

import com.nyse.dao.CompanyIndustryDao;
import com.nyse.model.Company;
import com.nyse.service.CompanyIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by TT on 8.11.2015 г..
 */
@Service
public class CompanyIndustryServiceImpl implements CompanyIndustryService {

    private final int STANDART_LENGTH = 100;


//    private ArrayBlockingQueue<Company> technology = null;
//    private ArrayBlockingQueue<Company> basicIndustries = null;
//    private ArrayBlockingQueue<Company> capitalGoods = null;
//    private ArrayBlockingQueue<Company> consumerDurables = null;
//    private ArrayBlockingQueue<Company> consumerNonDur = null;
//    private ArrayBlockingQueue<Company> consumerService = null;
//    private ArrayBlockingQueue<Company> energy = null;
//    private ArrayBlockingQueue<Company> finance = null;
//    private ArrayBlockingQueue<Company> healthcare = null;
//    private ArrayBlockingQueue<Company> muscellandeous = null;
//    private ArrayBlockingQueue<Company> publicUtilities = null;
//    private ArrayBlockingQueue<Company> transportation = null;
    private ArrayBlockingQueue<Company> technology = null;

    @Autowired
    private CompanyIndustryDao companyDao;

    @Override
    public List<Company> getTechnologyCompanies() {

        return companyDao.getTechnologyCompanies();
    }

    @Override
    public List<Company> getCompaniesInBasicIndustry() {

        return companyDao.getCompaniesInBasicIndustry();
    }

    @Override
    public List<Company> getCompaniesInCapitalGoodsIndustry() {
        return companyDao.getCompaniesInCapitalGoodsIndustry();
    }

    @Override
    public List<Company> getCompaniesInConsumerDurablesIndustry() {
        return companyDao.getCompaniesInConsumerDurablesIndustry();
    }

    @Override
    public List<Company> getCompaniesInConsumerNonDurIndustry() {
        return companyDao.getCompaniesInConsumerNonDurIndustry();
    }

    @Override
    public List<Company> getCompaniesInConsumerServiceIndurstry() {
        return companyDao.getCompaniesInConsumerServiceIndurstry();
    }

    @Override
    public List<Company> getCompaniesInEnergyIndustry() {
        return companyDao.getCompaniesInEnergyIndustry();
    }

    @Override
    public List<Company> getCompaniesInFinanceIndustry() {
        return companyDao.getCompaniesInFinanceIndustry();
    }

    @Override
    public List<Company> getCompaniesInHealthIndustry() {
        return companyDao.getCompaniesInHealthIndustry();
    }

    @Override
    public List<Company> getCompaniesInMiscellandeousIndustry() {
        return companyDao.getCompaniesInMiscellandeousIndustry();
    }

    @Override
    public List<Company> getCompaniesInPublicUtilitiesIndustry() {
        return companyDao.getCompaniesInPublicUtilitiesIndustry();
    }

    @Override
    public List<Company> getCompaniesInTransportationIndustry() {
        return companyDao.getCompaniesInTransportationIndustry();
    }

    @Override
    public ArrayBlockingQueue<Company> getTechnologyCompaniesArray() {
        return technology;
    }

    @PostConstruct
    private void initGetTechnologyCompanies(){
        technology = new ArrayBlockingQueue<Company>(STANDART_LENGTH);

        new Thread(() -> {
            companyDao.getTechnologyCompanies().stream().forEach(company -> {
                technology.add(company);
            });
        }).start();
    }

//    @PostConstruct
//    private void getBasicIndustryCompanies(){
//        basicIndustries = new ArrayBlockingQueue<Company>(STANDART_LENGTH * 2);
//
//        new Thread(() ->{
//            companyDao.getCompaniesInBasicIndustry().stream().forEach(company -> basicIndustries.add(company));
//        }).start();
//    }
//
//    @PostConstruct
//    private void getCapitalGoodsCompanies(){
//        capitalGoods = new ArrayBlockingQueue<Company>(STANDART_LENGTH);
//
//        new Thread(() ->{
//            companyDao.getCompaniesInCapitalGoodsIndustry().stream().forEach(company -> capitalGoods.add(company));
//        }).start();
//    }
//
//    @PostConstruct
//    private void getConsumerDurablesCompanies(){
//        consumerDurables = new ArrayBlockingQueue<Company>(STANDART_LENGTH);
//
//        new Thread(() ->{
//            companyDao.getCompaniesInConsumerDurablesIndustry().stream().forEach(company -> consumerDurables.add(company));
//        }).start();
//    }
//
//    @PostConstruct
//    private void getConsumerNonDurCompanies(){
//        consumerNonDur = new ArrayBlockingQueue<Company>(STANDART_LENGTH);
//
//        new Thread(() ->{
//            companyDao.getCompaniesInConsumerNonDurIndustry().stream().forEach(company -> consumerNonDur.add(company));
//        }).start();
//    }
//
//    @PostConstruct
//    private void getConsumerServicesCompanies(){
//        consumerService = new ArrayBlockingQueue<Company>(STANDART_LENGTH * 2);
//
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        new Thread(() ->{
//            companyDao.getCompaniesInConsumerServiceIndurstry().stream().forEach(company -> consumerService.add(company));
//        }).start();
//    }
//
//    @PostConstruct
//    private void getEnergyCompanies(){
//        energy = new ArrayBlockingQueue<Company>(STANDART_LENGTH * 2);
//


}
