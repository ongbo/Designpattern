package com.ongbo.ProxyPattern;
/**
 * 代理主题角色
 * */
public class ObjectProxy implements SubObject {
    /** 保存一个真实主题角色，在构造方法传入关联真实主题角色*/
    private SubObject subObject = null;
    public ObjectProxy(SubObject subObject){
        this.subObject = subObject;
    }
    public ObjectProxy(String name){
        SubObject realObject = new RealSubObject(name);
        this.subObject = realObject;
    }

    /** 下面就用上面关联的真实主题角色对象来操控访问 */
    public void request() {}
    public void login(String user, String password) {
        this.subObject.login(user,password);
    }
    public void kill() {
        this.subObject.kill();
    }
    public void upgrade() {
        this.subObject.upgrade();
    }
}
