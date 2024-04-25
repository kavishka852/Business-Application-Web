package com.example.BusinessProject.controller;

import com.example.BusinessProject.dto.Admin;
import com.example.BusinessProject.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @GetMapping("/login")
    public List<Admin> getAllAdmins(){
        return  adminUserService.getAllAdmin();
    }




}
