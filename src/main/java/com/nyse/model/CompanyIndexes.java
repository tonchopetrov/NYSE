package com.nyse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TT on 6.11.2015 г..
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("all")
@Entity
@Table(name="companies_indexes")
public class CompanyIndexes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "companyIndexId")
    private Integer companyIndexId;

    @Column(name="companyId")
    private Integer companyId;

    @Column(name="Ask")
    @JsonProperty("Ask")
    private String ask;

    @Column(name = "CompanyName")
    @JsonProperty("CompanyName")
    private String companyName;

    @Column(name="ExchangeNickName")
    @JsonProperty("ExchangeNickName")
    private String exchangeNickName;

    @Column(name="Bid")
    @JsonProperty("Bid")
    private Double bid;

    @Column(name="AskRealTime")
    @JsonProperty("AskRealTime")
    private Double askRealTime;

    @Column(name="BidRealTime")
    @JsonProperty("BidRealTime")
    private Double bidRealTime;

    @Column(name = "BookValue")
    @JsonProperty("BookValue")
    private Double bookValue;

    @Column(name = "ChangePrecentChange")
    @JsonProperty("ChangePrecentChange")
    private String changePrecentChange;

    @Column(name="Changee")
    @JsonProperty("Change")
    private Double change;

    @Column(name="Commission")
    private Double commission;

    @Column(name = "Currency")
    @JsonProperty("Currency")
    private String currency;

    @Column(name = "ChangeRealTime")
    @JsonProperty("ChangeRealTime")
    private String changeRealTime;

    @Column(name = "AfterHoursChangeRealTime")
    @JsonProperty("AfterHoursChangeRealTime")
    private String afterHoursChangeRealTime;

    @Column(name = "DividentShare")
    @JsonProperty("DividentShare")
    private Double dividentShare;

    @Column(name = "LastTradeDate")
    @JsonProperty("LastTradeDate")
    private Date lastTradeDate;

    @Column(name = "TradeDate")
    @JsonProperty("TradeDate")
    private Date tradeDate;

    @Column(name = "EarningShare")
    @JsonProperty("EarningShare")
    private Double earningShare;

    @Column(name="EPSEstatimateCurrentYear")
    @JsonProperty("EPSEstatimateCurrentYear")
    private Double epseStatimateCurrentYear;

    @Column(name = "EPSEstatimateNextYear")
    @JsonProperty("EPSEstatimateNextYear")
    private Double epseStatimeNextYear;

    @Column(name = "EPSEstatimateNextQuarter")
    @JsonProperty("EPSEstatimateNextQuarter")
    private Double epstStatimateNextQuarter;

    @Column(name = "DaysLow")
    @JsonProperty("DaysLow")
    private Double daysLow;

    @Column(name = "DaysHigh")
    @JsonProperty("DaysHigh")
    private Double daysHigh;

    @Column(name = "YearLow")
    @JsonProperty("YearLow")
    private Double yearLow;

    @Column(name = "YearHigh")
    @JsonProperty("YearHigh")
    private Double yearHigh;

    @Column(name = "HoldingsGainPercent")
    @JsonProperty("HoldingsGainPercent")
    private Double holdingsGainPercent;

    @Column(name = "AnnualizedGain")
    @JsonProperty("AnnualizedGain")
    private Double annualizedGain;

    @Column(name = "HoldingsGain")
    @JsonProperty("HoldingsGain")
    private Double holdingsGain;

    @Column(name = "HoldingsGainPercentRealTime")
    @JsonProperty("HoldingsGainPercentRealTime")
    private Double holdingsGainPercentRealTime;

    @Column(name = "HoldingsGainRealTime")
    @JsonProperty("HoldingsGainRealTime")
    private Double holdingsGainRealTime;

    @Column(name = "MoreInfo")
    @JsonProperty("MoreInfo")
    private String moreInfo;

    @Column(name = "OrderBookRealTime")
    @JsonProperty("OrderBookRealTime")
    private String orderBookRealTime;

    @Column(name = "MarketCapitalization")
    @JsonProperty("MarketCapitalization")
    private String marketCapitalization;

    @Column(name = "MarketCapRealTime")
    @JsonProperty("MarketCapRealTime")
    private Double marketCapRealTime;

    @Column(name = "EBITDA")
    @JsonProperty("EBITDA")
    private String ebitda;

    @Column(name = "ChangeFormYearLow")
    @JsonProperty("ChangeFormYearLow")
    private Double changeFormYearLow;

    @Column(name = "PercentChangeFormYearLow")
    @JsonProperty("PercentChangeFormYearLow")
    private String PercentChangeFormYearLow;

    @Column(name = "PercebtChangeFromYearHigh")
    @JsonProperty("PercebtChangeFromYearHigh")
    private String percebtChangeFromYearHigh;

    @Column(name = "LastTradeRealTimeWithTime")
    @JsonProperty("LastTradeRealTimeWithTime")
    private String lasttradeRealTimeWithTime;

    @Column(name = "ChangePercentRealTime")
    @JsonProperty("ChangePercentRealTime")
    private Double changePercentRealTime;

    @Column(name = "ChangeFromYearHigh")
    @JsonProperty("ChangeFromYearHigh")
    private Double chnageFormYearHigh;

    @Column(name = "LastTradeWithTime")
    @JsonProperty("LastTradeWithTime")
    private String lastTradeWithTime;

    @Column(name = "LastTradePriceOnly")
    @JsonProperty("LastTradePriceOnly")
    private Double lastTradePriceOnly;

    @Column(name = "HighLimit")
    @JsonProperty("HighLimit")
    private Double highLimit;

    @Column(name = "LowLimit")
    @JsonProperty("LowLimit")
    private Double lowLimit;

    @Column(name = "DayRangeMin")
    @JsonProperty("DayRangeMin")
    private Double dayRangeMin;

    @Column(name = "DayRangeMax")
    @JsonProperty("DayRangeMax")
    private Double dayRangeMax;

    @Column(name = "DayRangeRealTime")
    @JsonProperty("DayRangeRealTime")
    private String dayRangeRealTtime;

    @Column(name = "FiftyDayMovingAverage")
    @JsonProperty("FiftyDayMovingAverage")
    private Double fiftyDayMovingAverage;

    @Column(name = "TwoHoundreddayMovingAverage")
    @JsonProperty("TwoHoundreddayMovingAverage")
    private Double twoHounreddayMovingAverage;

    @Column(name = "ChangeFromTwoHoundreddayMovingAverage")
    @JsonProperty("ChangeFromTwoHoundreddayMovingAverage")
    private String changeFromTwoHoundreddayMovingAverage;

    @Column(name = "PercentChangeFormFiftydayMovingAverage")
    @JsonProperty("PercentChangeFormFiftydayMovingAverage")
    private String percentChangeFormFiftyMovingAverage;

    @Column(name = "Notes")
    @JsonProperty("Notes")
    private String notes;

    @Column(name = "Open")
    @JsonProperty("Open")
    private Double open;

    @Column(name = "PreviosClosed")
    @JsonProperty("PreviosClosed")
    private Double previosClosed;

    @Column(name = "PricePaid")
    @JsonProperty("PricePaid")
    private Double pricePaid;

    @Column(name = "ChangeningPercent")
    @JsonProperty("ChangeningPercent")
    private String chnagePercent;

    @Column(name = "PriceSales")
    @JsonProperty("PriceSales")
    private Double priceSales;

    @Column(name="PriceBook")
    @JsonProperty("PriceBook")
    private Double priceBook;

    @Column(name = "ExDividenDate")
    @JsonProperty("ExDividenDate")
    private String exDividenDate;

    @Column(name = "PERation")
    @JsonProperty("PERation")
    private String peRation;

    @Column(name = "DividenPayDate")
    @JsonProperty("DividenPayDate")
    private String dividenPayDate;

    @Column(name = "PeRationRealTime")
    @JsonProperty("PeRationRealTime")
    private String peRationRealTime;

    @Column(name = "PEGRation")
    @JsonProperty("PEGRation")
    private Double pegRation;

    @Column(name="PriceEPSEstamateCurrentYear")
    @JsonProperty("PriceEPSEstamateCurrentYear")
    private Double priceEPSEstamateCurrentYear;

    @Column(name = "Symbol")
    @JsonProperty("Symbol")
    private String symbol;

    @Column(name = "SharesOwned")
    @JsonProperty("SharesOwned")
    private Double sharedOwned;

    @Column(name = "SortRation")
    @JsonProperty("SortRation")
    private Double sortRatio;

    @Column(name = "LastTradeTime")
    @JsonProperty("LastTradeTime")
    private String lastTradeTime;

    @Column(name = "TickerTrend")
    @JsonProperty("TickerTrend")
    private String tickerTrend;

    @Column(name = "OneyrTargetPrice")
    @JsonProperty("OneyrTargetPrice")
    private Double oneyrTargetPrice;

    @Column(name = "HoldingValues")
    @JsonProperty("HoldingValues")
    private String holdingValues;

    @Column(name = "HoldingsValueRealTime")
    @JsonProperty("HoldingsValueRealTime")
    private String holdingsValueRealTime;

    @Column(name = "YearRangeMin")
    @JsonProperty("YearRangeMin")
    private Double yearRangeMin;

    @Column(name="YearRangeMax")
    @JsonProperty("YearRangeMax")
    private Double yearRangeMax;

    @Column(name = "DaysValueChnage")
    @JsonProperty("DaysValueChnage")
    private String DaysValueChange;

    @Column(name = "DaysValueChangeRealTime")
    @JsonProperty("DaysValueChangeRealTime")
    private String daysValueChangeRealTime;

    @Column(name = "StockExchange")
    @JsonProperty("StockExchange")
    private String stockExchange;

    @Column(name = "PercentChange")
    @JsonProperty("PercentChange")
    private String percentChange;

    public Integer getCompanyIndexId() {
        return companyIndexId;
    }

    public void setCompanyIndexId(Integer companyIndexId) {
        this.companyIndexId = companyIndexId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExchangeNickName() {
        return exchangeNickName;
    }

    public void setExchangeNickName(String exchangeNickName) {
        this.exchangeNickName = exchangeNickName;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAskRealTime() {
        return askRealTime;
    }

    public void setAskRealTime(Double askRealTime) {
        this.askRealTime = askRealTime;
    }

    public Double getBidRealTime() {
        return bidRealTime;
    }

    public void setBidRealTime(Double bidRealTime) {
        this.bidRealTime = bidRealTime;
    }

    public Double getBookValue() {
        return bookValue;
    }

    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    public String getChangePrecentChange() {
        return changePrecentChange;
    }

    public void setChangePrecentChange(String changePrecentChange) {
        this.changePrecentChange = changePrecentChange;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getChangeRealTime() {
        return changeRealTime;
    }

    public void setChangeRealTime(String changeRealTime) {
        this.changeRealTime = changeRealTime;
    }

    public String getAfterHoursChangeRealTime() {
        return afterHoursChangeRealTime;
    }

    public void setAfterHoursChangeRealTime(String afterHoursChangeRealTime) {
        this.afterHoursChangeRealTime = afterHoursChangeRealTime;
    }

    public Double getDividentShare() {
        return dividentShare;
    }

    public void setDividentShare(Double dividentShare) {
        this.dividentShare = dividentShare;
    }

    public Date getLastTradeDate() {
        return lastTradeDate;
    }

    public void setLastTradeDate(Date lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Double getEarningShare() {
        return earningShare;
    }

    public void setEarningShare(Double earningShare) {
        this.earningShare = earningShare;
    }

    public Double getEpseStatimateCurrentYear() {
        return epseStatimateCurrentYear;
    }

    public void setEpseStatimateCurrentYear(Double epseStatimateCurrentYear) {
        this.epseStatimateCurrentYear = epseStatimateCurrentYear;
    }

    public Double getEpseStatimeNextYear() {
        return epseStatimeNextYear;
    }

    public void setEpseStatimeNextYear(Double epseStatimeNextYear) {
        this.epseStatimeNextYear = epseStatimeNextYear;
    }

    public Double getEpstStatimateNextQuarter() {
        return epstStatimateNextQuarter;
    }

    public void setEpstStatimateNextQuarter(Double epstStatimateNextQuarter) {
        this.epstStatimateNextQuarter = epstStatimateNextQuarter;
    }

    public Double getDaysLow() {
        return daysLow;
    }

    public void setDaysLow(Double daysLow) {
        this.daysLow = daysLow;
    }

    public Double getDaysHigh() {
        return daysHigh;
    }

    public void setDaysHigh(Double daysHigh) {
        this.daysHigh = daysHigh;
    }

    public Double getYearLow() {
        return yearLow;
    }

    public void setYearLow(Double yearLow) {
        this.yearLow = yearLow;
    }

    public Double getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(Double yearHigh) {
        this.yearHigh = yearHigh;
    }

    public Double getHoldingsGainPercent() {
        return holdingsGainPercent;
    }

    public void setHoldingsGainPercent(Double holdingsGainPercent) {
        this.holdingsGainPercent = holdingsGainPercent;
    }

    public Double getAnnualizedGain() {
        return annualizedGain;
    }

    public void setAnnualizedGain(Double annualizedGain) {
        this.annualizedGain = annualizedGain;
    }

    public Double getHoldingsGain() {
        return holdingsGain;
    }

    public void setHoldingsGain(Double holdingsGain) {
        this.holdingsGain = holdingsGain;
    }

    public Double getHoldingsGainPercentRealTime() {
        return holdingsGainPercentRealTime;
    }

    public void setHoldingsGainPercentRealTime(Double holdingsGainPercentRealTime) {
        this.holdingsGainPercentRealTime = holdingsGainPercentRealTime;
    }

    public Double getHoldingsGainRealTime() {
        return holdingsGainRealTime;
    }

    public void setHoldingsGainRealTime(Double holdingsGainRealTime) {
        this.holdingsGainRealTime = holdingsGainRealTime;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getOrderBookRealTime() {
        return orderBookRealTime;
    }

    public void setOrderBookRealTime(String orderBookRealTime) {
        this.orderBookRealTime = orderBookRealTime;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public Double getMarketCapRealTime() {
        return marketCapRealTime;
    }

    public void setMarketCapRealTime(Double marketCapRealTime) {
        this.marketCapRealTime = marketCapRealTime;
    }

    public String getEbitda() {
        return ebitda;
    }

    public void setEbitda(String ebitda) {
        this.ebitda = ebitda;
    }

    public Double getChangeFormYearLow() {
        return changeFormYearLow;
    }

    public void setChangeFormYearLow(Double changeFormYearLow) {
        this.changeFormYearLow = changeFormYearLow;
    }

    public String getPercentChangeFormYearLow() {
        return PercentChangeFormYearLow;
    }

    public void setPercentChangeFormYearLow(String percentChangeFormYearLow) {
        PercentChangeFormYearLow = percentChangeFormYearLow;
    }

    public String getPercebtChangeFromYearHigh() {
        return percebtChangeFromYearHigh;
    }

    public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh) {
        this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
    }

    public String getLasttradeRealTimeWithTime() {
        return lasttradeRealTimeWithTime;
    }

    public void setLasttradeRealTimeWithTime(String lasttradeRealTimeWithTime) {
        this.lasttradeRealTimeWithTime = lasttradeRealTimeWithTime;
    }

    public Double getChangePercentRealTime() {
        return changePercentRealTime;
    }

    public void setChangePercentRealTime(Double changePercentRealTime) {
        this.changePercentRealTime = changePercentRealTime;
    }

    public Double getChnageFormYearHigh() {
        return chnageFormYearHigh;
    }

    public void setChnageFormYearHigh(Double chnageFormYearHigh) {
        this.chnageFormYearHigh = chnageFormYearHigh;
    }

    public String getLastTradeWithTime() {
        return lastTradeWithTime;
    }

    public void setLastTradeWithTime(String lastTradeWithTime) {
        this.lastTradeWithTime = lastTradeWithTime;
    }

    public Double getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    public void setLastTradePriceOnly(Double lastTradePriceOnly) {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    public Double getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(Double highLimit) {
        this.highLimit = highLimit;
    }

    public Double getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(Double lowLimit) {
        this.lowLimit = lowLimit;
    }

    public Double getDayRangeMin() {
        return dayRangeMin;
    }

    public void setDayRangeMin(Double dayRangeMin) {
        this.dayRangeMin = dayRangeMin;
    }

    public Double getDayRangeMax() {
        return dayRangeMax;
    }

    public void setDayRangeMax(Double dayRangeMax) {
        this.dayRangeMax = dayRangeMax;
    }

    public String getDayRangeRealTtime() {
        return dayRangeRealTtime;
    }

    public void setDayRangeRealTtime(String dayRangeRealTtime) {
        this.dayRangeRealTtime = dayRangeRealTtime;
    }

    public Double getFiftyDayMovingAverage() {
        return fiftyDayMovingAverage;
    }

    public void setFiftyDayMovingAverage(Double fiftyDayMovingAverage) {
        this.fiftyDayMovingAverage = fiftyDayMovingAverage;
    }

    public Double getTwoHounreddayMovingAverage() {
        return twoHounreddayMovingAverage;
    }

    public void setTwoHounreddayMovingAverage(Double twoHounreddayMovingAverage) {
        this.twoHounreddayMovingAverage = twoHounreddayMovingAverage;
    }

    public String getChangeFromTwoHoundreddayMovingAverage() {
        return changeFromTwoHoundreddayMovingAverage;
    }

    public void setChangeFromTwoHoundreddayMovingAverage(String changeFromTwoHoundreddayMovingAverage) {
        this.changeFromTwoHoundreddayMovingAverage = changeFromTwoHoundreddayMovingAverage;
    }

    public String getPercentChangeFormFiftyMovingAverage() {
        return percentChangeFormFiftyMovingAverage;
    }

    public void setPercentChangeFormFiftyMovingAverage(String percentChangeFormFiftyMovingAverage) {
        this.percentChangeFormFiftyMovingAverage = percentChangeFormFiftyMovingAverage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getPreviosClosed() {
        return previosClosed;
    }

    public void setPreviosClosed(Double previosClosed) {
        this.previosClosed = previosClosed;
    }

    public Double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public String getChnagePercent() {
        return chnagePercent;
    }

    public void setChnagePercent(String chnagePercent) {
        this.chnagePercent = chnagePercent;
    }

    public Double getPriceSales() {
        return priceSales;
    }

    public void setPriceSales(Double priceSales) {
        this.priceSales = priceSales;
    }

    public Double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(Double priceBook) {
        this.priceBook = priceBook;
    }

    public String getExDividenDate() {
        return exDividenDate;
    }

    public void setExDividenDate(String exDividenDate) {
        this.exDividenDate = exDividenDate;
    }

    public String getPeRation() {
        return peRation;
    }

    public void setPeRation(String peRation) {
        this.peRation = peRation;
    }

    public String getDividenPayDate() {
        return dividenPayDate;
    }

    public void setDividenPayDate(String dividenPayDate) {
        this.dividenPayDate = dividenPayDate;
    }

    public String getPeRationRealTime() {
        return peRationRealTime;
    }

    public void setPeRationRealTime(String peRationRealTime) {
        this.peRationRealTime = peRationRealTime;
    }

    public Double getPegRation() {
        return pegRation;
    }

    public void setPegRation(Double pegRation) {
        this.pegRation = pegRation;
    }

    public Double getPriceEPSEstamateCurrentYear() {
        return priceEPSEstamateCurrentYear;
    }

    public void setPriceEPSEstamateCurrentYear(Double priceEPSEstamateCurrentYear) {
        this.priceEPSEstamateCurrentYear = priceEPSEstamateCurrentYear;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getSharedOwned() {
        return sharedOwned;
    }

    public void setSharedOwned(Double sharedOwned) {
        this.sharedOwned = sharedOwned;
    }

    public Double getSortRatio() {
        return sortRatio;
    }

    public void setSortRatio(Double sortRatio) {
        this.sortRatio = sortRatio;
    }

    public String getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public String getTickerTrend() {
        return tickerTrend;
    }

    public void setTickerTrend(String tickerTrend) {
        this.tickerTrend = tickerTrend;
    }

    public Double getOneyrTargetPrice() {
        return oneyrTargetPrice;
    }

    public void setOneyrTargetPrice(Double oneyrTargetPrice) {
        this.oneyrTargetPrice = oneyrTargetPrice;
    }

    public String getHoldingValues() {
        return holdingValues;
    }

    public void setHoldingValues(String holdingValues) {
        this.holdingValues = holdingValues;
    }

    public String getHoldingsValueRealTime() {
        return holdingsValueRealTime;
    }

    public void setHoldingsValueRealTime(String holdingsValueRealTime) {
        this.holdingsValueRealTime = holdingsValueRealTime;
    }

    public Double getYearRangeMin() {
        return yearRangeMin;
    }

    public void setYearRangeMin(Double yearRangeMin) {
        this.yearRangeMin = yearRangeMin;
    }

    public Double getYearRangeMax() {
        return yearRangeMax;
    }

    public void setYearRangeMax(Double yearRangeMax) {
        this.yearRangeMax = yearRangeMax;
    }

    public String getDaysValueChange() {
        return DaysValueChange;
    }

    public void setDaysValueChange(String daysValueChange) {
        DaysValueChange = daysValueChange;
    }

    public String getDaysValueChangeRealTime() {
        return daysValueChangeRealTime;
    }

    public void setDaysValueChangeRealTime(String daysValueChangeRealTime) {
        this.daysValueChangeRealTime = daysValueChangeRealTime;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    @Override
    public String toString() {
        return "CompanyIndexes{" +
                "companyIndexId=" + companyIndexId +
                ", companyId=" + companyId +
                ", ask='" + ask + '\'' +
                ", companyName='" + companyName + '\'' +
                ", exchangeNickName='" + exchangeNickName + '\'' +
                ", bid=" + bid +
                ", askRealTime=" + askRealTime +
                ", bidRealTime=" + bidRealTime +
                ", bookValue=" + bookValue +
                ", changePrecentChange='" + changePrecentChange + '\'' +
                ", change=" + change +
                ", commission=" + commission +
                ", currency='" + currency + '\'' +
                ", changeRealTime='" + changeRealTime + '\'' +
                ", afterHoursChangeRealTime='" + afterHoursChangeRealTime + '\'' +
                ", dividentShare=" + dividentShare +
                ", lastTradeDate=" + lastTradeDate +
                ", tradeDate=" + tradeDate +
                ", earningShare=" + earningShare +
                ", epseStatimateCurrentYear=" + epseStatimateCurrentYear +
                ", epseStatimeNextYear=" + epseStatimeNextYear +
                ", epstStatimateNextQuarter=" + epstStatimateNextQuarter +
                ", daysLow=" + daysLow +
                ", daysHigh=" + daysHigh +
                ", yearLow=" + yearLow +
                ", yearHigh=" + yearHigh +
                ", holdingsGainPercent=" + holdingsGainPercent +
                ", annualizedGain=" + annualizedGain +
                ", holdingsGain=" + holdingsGain +
                ", holdingsGainPercentRealTime=" + holdingsGainPercentRealTime +
                ", holdingsGainRealTime=" + holdingsGainRealTime +
                ", moreInfo='" + moreInfo + '\'' +
                ", orderBookRealTime='" + orderBookRealTime + '\'' +
                ", marketCapitalization='" + marketCapitalization + '\'' +
                ", marketCapRealTime=" + marketCapRealTime +
                ", ebitda='" + ebitda + '\'' +
                ", changeFormYearLow=" + changeFormYearLow +
                ", PercentChangeFormYearLow='" + PercentChangeFormYearLow + '\'' +
                ", percebtChangeFromYearHigh='" + percebtChangeFromYearHigh + '\'' +
                ", lasttradeRealTimeWithTime='" + lasttradeRealTimeWithTime + '\'' +
                ", changePercentRealTime=" + changePercentRealTime +
                ", chnageFormYearHigh=" + chnageFormYearHigh +
                ", lastTradeWithTime='" + lastTradeWithTime + '\'' +
                ", lastTradePriceOnly=" + lastTradePriceOnly +
                ", highLimit=" + highLimit +
                ", lowLimit=" + lowLimit +
                ", dayRangeMin=" + dayRangeMin +
                ", dayRangeMax=" + dayRangeMax +
                ", dayRangeRealTtime='" + dayRangeRealTtime + '\'' +
                ", fiftyDayMovingAverage=" + fiftyDayMovingAverage +
                ", twoHounreddayMovingAverage=" + twoHounreddayMovingAverage +
                ", changeFromTwoHoundreddayMovingAverage='" + changeFromTwoHoundreddayMovingAverage + '\'' +
                ", percentChangeFormFiftyMovingAverage='" + percentChangeFormFiftyMovingAverage + '\'' +
                ", notes='" + notes + '\'' +
                ", open=" + open +
                ", previosClosed=" + previosClosed +
                ", pricePaid=" + pricePaid +
                ", chnagePercent='" + chnagePercent + '\'' +
                ", priceSales=" + priceSales +
                ", priceBook=" + priceBook +
                ", exDividenDate='" + exDividenDate + '\'' +
                ", peRation='" + peRation + '\'' +
                ", dividenPayDate='" + dividenPayDate + '\'' +
                ", peRationRealTime='" + peRationRealTime + '\'' +
                ", pegRation=" + pegRation +
                ", priceEPSEstamateCurrentYear=" + priceEPSEstamateCurrentYear +
                ", symbol='" + symbol + '\'' +
                ", sharedOwned=" + sharedOwned +
                ", sortRatio=" + sortRatio +
                ", lastTradeTime='" + lastTradeTime + '\'' +
                ", tickerTrend='" + tickerTrend + '\'' +
                ", oneyrTargetPrice=" + oneyrTargetPrice +
                ", holdingValues='" + holdingValues + '\'' +
                ", holdingsValueRealTime='" + holdingsValueRealTime + '\'' +
                ", yearRangeMin=" + yearRangeMin +
                ", yearRangeMax=" + yearRangeMax +
                ", DaysValueChange='" + DaysValueChange + '\'' +
                ", daysValueChangeRealTime='" + daysValueChangeRealTime + '\'' +
                ", stockExchange='" + stockExchange + '\'' +
                ", percentChange='" + percentChange + '\'' +
                '}';
    }
}
