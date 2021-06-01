package com.thread;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-03-04
 */
public class FutureTaskTest {

    public static void main(String[] args) throws Exception {
        FutureTask futureTask = new FutureTask(() -> {
            System.out.println("future task start");
            return "SUCCESS";
        });
        futureTask.run();
        String result = (String) futureTask.get(5, TimeUnit.SECONDS);
        System.out.println("result = " + result);
        TimeUnit.SECONDS.sleep(5);
    }

}
