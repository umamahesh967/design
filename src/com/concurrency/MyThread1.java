package com.concurrency;

public class MyThread1 implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Child1");
    }

    public static void main(String[] args)
    {
        MyThread1 main = new MyThread1();
        Thread thread = new Thread(main);
        thread.start();
        System.out.println(thread.getName()+ " cHILD");
        System.out.println(Thread.currentThread().getName()+ " Main");
    }
}
