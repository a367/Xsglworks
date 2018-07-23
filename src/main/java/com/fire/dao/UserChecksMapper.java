package com.fire.dao;

import com.fire.bean.UserChecks;

public interface UserChecksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserChecks record);

    int insertSelective(UserChecks record);

    UserChecks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserChecks record);

    int updateByPrimaryKey(UserChecks record);
}