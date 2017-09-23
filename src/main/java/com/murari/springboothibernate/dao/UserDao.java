package com.murari.springboothibernate.dao;


import com.murari.springboothibernate.entity.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kranthi on 9/22/2017.
 */

@Component
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List getUserDetails() {
        Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
        return criteria.list();
    }

}
