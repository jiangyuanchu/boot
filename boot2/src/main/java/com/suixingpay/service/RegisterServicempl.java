package com.suixingpay.service;

import com.suixingpay.dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServicempl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;

    @Override
    public String getPassword(String username) {
        System.out.println(registerDao.getPassword(username));
        return registerDao.getPassword(username);
    }
}
