package com.nyse.model;

import javax.persistence.*;

/**
 * Created by TT on 6.11.2015 г..
 */
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @Column(name = "symbol")
    private String symbol;

    @Column(name = "companyId")
    private Integer companyId;

    @OneToOne
    @JoinColumn(name = "companyIndexId",referencedColumnName = "companyIndexId")
    private CompanyIndexes companyIndexes;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "industry")
    private String industry;

    @Column(name = "sector")
    private String sector;

    @Column(name = "lastScale")
    private String lastScale;

    @Column(name = "marketCap")
    private String marketCap;

    @Column(name = "adrTso")
    private String ardTso;

    @Column(name = "ipoYear")
    private String ipoYear;

    @Column(name = "sumaryQuote")
    private String sumaryQuote;

    @Column(name = "exchange")
    private String exchange;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public CompanyIndexes getCompanyIndexes() {
        return companyIndexes;
    }

    public void setCompanyIndexes(CompanyIndexes companyIndexes) {
        this.companyIndexes = companyIndexes;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLastScale() {
        return lastScale;
    }

    public void setLastScale(String lastScale) {
        this.lastScale = lastScale;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getIpoYear() {
        return ipoYear;
    }

    public void setIpoYear(String ipoYear) {
        this.ipoYear = ipoYear;
    }

    public String getSumaryQuote() {
        return sumaryQuote;
    }

    public void setSumaryQuote(String sumaryQuote) {
        this.sumaryQuote = sumaryQuote;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getArdTso() {
        return ardTso;
    }

    public void setArdTso(String ardTso) {
        this.ardTso = ardTso;
    }

    @Override
    public String toString() {
        return "Company{" +
                "symbol='" + symbol + '\'' +
                ", companyId" +companyId +'\''+
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", industry='" + industry + '\'' +
                ", sector='" + sector + '\'' +
                ", lastScale='" + lastScale + '\'' +
                ", marketCap='" + marketCap + '\'' +
                ", ardTso='" + ardTso + '\'' +
                ", ipoYear='" + ipoYear + '\'' +
                ", sumaryQuote='" + sumaryQuote + '\'' +
                ", exchange='" + exchange + '\'' +
                '}';
    }
}
