package com.fire.util;

public class StudentResult {
    private Integer Id;
    private String name;
    private Integer age;
    private String sex;
    private String phone;
    private String stustatus;
    private String perstate;

    public StudentResult(Integer id, String name, Integer age, String sex, String phone, String stustatus, String perstate) {
        Id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.stustatus = stustatus;
        this.perstate = perstate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStustatus() {
        return stustatus;
    }

    public void setStustatus(String stustatus) {
        this.stustatus = stustatus;
    }

    public String getPerstate() {
        return perstate;
    }

    public void setPerstate(String perstate) {
        this.perstate = perstate;
    }
}
