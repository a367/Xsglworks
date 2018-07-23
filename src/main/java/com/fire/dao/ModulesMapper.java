package com.fire.dao;

import com.fire.bean.Modules;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Modules record);

    int insertSelective(Modules record);

    Modules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Modules record);

    int updateByPrimaryKey(Modules record);

     List<Modules> queryBymodule(List<Integer> modules);

     List<Modules> queryModules();
     Integer modulesInsert(@Param("id") Integer id, @Param("name") String name);
     Integer modulesDelete(@Param("id") Integer id);
     Integer modulesUpdate(@Param("id") Integer id,@Param("name") String name);

}