package com.lqstudy.test.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @description
 * @create 2017-02-23 上午12:00
 * @email gxz04220427@163.com
 */

public interface IAsyncTaskService {

    public void executeAsyncTask(int i);
}
