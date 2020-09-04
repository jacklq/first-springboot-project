package com.lqstudy.test.controller;
import com.lqstudy.test.service.IAsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/*浏览器输入：http://localhost:8088/sptest/hello
* */
@RestController
public class HelloController {
    @Autowired
    private IAsyncTaskService asyncTaskService;


    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public  String sayHello()
    {
        String hello="Return  HelloSpring Boot";
        for (int i = 0; i < 20; i++) {
            asyncTaskService.executeAsyncTask(i);
        }

        return hello;
    }
}