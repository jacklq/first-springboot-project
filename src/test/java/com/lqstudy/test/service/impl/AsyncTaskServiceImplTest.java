package com.lqstudy.test.service.impl;

import com.lqstudy.test.TestApplication;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;


import com.lqstudy.test.service.impl.AsyncTaskServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//在测试类上添加两个注解来实现构建上下文环境的效果
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public  class AsyncTaskServiceImplTest {


    private AsyncTaskServiceImpl asyncTaskService;


    @Before
    public void setUp() throws Exception {
        System.out.println("=====before each=====");
        this.asyncTaskService=new AsyncTaskServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("=====after each=====");
    }


    @Test
    public  void executeAsyncTask() {
        for (int i = 0; i < 20; i++) {
            this.asyncTaskService.executeAsyncTask(i);
        }

    }
}