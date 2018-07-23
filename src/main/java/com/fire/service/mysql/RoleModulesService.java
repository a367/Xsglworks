package com.fire.service.mysql;

import com.fire.dao.RoleModulesMapper;
import com.fire.util.SystemMethodLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleModulesService {
    @Autowired
    private RoleModulesMapper roleModulesMapper;
    @SystemMethodLog(describe = "查询系统权限")
    public List<Integer> queryByRoleId(String id) {
            return roleModulesMapper.queryByRoleId(id);
    }


}
