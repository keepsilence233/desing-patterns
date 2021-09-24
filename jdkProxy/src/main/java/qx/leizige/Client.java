package qx.leizige;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author leizige
 * created 2021/09/24
 */
public class Client {
	public static void main(String[] args) {

		Subject realSubject = new RealSubject();

		InvocationHandler invocationHandler = new DynamicProxy(realSubject);

		/* 通过Proxy的newProxyInstance方法来创建代理对象 */
		Subject subject = (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), invocationHandler);

		String rent = subject.rent();
		System.out.println(rent);

		subject.hello("hello");

	}
}
