package qx.leizige.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 */
public class AnimalProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.isAnnotationPresent(Say.class)){
            // 实例可以通过注解决定如何实现需要的业务操作，这里只是简单的获取注解内容
            Say say = method.getAnnotation(Say.class);
            System.out.println("say = " + say.content());
        }
        return null;
    }
}
