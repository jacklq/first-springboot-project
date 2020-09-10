package com.lqstudy.test.controller;
import com.lqstudy.test.entity.ReqUser;
import com.lqstudy.test.entity.UserEntity;
import com.lqstudy.test.service.IAsyncTaskService;
import com.lqstudy.test.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/*浏览器输入：http://localhost:8088/sptest/hello
* */
@RestController
public class HelloController {
    @Autowired
    private IAsyncTaskService asyncTaskService;
    @Autowired
    private UserServiceImpl userService ;


    @RequestMapping(value = "/hello",method= RequestMethod.POST)
    public  String executeAsyncTask()
    {
        String hello="Return  HelloSpring Boot";
        for (int i = 0; i < 20; i++) {
            asyncTaskService.executeAsyncTask(i);
        }
        return hello;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    @ResponseBody
    public UserEntity transisentJson(@RequestBody @Valid ReqUser reqUser){
        String name=reqUser.getName();
        UserEntity userEntity=userService.getByFirstName(name);
        System.out.println("result:" + userEntity);

        return userEntity;
    }
}