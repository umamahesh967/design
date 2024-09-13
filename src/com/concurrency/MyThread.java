package com.concurrency;

public class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(Thread.currentThread().getName()+ " Main");
    }
}
