package qx.leizige.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * CGLIB动态代理
 * 2022/03/23
 */
public class CgLibProxy {
    public static void main(String[] args) {

        //在指定目录下生成动态代理类，我们可以反编译看一下里面到底是一些什么东西
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/java_workapace");

        //创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置目标类字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());

        Dog proxyDog = (Dog) enhancer.create();
        proxyDog.eat();

    }
}
