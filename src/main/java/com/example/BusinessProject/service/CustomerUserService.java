package com.example.BusinessProject.service;

import com.example.BusinessProject.dto.Clients;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerUserService {
    List<Clients> getAllClients();
    Clients saveClient(Clients client);
}
