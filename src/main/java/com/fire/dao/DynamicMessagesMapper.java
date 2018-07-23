package com.fire.dao;

import com.fire.bean.DynamicMessages;

public interface DynamicMessagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynamicMessages record);

    int insertSelective(DynamicMessages record);

    DynamicMessages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynamicMessages record);

    int updateByPrimaryKey(DynamicMessages record);
}