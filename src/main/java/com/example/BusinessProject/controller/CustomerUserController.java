package com.example.BusinessProject.controller;

import com.example.BusinessProject.dto.Clients;
import com.example.BusinessProject.service.CustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
@RequestMapping("/clients")
public class CustomerUserController {
    @Autowired
    private CustomerUserService customerUserService;

    @GetMapping("/login")
    public List<Clients> getAllClients() {

        return customerUserService.getAllClients();
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("client", new Clients());
        return "cus_register";
    }

    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute("client") Clients client) {
        customerUserService.saveClient(client);
        return "redirect:/"; // Redirect to the index page after registration
    }
}
