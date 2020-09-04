package com.lqstudy.test.service.impl;

import com.lqstudy.test.service.IAsyncTaskService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class AsyncTaskServiceImpl implements IAsyncTaskService {
    @Async
    public void executeAsyncTask(int i) {
        System.out.println("线程" + Thread.currentThread().getName() + " 执行异步任务：" + i);
    }
}