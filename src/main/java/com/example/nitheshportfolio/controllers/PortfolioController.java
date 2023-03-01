package com.example.nitheshportfolio.controllers;

import com.example.nitheshportfolio.models.DynamicProfileResponseObject;
import com.example.nitheshportfolio.models.UserDetailsModel;
import com.example.nitheshportfolio.services.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class PortfolioController {
    private UserDetailService userDetailService;
    @Autowired
    @PutMapping("update/user")
    ResponseEntity<DynamicProfileResponseObject<UserDetailsModel>> updateUser(

    )
}
