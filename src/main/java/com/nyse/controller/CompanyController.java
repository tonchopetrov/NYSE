package com.nyse.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nyse.model.Company;
import com.nyse.model.CompanyIndexes;
import com.nyse.service.CompanyIndexesService;
import com.nyse.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TT on 10.11.2015 г..
 */
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyIndexesService companyIndexesService;


    @RequestMapping(value = "/byName",method = RequestMethod.GET)
    public CompanyIndexes getCompanyByName(@RequestParam String name){

        return companyIndexesService.getCompanyByName(name);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public List<Company> addCompany(String name){

        return companyService.getAllCompanies();
    }

    @RequestMapping(value = "/getCompanyBySymbol",method = RequestMethod.GET)
    public Company getCompanyBySymbol(@RequestBody Company company){
        System.out.println("SYMBOL: "+company.getSymbol());
        return companyService.getCompanyBySymbol(company.getSymbol());
    }


    private Company getCompanyfromFile(){

        Company company = new Company();
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\Intellij Projects\\NYSE\\companylist.csv"));
            String line = null;
            String[] arr = null;
            int firstLine = 0;
            ArrayList<Company> companies = new ArrayList();
            while((line = br.readLine()) != null){
                String newLine = line.replaceAll("\"","");
                arr = newLine.split(",");

                if(firstLine <= 0){
//                    System.out.println(line);
                    firstLine++;
                    continue;
                }else {
                    company = new Company();
                    System.out.println(line);
                    for(int i = 0; i <= arr.length-1;i++){
                        company.setCountry("USA");
                        company.setRegion("North America");
                        company.setExchange("NYSE");

                        if(i == 0)company.setSymbol(arr[i]);
                        if(i == 1)company.setName(arr[i]);
                        if(i == 2)company.setLastScale(arr[i]);
                        if(i == 3)company.setMarketCap(arr[i]);
                        if(i == 4)company.setArdTso(arr[i]);
                        if(i == 5)company.setIpoYear(arr[i]);
                        if(i == 6)company.setSector(arr[i]);
                        if(i == 7)company.setIndustry(arr[i]);
                        if (i == 8)company.setSumaryQuote(arr[i]);
                    }
                    companies.add(company);
                }

            }
            System.out.println("\nBefore for: "+companies.size());
            if(companies.size() != 0){
                for(int i = 0; i <= companies.size()-1;i++){
                    companyService.saveCompany((Company) companies.get(i));
                    System.out.println(i + ": " + companies.get(i).toString());
                }
            }
            System.out.println("afer");
        }catch (Exception e){
            e.printStackTrace();
        }

        return company;
    }

    private CompanyIndexes getCompanyContents(String companySymbol){

        final String theUrl = "https://query.yahooapis.com/v1/public/yql?q=select%20"+
                "*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20%28%22"+
                companySymbol+"%22%29&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org"+
                "%2Falltableswithkeys&callback=";


        StringBuilder sb = new StringBuilder();
        String line = null;
        CompanyIndexes companyIndexes = null;
        try {
//            RestTemplate restTemplate = new RestTemplate();
//            JsonNode jsonNode = restTemplate.getForObject(theUrl,JsonNode.class);

            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            while((line = reader.readLine()) != null){
                sb.append(line+"\n");
            }
            reader.close();
            JsonElement jsonElement = new JsonParser().parse(sb.toString());
            JsonObject jo = jsonElement.getAsJsonObject().get("query")
                    .getAsJsonObject().get("results").getAsJsonObject().get("quote").getAsJsonObject();

            ObjectMapper mapper = new ObjectMapper();
            mapper.setDateFormat(new SimpleDateFormat("MM/dd/yyyy"));
            companyIndexes = mapper.readValue(jo.getAsJsonObject().toString(),CompanyIndexes.class);

        }catch (IOException ioe){
            System.out.println("URL io: "+ioe.getMessage());
        }catch (NullPointerException npe) {
            System.out.println("URL npe: " + npe.getMessage());
        }catch (Exception e){
            System.out.println("URL e: "+e.getMessage());
        }
        return companyIndexes;
    }

}

