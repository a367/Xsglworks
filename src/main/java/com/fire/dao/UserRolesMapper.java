package com.fire.dao;
import com.fire.bean.UserRoles;
import java.util.List;
public interface UserRolesMapper {

    int deleteByPrimaryKey(String id);

    int insert(UserRoles record);

    int insertSelective(UserRoles record);

    UserRoles selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRoles record);

    int updateByPrimaryKey(UserRoles record);

    List<Integer> queryByUserId(String id);

}