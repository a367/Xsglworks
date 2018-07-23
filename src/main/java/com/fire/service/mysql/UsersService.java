package com.fire.service.mysql;

import com.fire.bean.Page;
import com.fire.bean.Users;
import com.fire.dao.UsersMapper;
import com.fire.util.SystemMethodLog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService {


    @Autowired
     UsersMapper mapper;
    @SystemMethodLog(describe = "用户登录")
    public  Users selectUserByNameAndPass(String loginname, String password) {
            return mapper.selectUserByNameAndPass(loginname,password);
    }
    @SystemMethodLog(describe = "修改密码")
    public int updateWord( Users record){
//        Users users=new Users();
//        users.setId("8");
//        users.setLoginname("诸葛亮");
//        users.setPassword("999999");
        return mapper.updateWord( record);
    }

    public Integer updatePass(String id, String pass) {
        return mapper.updatePass(id,pass);
    }

    public Page queryUsers(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        PageInfo pageInfo=new PageInfo(mapper.queryUsers());
        return new Page(pageInfo,0);
    }
    public Integer deleteById(String id){
        return mapper.deleteById(id);
    }

     public Integer insertQuery(String id ,String name,String password){

       return mapper.insertQuery(id,name,password);

     }

}
