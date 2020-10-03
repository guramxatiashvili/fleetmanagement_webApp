package com.gurami.fleetmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gurami.fleetmanagement.models.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client,Integer> {

}
