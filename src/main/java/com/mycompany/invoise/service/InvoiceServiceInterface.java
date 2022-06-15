package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Service;


public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
