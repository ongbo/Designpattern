package com.ongbo.ProxyPattern;

public class Client_demo2 {
    public static void main(String[] args) {
        //定义一个游戏上瘾的玩家，或者一个爱学习的但是要刷客的学生，即真实主题对象
        SubObject realObject = new RealSubObject("ongbo");
        //然后创建一个代理主题对象，并且将其与真实主题对象相关联
        SubObject ProxyObject = new ObjectProxy(realObject);

        /**接下来全部使用代理主题对象去操作*/
        ProxyObject.login("xxxx","xxx");
        ProxyObject.kill();
        ProxyObject.upgrade();
    }
}
