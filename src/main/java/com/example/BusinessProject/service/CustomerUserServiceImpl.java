package com.example.BusinessProject.service;

import com.example.BusinessProject.dto.Clients;
import com.example.BusinessProject.dto.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerUserServiceImpl implements CustomerUserService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerUserServiceImpl.class);
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Clients> getAllClients() {
        List<Clients> clients;
        try {
            clients = customerRepository.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.error("Get all  customer user error: ", e.getMessage());
            throw new RuntimeException(e);
        }
        return clients;
    }

    @Override
    public Clients saveClient(Clients client) {
        Clients clients;
        try {
            clients = customerRepository.save(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.error("create customer user error: ", e.getMessage());
            throw new RuntimeException();
        }
        return clients;
    }


}
