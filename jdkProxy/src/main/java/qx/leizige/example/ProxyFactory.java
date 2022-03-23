package qx.leizige.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxy(Class<?> clazz) {
        InvocationHandler proxy = new AnimalProxy();
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz} , proxy);
    }

}
