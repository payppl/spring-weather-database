package com.plwb.WeatherWA.Controller;


import com.plwb.WeatherWA.User.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final CustomerService customerService;

    public UserController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value= "/users")
    public String createUser(Model model, @ModelAttribute Customer customerInfo) {
        Customer customer = customerService.createUser(customerInfo);
        return "redirect:/users";
    }

    @GetMapping(value= "/users")
    public String getUser(Model model) {
        List<Customer> users = customerService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("userInfo", new Customer());
        return "users";
    }
    @RequestMapping("/usersdel")
    public String removerUser(Model model, @ModelAttribute(value="cust") Customer customer) {
        customerService.removeUser(customer);
        List<Customer> users = customerService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("userInfo", new Customer());
        return "redirect:/users";
    }
}
