package com.fire.dao;

import com.fire.bean.Roles;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(String id);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByAll();

    int updateByPrimaryKeySelective(Roles record);

    Integer addRoles(@Param("id") String id,@Param("name") String name);

    Integer delectRoles(@Param("id") String id);
    Integer updateRoles(@Param("id") String id ,@Param("name") String name);

    int updateByPrimaryKey(Roles record);
}