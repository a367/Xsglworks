package com.fire.util;

import com.fire.bean.Askers;

import java.util.List;

public class LoginResult {
    private String loginname;
    private String password;
    private List<Integer> user_rolesID;
    private List<Integer> user_moduleID;
    private String user_askerID;
    public LoginResult(String loginname, String password, List<Integer> user_rolesID, List<Integer> user_moduleID,String user_askerID) {
        super();
        this.user_askerID=user_askerID;
        this.loginname = loginname;
        this.password = password;
        this.user_rolesID = user_rolesID;
        this.user_moduleID = user_moduleID;
    }

    public String getUser_askerID() {
        return user_askerID;
    }

    public void setUser_askerID(String user_askerID) {
        this.user_askerID = user_askerID;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getUser_rolesID() {
        return user_rolesID;
    }

    public void setUser_rolesID(List<Integer> user_rolesID) {
        this.user_rolesID = user_rolesID;
    }

    public List<Integer> getUser_moduleID() {
        return user_moduleID;
    }

    public void setUser_moduleID(List<Integer> user_moduleID) {
        this.user_moduleID = user_moduleID;
    }
}
