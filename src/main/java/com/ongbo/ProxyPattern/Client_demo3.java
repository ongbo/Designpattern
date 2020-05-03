package com.ongbo.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client_demo3 {
    public static void main(String[] args) {
        /**创建一个真是主题对象*/
        SubObject realObject = new RealSubObject("ongbo");
        /**使用JDK中的InvocationHandler，去实现这个接口，实现类NormalHandler*/
        InvocationHandler invocationHandler = new NormalHandler(realObject);
        /**获得真实主题类的ClassLoader*/
        ClassLoader cl = realObject.getClass().getClassLoader();
        /**使用Proxy.newProxyInstance去构建一个抽象主题的代理*/
        /**参数说明：
         * 第一个参数：ClassLoader，即我们真实主题对象的ClassLoader就行
         * 第二个参数：我们真实主题类实现的接口
         * 第三个参数：我们上面实现的InvocationHandler
         * */
        SubObject newProxyInstance = (SubObject)Proxy.newProxyInstance(cl, realObject.getClass().getInterfaces(), invocationHandler);
        /**调用相应的方法即可*/
        newProxyInstance.login("xx","xxx");
        newProxyInstance.kill();
        newProxyInstance.upgrade();
    }
}
