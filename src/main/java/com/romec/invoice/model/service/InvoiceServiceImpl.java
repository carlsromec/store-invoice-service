package com.romec.invoice.model.service;

import com.romec.invoice.model.dao.InvoiceDao;
import com.romec.invoice.model.entity.Invoice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;
    @Override
    public List<Invoice> findAllInvoice() {
        return invoiceDao.findAll();
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        /*Invoice invoiceDB = invoiceDao.findByNumberInvoice(invoice.getNumberInvoice());
        if(invoiceDB!=null){
            return invoiceDB;
        }
        invoice.setState("CREATED");
        invoiceDB = invoiceDao.save(invoice);
        invoiceDB.getItems().forEach(invoiceItem -> {

        });*/
        return null;
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice deleteInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice getInvoice(Long id) {

        return null;
    }
}
