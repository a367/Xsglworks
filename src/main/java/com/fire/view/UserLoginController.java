package com.fire.view;
import com.fire.bean.Page;
import com.fire.bean.Users;
import com.fire.service.mysql.AskersService;
import com.fire.service.mysql.RoleModulesService;
import com.fire.service.mysql.UserRolesService;
import com.fire.service.mysql.UsersService;
import com.fire.util.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/users",name = "登录用户")
public class UserLoginController {
    @Autowired
    UsersService usersService;
    @Autowired
    RoleModulesService roleModulesService;
    @Autowired
    UserRolesService userRolesService;
    @Autowired
    AskersService askersService;
    @Autowired
    HttpServletRequest request;

    @PostMapping(value = "/login", name = "登录")
    public Page userlogin(String loginname, String password) {
        Users users = usersService.selectUserByNameAndPass(loginname, password);
        if (users == null) {
            return new Page("用户名或密码错误", 1);
        }
        //得到所有权限
        List<Integer> user_rolesID = userRolesService.queryByUserId(users.getId());
        List<Integer> user_moduleID = null;
        if (user_rolesID != null) {
            user_moduleID = roleModulesService.queryByRoleId(users.getId());
        }
        String user_askerID = askersService.queryByName(users.getLoginname());
        LoginResult loginResult = new LoginResult(users.getLoginname(), users.getPassword(), user_rolesID, user_moduleID, user_askerID);
        System.out.println(loginResult);
        return new Page("用户名或密码错误", 1);
    }

}
