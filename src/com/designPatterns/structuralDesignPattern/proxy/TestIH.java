package com.designPatterns.structuralDesignPattern.proxy;

import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestIH implements InvocationHandler
{
    public TestIH(String name) {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {

        Method setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});

        if(method.equals(setLocationMethod))
        {

        }
        return null;
    }
}

class Factory
{
    public static Image getProxy(String name)
    {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new TestIH(name));
    }
}