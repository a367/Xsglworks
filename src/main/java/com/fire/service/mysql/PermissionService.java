package com.fire.service.mysql;

import com.fire.bean.Permission;
import com.fire.dao.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    public List<Permission> queryPer(String rid){
        return permissionMapper.queryPer(rid);

    }
    public List<Permission> queryMyPermission(String rid){
        return permissionMapper.queryMyPermission(rid);

    }

    public Integer deletePer(Integer id){
        return permissionMapper.deletePer(id);
    }
    public Integer insertPer(Integer perid,String rolesid){
        return  permissionMapper.insertPer(perid,rolesid);
    }
}
