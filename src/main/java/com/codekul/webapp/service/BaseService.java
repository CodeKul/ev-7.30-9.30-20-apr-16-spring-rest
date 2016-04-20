/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.webapp.service;

/**
 *
 * @author aniruddha
 */
public interface BaseService<T> {

    void insert(T t) throws Exception;

    void update(T t) throws Exception;

    void delete(T t) throws Exception;

    T query(T t) throws Exception;
}
