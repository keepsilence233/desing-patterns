package qx.leizige.sigleton;

/**
 * 双重校验锁 单例模式
 */

/**
 * link ： https://www.cnblogs.com/leizzige/p/14019057.html
 */
public class Singleton {

    /* 保证 instance 在所有线程中同步 */
    public static volatile Singleton instance;

    /* private 避免类在外部被实例化 */
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
