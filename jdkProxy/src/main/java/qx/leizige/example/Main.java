package qx.leizige.example;

/**
 * @author leizige
 * 2022/03/23
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = (Dog) ProxyFactory.getProxy(Dog.class);
        dog.doSomeThing();

        Cat cat = (Cat) ProxyFactory.getProxy(Cat.class);
        cat.doSomeThing();


    }

}
