package com.romec.invoice.model.dao;

import com.romec.invoice.model.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemDao extends JpaRepository<InvoiceItem, Long> {
}
