package com.mycompany.invoise.controller.douchette;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice() {
        System.out.println("Usage of a douchette");
        Invoice invoice=new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        invoiceService.createInvoice(invoice);
    }
}
