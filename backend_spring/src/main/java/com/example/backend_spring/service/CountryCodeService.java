package com.example.backend_spring.service;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.util.*;

@Service
public class CountryCodeService {
    @Autowired
    Country country;

    private HashMap<String, Country> countries;
    String fileName = "Countries.csv";
    public CountryCodeService() {
        countries = readCountriesCSV();
    }

    public HashMap<String, Country> readCountriesCSV() {
        HashMap<String, Country> output = new HashMap<>();

        try {
            File file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + fileName);

            CSVReader csvReader = new CSVReaderBuilder(new FileReader(file))
                                                    .withSkipLines(1)
                                                    .build();
            List<String[]> data = csvReader.readAll();

            for(String[] line: data) {
                Country country = new Country();
                country.setFull_name(line[0]);
                country.setAlpha_code(line[1]);
                country.setCountry_code(Long.parseLong(line[2]));
                output.put(line[1], country);
            }

        } catch (Exception e) {
            System.out.println(e);;
        }
        return output;
    }

    public Long getCountryCode(String alphaCode) {
        return countries.get(alphaCode).getCountry_code();
    }

    public Map<String, String> getRandomCountryCode() {
        Set<String> allAlphaCodes = countries.keySet();
        String getRandAlphaCode = allAlphaCodes.stream()
                                                .skip(new Random().nextInt(allAlphaCodes.size()))
                                                .findFirst()
                                                .get();

        Country randCountry = countries.get(getRandAlphaCode);
        return Map.ofEntries(new AbstractMap.SimpleEntry<>("full_name", randCountry.getFull_name()),
                            new AbstractMap.SimpleEntry<>("country_code", randCountry.getAlpha_code()));
    }
}
