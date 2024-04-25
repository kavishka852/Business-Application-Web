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

    @PostMapping("/register")
    public Clients addClient(@RequestBody Clients client) {

        return customerUserService.saveClient(client);
    }
}
