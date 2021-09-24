package qx.leizige;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 调用处理器实现类
 * 每次生成动态代理类对象时都需要指定一个实现了该接口的调用处理器对象
 */
public class DynamicProxy implements InvocationHandler {

	/* 代理的真实对象 */
	private Object target;
	private Class<?> targetClass;

	/* 构造方法赋值 */
	DynamicProxy(Object targetObject) {
		this.target = targetObject;
		this.targetClass = targetObject.getClass();
	}

	/**
	 * 该方法负责集中处理动态代理类上的所有方法调用。
	 * 调用处理器根据这三个参数进行预处理或分派到委托类实例上反射执行
	 *
	 * @param proxy  代理类实例
	 * @param method 被调用的方法对象
	 * @param args   调用参数
	 * @return invoke 执行结果
	 * @throws Throwable Exception
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("begin");

		/* 具体执行方法 */
		Object invoke = method.invoke(target, args);

		System.out.println("end");
		return invoke;
	}

}
