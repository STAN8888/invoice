package com.mycompany.invoise;


import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Hello world!
 *
 */
@SpringBootConfiguration
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = SpringApplication.run(App.class);
        InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();

    }
}
