package com.ongbo.ProxyPattern;

/**
 * 抽象主题接口角色
 * */
public interface SubObject {
    /**
     * 正常代理的请求方法
     */
    public void request();
    /**
     * 本篇博客用例使用的代理方法
     * 平常开发不需要
     * */
    public void login(String user,String password);
    public void kill();
    public void upgrade();
}
