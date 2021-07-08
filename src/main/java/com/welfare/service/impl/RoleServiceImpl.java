package com.welfare.service.impl;

import com.welfare.entity.Role;
import com.welfare.mapper.RoleMapper;
import com.welfare.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/***
 * (5)角色管理
 */
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> selectAllRole() {
        return roleMapper.selectAllRole();
    }

    public Integer insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    public Integer delRole(Role role) {
        return roleMapper.delRole(role);
    }

    public Integer updateRole(Role role) {
        return roleMapper.updateRole(role);
    }
}
