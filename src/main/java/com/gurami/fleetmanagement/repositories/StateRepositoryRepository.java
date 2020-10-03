package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepositoryRepository extends JpaRepository <State,Integer> {

}
