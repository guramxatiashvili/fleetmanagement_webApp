package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository <VehicleMaintenance,Integer> {

}
