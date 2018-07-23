package com.fire.dao;
import com.fire.bean.Askers;
public interface AskersMapper {

    int deleteByPrimaryKey(String askerid);

    int insert(Askers record);

    int insertSelective(Askers record);

    Askers selectByPrimaryKey(String askerid);

    int updateByPrimaryKeySelective(Askers record);

    int updateByPrimaryKey(Askers record);

    String queryByName(String loginname);
}