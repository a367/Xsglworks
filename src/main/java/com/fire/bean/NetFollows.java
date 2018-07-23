package com.fire.bean;

import java.util.Date;

public class NetFollows {
    private Integer id;

    private Integer studentid;

    private String studentname;

    private Date followtime;

    private Date nextfollowtime;

    private String content;

    private String userid;

    private String followtype;

    private Date createtime;

    private String followstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Date getFollowtime() {
        return followtime;
    }

    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }

    public Date getNextfollowtime() {
        return nextfollowtime;
    }

    public void setNextfollowtime(Date nextfollowtime) {
        this.nextfollowtime = nextfollowtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFollowtype() {
        return followtype;
    }

    public void setFollowtype(String followtype) {
        this.followtype = followtype == null ? null : followtype.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFollowstate() {
        return followstate;
    }

    public void setFollowstate(String followstate) {
        this.followstate = followstate == null ? null : followstate.trim();
    }
}