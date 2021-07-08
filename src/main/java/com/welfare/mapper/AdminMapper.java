package com.welfare.mapper;

import com.welfare.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

@Mapper
public interface AdminMapper {

    /***
     * 管理员信息列表-A401
     * 显示管理员列表。
     */
    @Select("select adminId,adminName,adminPwd from tb_admin")
    List<Admin>  findAllAdmin();

    /***
     * 添加管理员-A402
     * 添加管理员信息
     */
    @Select("insert into tb_admin (adminId,adminName,adminPwd) values(#{adminId},#{adminName},#{adminPwd})")
    Integer addAdmin(Admin admin);

    /***
     * 删除管理员-A403
     * 删除管理员信息。
     */
    @Update("update tb_admin set roleId=0 where adminId=#{adminId} ")
    Integer delAdmin(Admin admin);

    /***
     * 初始密码-A404
     * 系统管理员可以对其他管理员的密码进行初始化操作。
     * 初始化后的密码为:123123
     */
    @Update("update tb_admin set adminPwd=123123 where adminId=#{adminId}")
    Integer initAdminPwd(Admin admin);

    /***
     * 修改密码-A405
     * 已登录的账户可以修改本账户的登录密码。
     */
    @Update("update tb_admin set adminPwd=#{adminPwd} where adminId=#{adminId}")
    Integer updatePwd(Admin admin);
}
