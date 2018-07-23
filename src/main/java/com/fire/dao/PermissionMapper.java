package com.fire.dao;

import com.fire.bean.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permissionid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    List<Permission> queryPer(String rid);
    Integer deletePer(Integer id);
    Integer insertPer(@Param("perid") Integer perid,@Param("rolesid") String rolesid);

    List<Permission> queryMyPermission(String rid);
}