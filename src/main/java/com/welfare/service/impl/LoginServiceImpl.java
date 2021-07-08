package com.welfare.service.impl;

import com.welfare.entity.Admin;
import com.welfare.mapper.LoginMapper;
import com.welfare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public Admin loginAdmin(Admin admin) {
        return loginMapper.loginAdmin(admin);
    }
}
