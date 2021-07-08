package com.welfare.mapper;

import com.welfare.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select  adminName,adminPwd from tb_admin where adminName=#{adminName} and adminPwd=#{adminPwd}")
    Admin loginAdmin(Admin admin);
}
