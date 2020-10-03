package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository <Vehicle,Integer> {

}
