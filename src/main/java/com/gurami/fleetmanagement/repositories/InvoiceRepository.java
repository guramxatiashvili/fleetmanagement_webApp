package com.gurami.fleetmanagement.repositories;

import com.gurami.fleetmanagement.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository <Invoice,Integer> {

}
