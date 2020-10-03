package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository <VehicleMovement,Integer> {

}
