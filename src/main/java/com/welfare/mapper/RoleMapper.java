package com.welfare.mapper;

import com.welfare.entity.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleMapper {

    /***
     * 角色信息列表-A501
     * 显示角色列表。
     */
    @Select("select roleId,roleName from tb_role")
    List<Role> selectAllRole();

    /***
     * 添加角色-A502
     * 添加角色信息。
     */
    @Insert("insert into tb_role (roleId,roleName) values (#{roleId},#{roleName})")
    Integer insertRole(Role role);

    /***
     * 删除角色-A503
     * 删除已存在的角色信息。
     */
    @Delete("delete from tb_role where roleId=#{roleId}")
    Integer delRole(Role role);

    /***
     *修改角色-A504
     * 修改已存在的角色信息。
     */
    @Update("update tb_role set roleName=#{roleName} where roleId=#{roleId}")
    Integer updateRole(Role role);
}
