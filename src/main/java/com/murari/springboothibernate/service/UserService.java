package com.murari.springboothibernate.service;


import com.murari.springboothibernate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kranthi on 9/22/2017.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List getUserDetails() {
        return userDao.getUserDetails();
    }
}
