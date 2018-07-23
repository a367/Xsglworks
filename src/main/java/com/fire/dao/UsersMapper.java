package com.fire.dao;

import com.fire.bean.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersMapper {

    Integer deleteById(String id);

//    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

//    int updateByPrimaryKey(Users record);

     Users selectUserByNameAndPass(@Param("name") String name,@Param("pass") String pass);

     int updateWord(Users record);

     Integer updatePass(@Param("id") String id,@Param("pass") String pass);

     Integer insertQuery(@Param("id") String id,@Param("name") String name,@Param("password")String password);

     List<Users> queryUsers();

}