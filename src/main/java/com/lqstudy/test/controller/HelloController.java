package com.lqstudy.test.controller;
import com.lqstudy.test.entity.UserEntity;
import com.lqstudy.test.service.IAsyncTaskService;
import com.lqstudy.test.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


    /*浏览器输入：http://localhost:8088/sptest/hello
* */
@RestController
public class HelloController {
    @Autowired
    private IAsyncTaskService asyncTaskService;
    @Autowired
    private UserServiceImpl userService ;

    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public  String sayHello()
    {
        String hello="Return  HelloSpring Boot";
        for (int i = 0; i < 20; i++) {
            asyncTaskService.executeAsyncTask(i);
        }
        return hello;
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public UserEntity test(@PathVariable Integer id){
        UserEntity userEntity=userService.getById(id);
        System.out.println("result:" + userEntity);
        return userEntity;
    }
}