package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository <Location,Integer> {

}
