package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository <Supplier,Integer> {

}
