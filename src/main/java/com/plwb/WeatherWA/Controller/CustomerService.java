package com.plwb.WeatherWA.Controller;

import com.plwb.WeatherWA.User.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final UserRepositiory userRepositiory;

    public CustomerService(UserRepositiory userRepositiory) {
        this.userRepositiory = userRepositiory;
    }

    public List<Customer> getUsers() {
        return userRepositiory.findAll();
    }
    public Customer createUser(Customer customer) {
        return userRepositiory.save(customer);
    }
    public void removeUser(Customer customer) {
        userRepositiory.delete(customer);
    }
}
