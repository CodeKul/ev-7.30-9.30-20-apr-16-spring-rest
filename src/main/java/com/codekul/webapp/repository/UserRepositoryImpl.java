/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.webapp.repository;

import com.codekul.webapp.domain.CUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aniruddha
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public void insert(CUser t) throws Exception {

        String sql = "INSERT INTO codekul_user VALUES (?, ?)";
        
        jdbcTemplate.update(sql,new Object[]{t.getUserName(),t.getPassword()});
    }

    @Override
    public void update(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CUser query(CUser t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean login(String userName, String password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
