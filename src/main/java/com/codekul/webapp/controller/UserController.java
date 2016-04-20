/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.webapp.controller;

import com.codekul.webapp.domain.CUser;
import com.codekul.webapp.service.UserService;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aniruddha
 */
@RestController
public class UserController {

    @Autowired
    private UserService serviceUser;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> sampleUser() {

        Map<String, Object> mapEntity = new HashMap<>();

        CUser user = new CUser();
        user.setUserName("android");
        user.setPassword("android");

        mapEntity.put("status", "success");
        mapEntity.put("msg", "This is simple user");
        mapEntity.put("user", user);

        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Map<String, Object>> entity = new ResponseEntity<>(mapEntity, headers, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> saveUser(@RequestBody CUser user) {

        Map<String, Object> mapEntity = new HashMap<>();
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Map<String, Object>> entity = null;
        try {
            serviceUser.insert(user);
            
            mapEntity.clear();
            mapEntity.put("status", "success");
            mapEntity.put("msg", "user inseted successfully..");
            entity = new ResponseEntity<>(mapEntity, headers, HttpStatus.OK);
        } catch (Exception ex) {
            mapEntity.clear();
            mapEntity.put("status", "fail");
            mapEntity.put("msg", "Problem is creating new user");
            entity = new ResponseEntity<>(mapEntity, headers, HttpStatus.BAD_REQUEST);
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return entity;
    }
}
