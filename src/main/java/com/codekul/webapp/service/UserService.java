/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.webapp.service;

import com.codekul.webapp.domain.CUser;

/**
 *
 * @author aniruddha
 */
public interface UserService extends BaseService<CUser>{
    
    Boolean login(String userName, String password) throws Exception;
}
