package lt.vilniustech.mkavalenka.banking.controller;

import lt.vilniustech.mkavalenka.banking.db.CustomerRepository;
import lt.vilniustech.mkavalenka.banking.model.Customer;
import lt.vilniustech.mkavalenka.banking.service.CustomerService;
import lt.vilniustech.mkavalenka.banking.service.XMLTransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private XMLTransformationService transformationService;

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer:customers){
            transformationService.transformToXML(customer);
        }
        return ResponseEntity.ok(customers);
    }

}
