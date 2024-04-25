package com.example.BusinessProject.service;

import com.example.BusinessProject.dto.Admin;
import com.example.BusinessProject.dto.AdminRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService{

    private static final Logger logger = LoggerFactory.getLogger(CustomerUserServiceImpl.class);

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmin(){
        List<Admin> admin;
        try {
            admin = adminRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            logger.error("Get all  customer user error: ", e.getMessage());
            throw new RuntimeException(e);
        }
        return admin;
    }


}
