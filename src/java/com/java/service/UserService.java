/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.service;

import com.java.Dao.UserDao;

public class UserService 
{
    public static boolean insertUserDetails(String[] data){
        UserDao userDao=new UserDao();
        boolean status=userDao.insertUserdeatils(data);
        return status;
    }
}
