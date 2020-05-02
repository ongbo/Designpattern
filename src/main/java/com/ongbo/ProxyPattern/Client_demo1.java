package com.ongbo.ProxyPattern;


public class Client_demo1 {
    public static void main(String[] args) {
        SubObject gameuser = new RealSubObject("ongbo");
        gameuser.login("xxxx","xxxxx");
        gameuser.kill();
        gameuser.upgrade();
    }
}
