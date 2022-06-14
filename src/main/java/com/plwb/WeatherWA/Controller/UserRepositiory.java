package com.plwb.WeatherWA.Controller;


import com.plwb.WeatherWA.User.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiory extends JpaRepository<Customer, Integer> {

    Customer findUserById(Integer id);
}
