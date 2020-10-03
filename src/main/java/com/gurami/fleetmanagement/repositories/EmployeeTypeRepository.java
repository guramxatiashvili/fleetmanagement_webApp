package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository <Employee,Integer> {

}
