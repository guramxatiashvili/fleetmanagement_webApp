package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository <VehicleMake,Integer> {

}
