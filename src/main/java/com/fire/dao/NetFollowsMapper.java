package com.fire.dao;

import com.fire.bean.NetFollows;

public interface NetFollowsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetFollows record);

    int insertSelective(NetFollows record);

    NetFollows selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetFollows record);

    int updateByPrimaryKey(NetFollows record);
}