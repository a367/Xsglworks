package com.fire.dao;
import com.fire.bean.Students;

import java.util.List;
public interface StudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);

    List<Students> selectStudent();

    List studentByAskID(String askerId);

    Integer deletestu(Integer id);
}