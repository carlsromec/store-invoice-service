package com.romec.invoice.model.dao;

import com.romec.invoice.model.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice,Long> {
    public List<Invoice> findByCustomerID(Long customerID);
    public Invoice findByNumberInvoice(String numberInvoice);
}
