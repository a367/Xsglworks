package com.fire.service.mysql;
import com.fire.bean.Modules;
import com.fire.bean.Page;
import com.fire.dao.ModulesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModulesService {
    @Autowired
    ModulesMapper modulesMapper;
    public  Object queryBymodule(List<Integer> modules) {
        return modulesMapper.queryBymodule(modules);
    }

    public Page query(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        PageInfo pageInfo=new PageInfo(modulesMapper.queryModules());
        return new Page(pageInfo,0);
    }
    public Integer modulesInsert(Integer id,String name){
        return modulesMapper.modulesInsert(id,name);
    }
    public  Integer modulesDelete(Integer id){
        return modulesMapper.modulesDelete(id);
    }
    public Integer modulesUpdate(Integer id, String name){
        return modulesMapper.modulesUpdate(id,name);
    }
}
