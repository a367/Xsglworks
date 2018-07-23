package com.fire.view;

import com.fire.bean.Page;
import com.fire.service.mysql.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/roles")
@CrossOrigin
public class RolesController {
    @Autowired
    RoleService roleService;
   @GetMapping("/select")
    public Page selectByAll(Integer page,Integer limit){
        return roleService.selectByAll(page,limit);
    }
    @PostMapping("/insert")
    public Integer addRoles(String id, String name){
       return  roleService.addRoles(id,name);
    }
    @PostMapping("/delete")
    public Integer deleteRoles(String id){
       return roleService.delectRoles(id);
    }
    @PostMapping("/update")
    public  Integer updateRoles(String id,String name){
       return  roleService.updateRoles(id, name);
    }
}
