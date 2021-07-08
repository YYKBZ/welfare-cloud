package com.welfare.service;

import com.welfare.entity.Role;

import java.util.List;

public interface RoleService {

    /***
     * 角色信息列表-A501
     * 显示角色列表。
     */
    List<Role> selectAllRole();

    /***
     * 添加角色-A502
     * 添加角色信息。
     */
    Integer insertRole(Role role);

    /***
     * 删除角色-A503
     * 删除已存在的角色信息。
     */
    Integer delRole(Role role);

    /***
     *修改角色-A504
     * 修改已存在的角色信息。
     */
    Integer updateRole(Role role);
}
