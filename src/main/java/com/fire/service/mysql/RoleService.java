package com.fire.service.mysql;

import com.fire.bean.Page;
import com.fire.bean.Roles;
import com.fire.dao.RolesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RolesMapper rolesMapper;

   public Page selectByAll(Integer page,Integer limit){
       PageHelper.startPage(page,limit);
       PageInfo pageInfo=new PageInfo(rolesMapper.selectByAll());
       return new Page(pageInfo,0);
   }
   public Integer addRoles(String id,String name){

       return rolesMapper.addRoles(id,name);

   }
   public Integer delectRoles(String id){

       return rolesMapper.delectRoles(id);

   }
   public  Integer updateRoles(String id,String name){
       return  rolesMapper.updateRoles(id,name);
   }

}
