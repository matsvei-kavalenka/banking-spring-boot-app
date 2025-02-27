package lt.vilniustech.mkavalenka.banking.db;

import lt.vilniustech.mkavalenka.banking.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // customerRepository.save(new Customer("Raj Kumar", "rajkumar@example.com"));
    }
}
