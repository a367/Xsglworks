package com.fire.dao;

import com.fire.bean.RoleModules;

import java.util.List;

public interface RoleModulesMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleModules record);

    int insertSelective(RoleModules record);

    RoleModules selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleModules record);

    int updateByPrimaryKey(RoleModules record);

    List<Integer> queryByRoleId(String id);
}