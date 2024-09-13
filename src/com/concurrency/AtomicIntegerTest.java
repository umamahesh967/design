package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest
{
    public static void main(String[] args)
    {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.getAndIncrement();
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
        System.out.println(atomicInteger.compareAndSet(2, 5));
        System.out.println(atomicInteger);
    }
}
