package com.fire.service.mysql;

import com.fire.bean.UserRoles;
import com.fire.dao.UserRolesMapper;
import com.fire.util.SystemMethodLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolesService {
@Autowired
private UserRolesMapper userRolesMapper;
    @SystemMethodLog(describe = "获得用户角色ID")
    public List<Integer> queryByUserId(String id) {

        return userRolesMapper.queryByUserId(id);

    }
}
