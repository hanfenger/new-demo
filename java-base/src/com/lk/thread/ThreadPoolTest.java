package com.lk.thread;

import java.util.concurrent.*;

/**
 * 线程池的使用
 */
public class ThreadPoolTest {

    /**
     *  创建一个线程池（完整入参）
     *  核心线程数为5（corePoolSize）
     *  最大线程数为10（maximumPoolSize）
     *  存活时间为60分钟（keepAliveTime）,
     *  工作队列为LinkedBlockingQueue (workQueue)
     *  线程工厂为默认的DefaultThreadFactory (threadFactory)
     *  饱和策略为AbortPolicy: 抛出异常（handler）
     */
    private static ExecutorService THREAD_POOL = new ThreadPoolExecutor(5,10,60,
            TimeUnit.MINUTES,new LinkedBlockingDeque<Runnable>(),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


}
