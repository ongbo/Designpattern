package com.ongbo.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NormalHandler implements InvocationHandler {
    /**这里是自己写的逻辑而已，引入的是真实主题的关联*/
    private Object obj = null;
    Class cls = null;
    public NormalHandler(Object obj){
        this.obj = obj;
    }
    /**这是实现Invocationhandler必须实现的方法
     * 可以看到里面使用了反射，来调用方法了。
     * */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        return result;
    }
}
