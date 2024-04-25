package com.example.BusinessProject.controller;

import com.example.BusinessProject.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;





}
