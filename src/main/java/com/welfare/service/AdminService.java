package com.welfare.service;

import com.welfare.entity.Admin;

import java.util.List;

public interface AdminService {
    /***
     * 管理员信息列表-A401
     * 显示管理员列表。
     */
    List<Admin> findAllAdmin();

    /***
     * 添加管理员-A402
     * 添加管理员信息
     */
    Integer addAdmin(Admin admin);

    /***
     * 删除管理员-A403
     * 删除管理员信息。
     */
    Integer delAdmin(Admin admin);

    /***
     * 初始密码-A404
     * 系统管理员可以对其他管理员的密码进行初始化操作。
     * 初始化后的密码为:123123
     */
    Integer initAdminPwd(Admin admin);

    /***
     * 修改密码-A405
     * 已登录的账户可以修改本账户的登录密码。
     */
    Integer updatePwd(Admin admin);
}
