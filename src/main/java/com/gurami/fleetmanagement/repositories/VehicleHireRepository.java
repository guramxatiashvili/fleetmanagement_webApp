package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository <VehicleHire,Integer> {

}
