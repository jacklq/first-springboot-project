package com.lqstudy.test.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public  String sayHello()
    {
        String hello="Return  HelloSpring Boot";

        return hello;
    }
}