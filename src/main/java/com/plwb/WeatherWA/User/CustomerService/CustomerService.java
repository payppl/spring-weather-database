package com.plwb.WeatherWA.User.CustomerService;

import com.plwb.WeatherWA.User.UserRepo.CustomerRepository;
import com.plwb.WeatherWA.User.Customer.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getUsers() {
        return customerRepository.findAll();
    }
    public Customer createUser(Customer customer) {
        return customerRepository.save(customer);
    }
    public void removeUser(Customer customer) {
        customerRepository.delete(customer);
    }
}
