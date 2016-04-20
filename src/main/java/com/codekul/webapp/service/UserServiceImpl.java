/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.webapp.service;

import com.codekul.webapp.domain.CUser;
import com.codekul.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aniruddha
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Boolean login(String userName, String password) throws Exception {
        
        return userRepository.login(userName, password);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(CUser t) throws Exception {
        userRepository.insert(t);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CUser query(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
