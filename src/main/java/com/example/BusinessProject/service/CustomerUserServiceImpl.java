package com.example.BusinessProject.serviceimpl;

import ch.qos.logback.core.net.server.Client;
import com.example.BusinessProject.dto.Clients;
import com.example.BusinessProject.dto.CustomerRepository;
import com.example.BusinessProject.service.CustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerUserServiceImpl implements CustomerUserService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Clients> getAllClients(){
        try {
            List<Clients> clients = customerRepository.findAll();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
