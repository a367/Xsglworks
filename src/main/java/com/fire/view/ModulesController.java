package com.fire.view;
import com.fire.bean.Page;
import com.fire.service.mysql.ModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping(value = "/modules",name = "模块系统")
@RestController
public class ModulesController {
    @Autowired
    ModulesService modulesService;
    @PostMapping(value = "/query",name = "查询模块")
    public Object queryById(@RequestParam("modules")List<Integer> modules){
        return modulesService.queryBymodule(modules);
    }
    @GetMapping(value = "/look")
    public Page see(Integer page,Integer limit){
        return modulesService.query(page,limit);
    }
    @PostMapping(value = "insert")
    public Integer modulesInsert(Integer id, String name){
        return modulesService.modulesInsert(id, name);
    }

    @PostMapping(value = "delete")
    public  Integer modulesDelete(Integer id){
        return  modulesService.modulesDelete(id);
    }

    @PostMapping(value = "update")
    public Integer modulesUpdate(Integer id, String name){
        return modulesService.modulesUpdate(id,name);
    }
}
