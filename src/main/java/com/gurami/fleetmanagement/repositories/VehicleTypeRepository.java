package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository <VehicleType,Integer> {

}
