package com.concurrency;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeFormatter
{
    static int a = 0;
    public static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println(a);
            a++;
            return new SimpleDateFormat("");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };
}

public class ThreadPoolExample
{
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
    private static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat());
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
//            threadPool.submit(() -> {th;});
        }
    }
}
