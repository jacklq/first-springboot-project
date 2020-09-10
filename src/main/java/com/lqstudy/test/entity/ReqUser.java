package com.lqstudy.test.entity;


import javax.validation.constraints.NotBlank;

public class ReqUser {


    private String name ;
    private String password ;

    @NotBlank(message = "用户名不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
