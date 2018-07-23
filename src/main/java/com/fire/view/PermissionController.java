package com.fire.view;
import com.fire.bean.Permission;
import com.fire.service.mysql.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/permission" ,name = "权限模块")
@CrossOrigin
public class PermissionController {
    @Autowired
    PermissionService permissionService;
    @GetMapping("/query")
    public List<Permission> queryPer(String rid){
        return permissionService.queryPer(rid);
    }
    @GetMapping("/notquery")
    public List<Permission> queryMyPermission(String rid){

        return permissionService.queryMyPermission(rid);
    }
    @GetMapping("delete")
    public Integer deletePer(Integer id){
        return permissionService.deletePer(id);
    }
    @GetMapping("insert")
    public  Integer inertPer(String  roleId,Integer perId){

        return permissionService.insertPer(perId,roleId);
    }
}
