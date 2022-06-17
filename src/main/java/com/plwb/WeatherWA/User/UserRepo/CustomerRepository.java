package com.plwb.WeatherWA.User.UserRepo;


import com.plwb.WeatherWA.User.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findUserById(Integer id);
}
