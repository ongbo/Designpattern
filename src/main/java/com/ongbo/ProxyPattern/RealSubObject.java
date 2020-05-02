package com.ongbo.ProxyPattern;

/**
 * 真实主题
 * 需要实现抽象主题接口
 * */
public class RealSubObject implements SubObject{
    //保存用户名
    private String name = "";
    public RealSubObject(String name){
        this.name = name;
    }

    public void request() {

    }

    public void login(String user, String password) {
        System.out.println("用户"+user+"的用户"+this.name+"登陆了");
    }

    public void kill() {
        System.out.println(this.name+"杀了一个怪物");
    }

    public void upgrade() {
        System.out.println(this.name+"升级了");
    }
}
