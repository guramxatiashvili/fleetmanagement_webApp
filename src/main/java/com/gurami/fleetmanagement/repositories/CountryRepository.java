package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository <Country,Integer> {

}
