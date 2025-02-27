package lt.vilniustech.mkavalenka.banking.service;

import lt.vilniustech.mkavalenka.banking.db.CustomerRepository;
import lt.vilniustech.mkavalenka.banking.model.Customer;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
