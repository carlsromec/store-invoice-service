package com.romec.invoice.model.service;

import com.romec.invoice.model.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    public List<Invoice> findAllInvoice();

    public Invoice createInvoice(Invoice invoice);
    public Invoice updateInvoice(Invoice invoice);
    public Invoice deleteInvoice(Invoice invoice);

    public Invoice getInvoice(Long id);
}
