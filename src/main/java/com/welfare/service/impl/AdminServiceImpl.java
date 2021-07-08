package com.welfare.service.impl;

import com.welfare.entity.Admin;
import com.welfare.mapper.AdminMapper;
import com.welfare.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> findAllAdmin() {
        return adminMapper.findAllAdmin();
    }

    public Integer addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    public Integer delAdmin(Admin admin) {
        return adminMapper.delAdmin(admin);
    }

    public Integer initAdminPwd(Admin admin) {
        return adminMapper.initAdminPwd(admin);
    }

    public Integer updatePwd(Admin admin) {
        return adminMapper.updatePwd(admin);
    }
}
