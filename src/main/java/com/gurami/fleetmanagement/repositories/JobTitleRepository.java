package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository <JobTitle,Integer> {

}
