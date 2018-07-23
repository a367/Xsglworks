package com.fire.view;
import com.fire.bean.Page;
import com.fire.bean.Users;
import com.fire.service.mysql.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping(value = "/users",name = "用户管理")
public class UsersController {
    @Autowired
    UsersService usersService;
    @PostMapping(value = "/updateWord",name="更新密码")
    public int updateWord(Users users){
       return usersService.updateWord(users);
    }
     @PostMapping("/updatePwd")
     public Integer updatePass(String id,String pass){
        return usersService.updatePass(id,pass);
     }
     @GetMapping( value = "/queryUsers",name = "查询所有用户")
     public Page queryUsers(Integer page,Integer limit){
         return usersService.queryUsers(page,limit);
     }
     @PostMapping("/delete")
    public Integer deleteById( String id){
        return usersService.deleteById(id);
     }
     @PostMapping("/insert")
    public Integer insertQuery(String id ,String name,String password){
        return  usersService.insertQuery(id ,name,password);
     }

}
