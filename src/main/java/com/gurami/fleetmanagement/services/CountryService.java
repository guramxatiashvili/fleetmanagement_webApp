package com.gurami.fleetmanagement.services;

import com.gurami.fleetmanagement.models.Country;
import com.gurami.fleetmanagement.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //This will return list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
    //Save new country
    public void saveCountry(Country country){
        countryRepository.save(country);
    }

    //get country by ID
    public Optional<Country> findById(Integer id){
        return countryRepository.findById(id);
    }
}
